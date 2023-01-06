/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java8.lambdaexpression;

/**
 *
 * @author Kusal Shanuka
 */

//Consumer Interface (SAM Interface - Single Abstract Method Interface)
interface A{

    void print();
    
}

class XYZ implements A{

    @Override
    public void print() {
        System.out.println("print : class implementation");
    }
}

public class LambdaExpression {
    
    public static void main(String[] args) {
        
        A obj;
        
        obj = new XYZ();
        obj.print();
        
        obj = new A() {
            @Override
            public void print() {
                System.out.println("print : annonimus inner class implementation");
            }
        };
        
        obj.print();
        
        
        obj = () -> {
                System.out.println("print : lambda step 1");
            };
        
        obj.print();
        
        obj = () -> System.out.println("print : lambda step 2");
        
        obj.print();
        
        B obj2;
        
        obj2 = (int i) -> System.out.println("print : lambda step "+i);
        
        obj2.print(3);
        
        obj2 = i -> System.out.println("print : lambda step "+i);
        
        obj2.print(4);
        
        C obj3;
        
        obj3 = (i,i2)-> System.out.println("print : lambda step "+(i+i2));
        
        obj3.print(4,1);
        
        D obj4;
        
        obj4 = (i,i2)-> System.out.println("print : lambda step "+(i+i2));
        
        obj4.print(4,2);
        
    }
    
}

//Consumer Interface (SAM Interface - Single Abstract Method Interface)
interface B{

    void print(int i);
    
}

//Consumer Interface (SAM Interface - Single Abstract Method Interface)
interface C{

    void print(int i, int i2);
    
}

//Consumer Interface (SAM Interface - Single Abstract Method Interface)
interface D{

    void print(int i, double i2);
    
}
