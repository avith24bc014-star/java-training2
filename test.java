package code;

import java.util.ArrayDeque;
import java.util.Deque;

public class test {
    public static void main(String[] args) {
        Deque<Integer> d=new ArrayDeque<>();
        d.offerLast(10);
        d.offerFirst(20);
        d.offerFirst(40);
        System.out.println(d);


    }
}
