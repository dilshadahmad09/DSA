package JavaLang.core_java;

public class Factorial {
    public static int factorial(int num) {
        if (num != 0) {
            return num * factorial(num - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Integer result = factorial(4);
        Factorial f = new Factorial();
        System.out.println(result instanceof Integer);
        System.out.println(f instanceof Factorial);
    }
}
