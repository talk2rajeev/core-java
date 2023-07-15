package coreJava.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> marksMap = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter Maths mark");
        int mathMark = sc.nextInt();
        marksMap.put("Math", mathMark);

        System.out.println("Please enter physics mark");
        int physicsMark = sc.nextInt();
        marksMap.put("Physics", physicsMark);

        System.out.println("Please enter chemistry mark");
        int chemistryMark = sc.nextInt();
        marksMap.put("Chemistry", chemistryMark);

        System.out.println("Math mark: "+ marksMap.get("Math"));
        System.out.println("Physics mark: "+ marksMap.get("Physics"));
        System.out.println("Chemistry mark: "+ marksMap.get("Chemistry"));

        System.out.println("is geography marks recorded= "+ marksMap.containsKey("Hindi"));

        System.out.println("Iterate over hashMap using advance for loop");
        for (Map.Entry<String, Integer> e: marksMap.entrySet()) {
            System.out.println(e.getKey()+ " : "+e.getValue());
        }

    }
}
