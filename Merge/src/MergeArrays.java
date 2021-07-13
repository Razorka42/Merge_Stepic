import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] a1 = new int[]{2, 4, 6, 8, 1000, 1200};
        int[] a2 = new int[]{4, 7, 9, 11, 15};
        int k = a1.length + a2.length;
        int[] c = new int[k];
        for (int f = 0, j = 0; f < a1.length | j < a2.length; ) {
            if (f < a1.length & j < a2.length) {
                if (a1[f] < a2[j]) {
                    c[f + j] = a1[f];
                    f = f + 1;
                } else {
                    c[f + j] = a2[j];
                    j = j + 1;
                }
            }
            if (f < a1.length & j >= a2.length) {
                c[f + j] = a1[f];
                f = f + 1;
            }
            if (f >= a1.length & j < a2.length) {
                c[f + j] = a2[j];
                j = j + 1;
            }

        }
        System.out.println(Arrays.toString(c));
    }

}

