package coreJava;

/*
 * abstract class should be prefixed with abstract keyword
 * abstract class must have minimum one abstract method
 * abstract class can also have its own methods & its implementation (which are not abstract)
 * you can't create object of abstract class but can create reference of it
 *
* */

abstract class Parent {
    abstract public void greet();
    abstract public int sum(int a, int b);
}

class Child extends Parent{
    public Child() {
        super();
    }

    @Override
    public void greet(){
        System.out.println("this is child greet");
    }

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

}

public class AbstractClassExample{
    public static void main(String[] args) {
        Child c = new Child();
        c.greet();
        int sum = c.sum(1,2);
        System.out.println("SUM: "+ sum);
    }
}