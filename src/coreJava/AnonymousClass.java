package coreJava;

public class AnonymousClass {
    public void sayHello() {
        class Greeting {
            public void greet() {
                System.out.println("Good Morning!");
            }
        }
        Greeting gt = new Greeting();
        gt.greet();
    }

    public static void main(String[] args) {
        AnonymousClass ac = new AnonymousClass();
        ac.sayHello();
    }
}
