/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java8.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author Kusal Shanuka
 */
public class StreamAPI {
    public static void main(String[] args) throws Exception{
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }

        list.forEach(i -> System.out.print(i+"|"));
        System.out.println("");
        list.stream().filter(i -> i%2==0).forEach(i -> System.out.print(i+"|"));
        System.out.println("");
        list.stream().sorted((i,i2) -> i2.compareTo(i)).forEach(i -> System.out.print(i+"|"));
        System.out.println("");
        list.stream().sorted((i,i2) -> i2.compareTo(i)).filter(i-> i%10==0).forEach(i -> System.out.print(i+"|"));
        System.out.println("");
        System.out.print(list.stream().sorted((i,i2) -> i2.compareTo(i)).filter(i-> i%5==2).findFirst().orElse(0));
        System.out.println("");
        System.out.print(list.stream().sorted((i,i2) -> i2.compareTo(i)).filter(i-> i%10==0).filter(i-> i%5==2).findFirst().orElse(0));
       
        
        List<Integer> collectedList = list.stream().sorted((i,i2) -> i2.compareTo(i)).filter(i-> i%10==0).collect(Collectors.toList());
        System.out.println("");
        collectedList.forEach(i->System.out.print(i+"|"));
        System.out.println("");
        
    }
}
