package dsaJava;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args){
        Queue<Integer> numbers = new LinkedList<>();

        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        numbers.offer(4);

        int num = numbers.poll();
        int num3 = numbers.poll();
        System.out.println(num3);
        System.out.println(numbers);
    }
}
