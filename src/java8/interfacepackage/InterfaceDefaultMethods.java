/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java8.interfacepackage;

/**
 *
 * @author Kusal Shanuka
 */
public class InterfaceDefaultMethods {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        a.add();
        a.show();
        System.out.println("");
        b.add();
        b.show();
        System.out.println("");
        c.add();
        c.show();
        System.out.println("");
        d.add();
        d.show();
        System.out.println("");
        d.add();
        d.show();

//        We dont need to override show method in A and B because It's implemented interfacers have only single defined show method.
//        But we should override show method in C because its implemented interfacers have multiple defined show methods.
//        In E class it have extended D class which have add method and show method, therefoer we dont need to override add or show methods because class have more power compaired to interface. (Third rules in Java)
//        In Interface F we cant create methods which have same signatures as Object class default methods.
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

class D {

    public void add() {
        System.out.println("D add.");
    }

    public void show() {
        System.out.println("D show.");
    }

}

class E extends D implements One, Two, Three {

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

interface Four {

//    default boolean equals(Object o) {
//        System.out.println("Four equals.");
//        return true;
//    }

}
