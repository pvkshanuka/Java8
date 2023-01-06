/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java8.interfacepackage;

/**
 *
 * @author Kusal Shanuka
 */
public class InterfaceTest1 {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();

        a.add();
        a.show();
        System.out.println("");
        b.add();
        b.show();
        System.out.println("");
        c.add();
        c.show();
        
//        We dont need to override show method in A and B because It's implemented interfacers have only single defined show method.
//        But we should override show method in C because its implemented interfacers have multiple defined show methods

    }

}

class A implements One, Two {

    @Override
    public void add() {
        System.out.println("A impl One, Two add.");
    }

}

class B implements One, Two {

    @Override
    public void add() {
        System.out.println("B impl One, Two add.");
    }

}

class C implements One, Two, Three {

    @Override
    public void add() {
        System.out.println("C impl One, Two, Three add.");
    }

    @Override
    public void show() {
        System.out.println("C impl One, Two, Three show.");
    }
}

interface One {

    void add();

    default void show() {
        System.out.println("One show.");
    }

}

interface Two {

    void add();

}

interface Three {

    void add();

    default void show() {
        System.out.println("Two show.");
    }

}
