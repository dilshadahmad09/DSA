package dsaJava;

import java.util.Iterator;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args){
        Vector<String> vector = new Vector<>();
        vector.add("I");
        vector.add("love");
        vector.add("you");

        Iterator<String> iterator = vector.iterator();
       
        while(iterator.hasNext()){
            System.out.print(iterator.next());
        }
        System.out.println(vector);
    }
}
