package dsaJava;
import java.util.Scanner;
public class Palindrome {
 public static void main(String[] args){
//     int r,sum=0, temp;

//     int n = 000;

//     // now you have to check that is it palindrome or not?

//     temp = n;

//     while(n>0){
        
//         r = n%10;
//         sum = (sum *10) + r;
//         n = n/10;
//     }

//     if(sum == temp){
//         System.out.println(temp + " is palindrome");
//     }else{
//         System.out.println(temp + " is not a palindrome");
//     }
    
 try (Scanner in = new Scanner(System.in)) {
    String original, reverse = "";
    
    System.out.println("Enter String/Number to check Palindrome ");
     original = in.nextLine();
    
     for(int i=original.length()-1; i>=0; i--){
         reverse += original.charAt(i);
     }

     if(original.equals(reverse)){
         System.out.println(original + " is a palindrome");
     }else{
         System.out.println(original + " is not a Palindrome");
     }
     System.out.println(original + " " + reverse);
}
 }
}
