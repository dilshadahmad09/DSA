package dsaJava;

public class Factorial {
    
   static int multiplication(int n){

        if(n == 0) {
            return 1;
        }
        return n * multiplication(n-1);
    }
    public static void main(String[] args){
       System.out.println(multiplication(4));
    }
}
