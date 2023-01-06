/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java8.datetimeapi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

/**
 *
 * @author Kusal Shanuka
 */
public class DateTimeAPI {

//    Old Date API is not thread safe. 
//    There are two Date classes in util and sql.
//    If we need to format date we need to import text package.

//    New date time api in java is first time immutable. (If change the exsisting value it will create a new obj for u)
//    For new java 8 date time we have seprate new package called time.
    
    public static void main(String[] args) {
        
        LocalDate date = LocalDate.now();
        System.out.println(date);
        
        date = LocalDate.of(1995, Month.OCTOBER, 11);
        System.out.println(date);
        
        LocalTime time = LocalTime.now();
        System.out.println(time);
        
        time = LocalTime.of(14, 50,22);
        System.out.println(time);
        
//        ZoneId.getAvailableZoneIds().stream().sorted().forEach(zone-> System.out.println(zone));
        
        time = LocalTime.now(ZoneId.of("Europe/Riga"));
        System.out.println(time);
        
        time = LocalTime.now(ZoneId.of("GMT"));
        Instant instant = Instant.now(); // This gives GMT (UTC) time, this is machine readable. 
        System.out.println(time);
        System.out.println(instant);
        
        System.out.println(LocalDateTime.now(ZoneId.of("UTC")));
        
    }

}
