package coreJava.DSA;

import java.util.ArrayList;

class PairSumExample {
    public ArrayList<ArrayList<Integer>> getPairSum(int[] arr, int target) {
        ArrayList<ArrayList<Integer>> set = new ArrayList<>();
        for(int i=0; i<arr.length-1; i++) {
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(arr[i]);
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == target ) {
                    pair.add(arr[j]);
                    set.add(pair);
                }
            }
        }
        return set;
    }
}


public class PairSum {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> set = new ArrayList<>();

        PairSumExample ps = new PairSumExample();
        int[] arr = {8, 7, 2, 5, 3, 1};
        set = ps.getPairSum(arr, 10);
        System.out.println("Pair Sum: "+set);

        int[] arr1 = {5, 2, 6, 8, 1, 9};
        set = ps.getPairSum(arr1, 12);
        System.out.println("Pair Sum: "+set);

    }
}
