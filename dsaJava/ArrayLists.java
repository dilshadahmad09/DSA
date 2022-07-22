package dsaJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args){
        

        List<Integer> list = new ArrayList<>(Arrays.asList(10,100,1000,10000,1009));
        String str = list.toString();
        System.out.println(str.length());
    }
}
