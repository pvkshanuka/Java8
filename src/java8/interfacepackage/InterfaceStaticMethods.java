/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java8.interfacepackage;

/**
 *
 * @author Kusal Shanuka
 */
public class InterfaceStaticMethods {
    
    public static void main(String[] args) {
        StaticMOne.print();
        StaticMOne.print2();
    }
    
}

interface StaticMOne{

    static void print(){
    
        System.out.println("StaticMOne print.");
        
    }
    
    static void print2(){
    
        System.out.println("StaticMOne print2.");
        
    }
    
}