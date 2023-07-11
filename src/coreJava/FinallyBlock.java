package coreJava;
class TestFinallyBlock {
    int num1;
    int num2;
    TestFinallyBlock(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return this.num1 + this.num2;
    }
    public int onlyPositiveSum() {
        int sum =-1;
        try {
            if(this.num1 < 0 || this.num2 <0) {
                sum = 0;
            }
            sum = this.num1 + this.num2;
        } catch(Exception e) {
            System.out.println(e);
        } finally {
            sum = sum +1;
            System.out.println("Sum oin finally block: "+ sum);
        }
        return sum;
    }
}
public class FinallyBlock {
    public static void main(String[] args) {
        TestFinallyBlock fb = new TestFinallyBlock(2,3);
        int sum = fb.onlyPositiveSum();
        System.out.println("Sum of "+ fb.num1 + " and " + fb.num2 + " is: "+ sum);

        fb.num1 = 100;
        fb.num2 = 150;
        System.out.println(fb.add());
    }
}
