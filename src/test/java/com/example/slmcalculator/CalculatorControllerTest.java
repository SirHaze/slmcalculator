package com.example.slmcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

    private CalculatorController calcController = new CalculatorController();


    @Test
    public void sumTest1(){
        //Arrange
        int a = 6;
        int b = 11;

        //Act
        int result = calcController.sum(a, b);

        //Assert
        assertEquals(17, result);
    }

    @Test
    public void sumTest2(){
        //Arrange
        int a = -6;
        int b = 11;

        //Act
        int result = calcController.sum(a, b);

        //Assert
        assertEquals(5, result);
    }

    @Test
    public void sumTest3(){
        //Arrange
        int a = -6;
        int b = -11;

        //Act
        int result = calcController.sum(a, b);

        //Assert
        assertEquals(-17, result);
    }
}