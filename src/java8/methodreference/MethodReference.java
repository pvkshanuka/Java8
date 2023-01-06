/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java8.methodreference;

import java.util.concurrent.Phaser;

/**
 *
 * @author Kusal Shanuka
 */
interface Parser {

    String parse(String txt);

}

class StringConverter {

    public static String convert(String txt) {

        if (txt.contains(" ")) {
            txt = txt.toUpperCase();
        } else {
            txt = txt.toLowerCase();
        }

        return txt;

    }

    public String nonStaticConvert(String txt) {

        if (txt.contains(" ")) {
            txt = txt.toUpperCase();
        } else {
            txt = txt.toLowerCase();
        }

        return txt;

    }

}

class MyStringPrinter {

    public void print(String txt, Parser parser) {

        txt = parser.parse(txt);
        System.out.println(txt);

    }

}

public class MethodReference {

    public static void main(String[] args) {

        MyStringPrinter myStringPrinter = new MyStringPrinter();

//        Ex 01
        myStringPrinter.print("Kusal Shanuka", new Parser() {
            @Override
            public String parse(String txt) {
                return StringConverter.convert(txt);
            }
        });
        
//        Ex 02
        myStringPrinter.print("Kusal", txt -> StringConverter.convert(txt));

//        Ex 03
        myStringPrinter.print("Kusal Shanuka", StringConverter::convert);

//        Ex 04
        StringConverter stringConverter = new StringConverter();
        myStringPrinter.print("pathira Vasan", stringConverter::nonStaticConvert);

//        We used Functional programming in Ex 03 and 04, which means we passed method inside to a method as a parameter.
        
    }

}
