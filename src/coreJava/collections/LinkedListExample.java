package coreJava.collections;

import java.util.Date;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1,22);
        list.add(2,33);
        list.add(0,100);
        list.add(2,500);
        System.out.println("LinkedList: "+ list);

        list.remove(2);
        System.out.println("LinkedList: "+ list);

        list.addFirst(1111);
        System.out.println("addFirst to LinkedList: "+ list);

        list.addLast(9999);
        System.out.println("addLast to LinkedList: "+ list);


        for (Integer num: list) {
            System.out.println("Item: "+ num);
        }

    }
}
