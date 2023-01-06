/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java8.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Kusal Shanuka
 */


class ConsumerImpl implements Consumer<Integer>{

    @Override
    public void accept(Integer i) {
        System.out.print(i+"|");
    }

}


public class ConsumerInterfaces {
    
    public static void main(String[] args) {
        
        List<Integer> integers = Arrays.asList(3, 56, 47, 8, 6, 6);
        
        Consumer consumer = new ConsumerImpl();
        
        integers.forEach(consumer);
        System.out.println("");
        integers.forEach(i -> System.out.print(i + "|"));
        System.out.println("");
        
//        Above both forEachs are same


//Consumer interface is a SAM Interface (Single Abstract Method) we can use @FunctionalInterface annotation to those kind of interfacers,
//then if developes try to add another method singatuers to that SAM interfac there will be an error in @FunctionalInterface line. 

    }
    
}

interface X{

    void a();
    void b();
}

@FunctionalInterface
interface Y{
    void a();
//    void b();
    //This interface can't have above void b() method because it is annotated with @FunctionalInterface, We identified it as a SAM interface.
}
