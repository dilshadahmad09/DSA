package JavaLang.core_java;

import java.util.Scanner;

public class ScannerObj {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inter input to print the same : ");
        int number = in.nextInt();
        System.out.println();
        String name = in.next();
        System.out.println();
        double d = in.nextDouble();

        System.out.println(number);
        System.out.println(name);
        System.out.println(d);

        in.close();

    }

}
