package dsaJava;

import java.util.Scanner;

public class PrimeNumber {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the no and check isPrime this prime? ");
       int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a prime number");
        }

   }

      public static boolean isPrime(int n){
          if(n <=1){
              return false;
          }
              for(int i=2; i<=Math.sqrt(n); i++){
                  if(n%i == 0){
                      return false;
                  }
              
              
          }
          return true;
      }
       
   
 
}
