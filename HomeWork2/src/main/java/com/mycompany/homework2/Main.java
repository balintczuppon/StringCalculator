/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homework2;

/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] agrs){
        
        StringCalculator calculator = new StringCalculator();
        
        System.out.println(calculator.add(""));
        System.out.println(calculator.add("2"));
        System.out.println(calculator.add("2,3"));
    }
    
}
