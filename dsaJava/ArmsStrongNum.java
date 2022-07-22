package dsaJava;

import java.util.Scanner;

public class ArmsStrongNum {
    static boolean isArmsng(int n){
        int sum = 0, digits=0, temp;
        temp = n;
        int input = n;
        while(temp > 0){
            temp = temp/10;
            digits++;
        }
        temp = n;
        while(n > 0){
            temp = n%10;
            
            sum += (Math.pow(temp, digits));
            n = n/10;
        }

        if(input == sum){
           return true;
        }else{
            return false;
        }
        
    }
  


    public static void main(String[] args){
        int num;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       num = sc.nextInt();
        System.out.println("Print armstrong num up to " + num );
        
        for(int i=0; i<=num; i++){
            if(isArmsng(i)){
                System.out.print(i + " , ");
            }
        }
        
    }
}
