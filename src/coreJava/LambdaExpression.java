package coreJava;

@FunctionalInterface
interface SimpleInterest {
    double getSimpleInterest(int amount, int time);
}
public class LambdaExpression {
    public static void main(String[] args) {
        SimpleInterest siObj = (amount, time) -> {
            // this is getSimpleInterest method implementation
            float roi = 7.5F;
            return (amount * roi * time) /100;
        };
        System.out.println("Simple interest: "+ siObj.getSimpleInterest(15000, 5));
    }
}
