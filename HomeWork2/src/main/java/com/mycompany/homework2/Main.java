/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homework2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] agrs){  
        try {
            StringCalculator calculator = new StringCalculator();
            
            System.out.println(calculator.add(""));
            System.out.println(calculator.add("2"));
            System.out.println(calculator.add("2,3"));
            System.out.println(calculator.add("2,3,10,4,30"));
            System.out.println(calculator.add("1;2"));
            System.out.println(calculator.add("2,3;10\n4|30"));
            System.out.println(calculator.add("2,-3;10\n4|-30"));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
