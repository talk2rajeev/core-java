package coreJava;
/*
* interface can only have methods signature, Fields & default members
* The class implementing interface should define the interface methods
* If The class implementing interface declare same Field then it will override the interface Field
* You can't create interface object but can create reference of interface class
* interface methods are public by default
* interface can have default methods (from javas 8 version onwards)
* default methods can be declared and defined in interface and will be available to its implementing class
* default methods can be override in implementing class
* interface can have private methods with its definition but it can't be accessed outside of interface class
* An interface class can extend another interface class but a simple class can't. Simple class can implement it
* */
interface InterestCalculator {
    float roi = 7.5F;
    double fixedSimpleInterest(double pi, int time);
    double dynamicSimpleInterest(double pi, int time, float rate);

}
class Interest implements InterestCalculator {
    @Override
    public double fixedSimpleInterest(double pi, int time) {
        return  (pi * roi * time)/100;
    }

    @Override
    public double dynamicSimpleInterest(double pi, int time, float rate) {
        return  (pi * rate * time)/100;
    }
}

public  class InterfaceExample {
    public static void main(String[] args) {
        Interest i = new Interest();
        System.out.println("fixedSimpleInterest "+ i.fixedSimpleInterest(10000,10));
        System.out.println("dynamicSimpleInterest "+ i.dynamicSimpleInterest(10000,10, 8.6F));

    }
}
