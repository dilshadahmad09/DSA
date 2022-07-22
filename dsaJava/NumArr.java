package dsaJava;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NumArr {
    public static void main(String[] args) {
        String num = "2932";
        String[] str = num.split("");
        int[] arr = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        int a = 0, b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                a = a * 10 + arr[i];
            } else {
                b = b * 10 + arr[i];
            }
        }
        System.out.println(a + b);
    }
}
