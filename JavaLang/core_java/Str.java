package JavaLang.core_java;

public class Str {
    String name;

    public Str(String n) {
        this.name = n;

        System.out.println(this.name);
        add(this);
        System.out.println(this.name);
    }

    public void add(Str s) {
        s.name = "ahmad";
    }

    public static void main(String[] args) {
        Str s = new Str("Diddfdfdlshad");

    }
}
