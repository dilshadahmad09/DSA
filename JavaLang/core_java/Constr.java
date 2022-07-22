package JavaLang.core_java;

public class Constr {
    int age;
    String name;

    public Constr(int a, String n) {
        this.age = a;
        this.name = n;
    }

    public Constr(String n) {
        this.name = n;
    }

    @Override
    public String toString() {
        return "[" + age + " " + name + "]";
    }
}

class Main {
    public static void main(String[] args) {
        Constr obj = new Constr(10, "dilshad");
        Constr name = new Constr("dilshad");

        System.out.println(name.toString());
        System.out.println(obj.toString());
    }
}
