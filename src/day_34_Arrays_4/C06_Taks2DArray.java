package day_34_Arrays_4;

import java.util.Arrays;

public class C06_Taks2DArray {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(splitArray("merhaba java insanları bugün nasılsınız")));

    }
    /*
    «merhaba java insanları bugün nasılsınız» cümlesini [merhaba, java,
insanları] ve [bugün, nasılsınız] şeklinde 2 ayrı array a convert edin.
     */
    public static String[][] splitArray(String str){
        String[] words=str.split(" ");
        String[] strArr1 = Arrays.copyOfRange(words, 0, 3);
        String[] strArr2 = Arrays.copyOfRange(words, 3, 5);
        String[][] result ={strArr1,strArr2};
        return result;
    }
}
