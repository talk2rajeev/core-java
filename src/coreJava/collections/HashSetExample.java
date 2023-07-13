package coreJava.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSetList = new HashSet<>();

        System.out.println("How many elements you want to add in hashSet");
        Scanner sc= new Scanner(System.in);
        int length = sc.nextInt();

        for(int i=0; i<length; i++) {
            System.out.println("Please enter "+(i+1)+" number");
            int num = sc.nextInt();
            hashSetList.add(num);
        }

        System.out.println("hashSetList = "+ hashSetList);

        System.out.println("Search: Please enter the number you want to search in hashSetList ");
        int num = sc.nextInt();
        if(hashSetList.contains(num)) {
            System.out.println("Yes, hashSetList contains "+ num);
        } else {
            System.out.println("Oops!, hashSetList doesn't contains "+ num);
        }

        System.out.println("Iterate hashSetList");
        Iterator it = hashSetList.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("For loop for hashSetList");
        for (Integer integer : hashSetList) {
            System.out.println(integer);
        }
    }
}
