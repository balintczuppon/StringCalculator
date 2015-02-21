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
public class StringCalculator {

    int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        int sum = 0;
        
        numbers = numbers.replaceAll("[^0-9]", ",");
        
        String[] array = numbers.split(",");
        if (array.length == 2) {
            sum = Integer.valueOf(array[0]) + Integer.valueOf(array[1]);
            return sum;
        }
        for (String string : array) {
            sum += Integer.valueOf(string);
        }
        return sum;
    }
}
