package day02;


class A {
    public A(){
        System.out.println("A");
    }

    public static int a = 100;

    public void methodA(){
        System.out.println("Method A");
    }
}

class B extends A { // Variables: 2, Methods: 2
    public B(){
        super();
        System.out.println("B");
    }
    public static int b = 200;
    public static void methodB(){
        System.out.println("Method B");
    }

    @Override
    public void methodA(){
        System.out.println("method a");
    }

}

class C extends B{ // Variables: 3, Methods: 3
    public C(){
        System.out.println("C");
    }
    public static int c = 300;
    public static void methodC(){
        System.out.println("Method C");
    }
}


public class Inheritance {

    public static void main(String[] args) {

        new B();


    }

}
