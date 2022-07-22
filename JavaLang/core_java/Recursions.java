package JavaLang.core_java;

public class Recursions {
    public static int sumOfNaturalNum(int num) {
        if (num == 0)
            return 0;

        return num + sumOfNaturalNum(num - 1);
    }

    public static void main(String[] args) {
        int result = sumOfNaturalNum(10);
        System.out.println(result);
    }
}
