package com.example;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {

    // test sum method using one number with decimal and one is not
    @Test
    public void testSum() {
        double num1 = 1;
        double num2 = 1.1;
        assertTrue(2.1 == App.sum(num1, num2));

        double num3 = 23;
        double num4 = 5.789;
        assertTrue(28.789 == App.sum(num3, num4));
    }

    // test sum method using two numbers with decimals
    @Test
    public void testSum1() {

        double num1 = 23.45;
        double num2 = 5.7;
        assertTrue(29.15 == App.sum(num1, num2));

        double num3 = 45.12;
        double num4 = 74.345;
        assertTrue(119.465 == App.sum(num3, num4));
    }

    // test sum method using two numbers without decimals
    @Test
    public void testSum2() {

        double num1 = 765412;
        double num2 = 8764;
        assertTrue(774176 == App.sum(num1, num2));

        double num3 = 76;
        double num4 = 99;
        assertTrue(175 == App.sum(num3, num4));
    }

    // test sum method that will not pass for failure scenario 
    
    @Test
    public void testSumThatFail() {
        
        double num1 = 1;
        double num2 = 2;
        assertTrue(0 == App.sum(num1, num2));
    }
    

}
