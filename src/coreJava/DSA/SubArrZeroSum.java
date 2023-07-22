package coreJava.DSA;

import java.util.ArrayList;

class SubArrZeroSumExample {
    int getSum(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer num: arr) {
            sum+=num;
        }
        return sum;
    }
    public ArrayList<ArrayList<Integer>> getPairSum(int[] arr) {
        ArrayList<ArrayList<Integer>> set = new ArrayList<>();
        for(int i=0; i<arr.length-1; i++) {
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(arr[i]);
            for(int j=i+1; j<arr.length; j++) {
                pair.add(arr[j]);
                if(this.getSum(pair) == 0) {
                    set.add(pair);
                    break;
                }
            }
            // pair.clear();
        }
        return set;
    }
}

public class SubArrZeroSum {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> set = new ArrayList<>();

        int[] arr1 = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        SubArrZeroSumExample zs = new SubArrZeroSumExample();
        set = zs.getPairSum(arr1);
        System.out.println("Zero sum arr: "+ set);
    }
}
