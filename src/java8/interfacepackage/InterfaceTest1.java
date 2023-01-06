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

    }

}

class A implements One {

    @Override
    public void add() {
        System.out.println("A impl One add.");
    }

}

class B implements Two {

    @Override
    public void add() {
        System.out.println("B impl Two add.");
    }

}

class C implements One, Two {

    @Override
    public void add() {
        System.out.println("C impl One, Two add.");
    }

    @Override
    public void show() {
        System.out.println("C impl One, Two show.");
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

    default void show() {
        System.out.println("Two show.");
    }

}
