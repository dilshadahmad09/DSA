package dsaJava;

import java.util.Arrays;

public class StringS {
    
   
    public static void main(String[] args){
        

        int[] a = new int[256];
        System.out.println(Arrays.toString(a));
        String name = "Dilshad";
        for(int i=0; i<name.length(); i++){
            a[(int) a.length]++;
        }

        System.out.println(a);
    }
}
