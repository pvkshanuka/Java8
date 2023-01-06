/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java8.foreachmethod;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Kusal Shanuka
 */
public class ForEachMethod {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(3, 56, 47, 8, 6, 6);

        forLoop(integers);
        enhansedForLoop(integers);
        forEach(integers);

    }

//    For Loop : External Loops
    static void forLoop(List<Integer> integers) {

        for (int i = 0; i < integers.size(); i++) {
            System.out.print(integers.get(i) + "|");
        }
        System.out.println("");
    }

//    Enhansed For Loop : External Loops
    static void enhansedForLoop(List<Integer> integers) {

        for (int i : integers) {
            System.out.print(i + "|");
        }
        System.out.println("");
    }

    //    For Each : Internal Loops (Since this is a internal part of collection it will be much faster than External for loops.)
    static void forEach(List<Integer> integers) {

//        This is Lambda expression
        integers.forEach(i -> System.out.print(i + "|"));
        System.out.println("");
        
    }

}
