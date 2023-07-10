package coreJava;

import java.io.InputStream;
import java.util.Scanner;

class ExceptionClass extends  Exception {
    ExceptionClass() {
        super();
    }

    ExceptionClass(String s) {
        super(s);
    }

    public String toString() {
        return "Some exception occurred";
    }

    public String getMessage() {
        return "Some exception occurred";
    }
}

class MarksPercent {
    int studentTotalMarks = 340;
    public double getMarksPercentage(int noOFSubjects) throws ExceptionClass {
        if(noOFSubjects <= 0) {
            throw new ExceptionClass("num Zero exception");
        }
        return (double) studentTotalMarks /noOFSubjects;
    }


}

public class ExceptionHandling {
    public static void main(String[] args) {

        System.out.println("Please enter total no of subjects");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        MarksPercent mp= new MarksPercent();
        try {
            double percent = mp.getMarksPercentage(num);
            System.out.println("Student marks percent: "+ percent + "%");
        } catch(ExceptionClass e) {
            System.out.println("Exception: "+ e);
            System.out.println("Exception: "+ e.getMessage());
        }

        int[] arr = {1,2,3};
        try {
            System.out.println(arr[4]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
