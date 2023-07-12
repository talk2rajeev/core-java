package coreJava.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.add(0);
        numberList.add(1);
        numberList.add(2);

        System.out.println(numberList);
        System.out.println("numberList[1]: "+ numberList.get(1));

        numberList.remove(2);

        System.out.println("numberList after removing 2nd index: "+ numberList);

        System.out.println("adding 33 to 1st index");
        numberList.add(1, 33);
        System.out.println(numberList);

        System.out.println("numberList size or length: "+ numberList.size());

        for (Integer num : numberList) {
            System.out.print(num + " ");
        }

        System.out.println("");
        Collections.sort(numberList);
        System.out.println("Sorted numberList: "+numberList);

    }
}
