package com.javarzn.calculator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CalculatorTest {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        new CalculatorTest();
    }

    public void noTestVoid() {
        System.out.println("---");

    }

    private Calculator calculator;

    public CalculatorTest() throws InvocationTargetException, IllegalAccessException {
        calculator = new Calculator();
//        CalculatorTest cTest = new CalculatorTest();
        for (Method m :
                getClass().getDeclaredMethods()) {
            if (m.isAnnotationPresent(MyTest.class)) {
                m.invoke(this);
            }
        }
    }

    @MyTest
    public void testAdd() {
        System.out.println("Запустили тест сложения");
        calculator.add(2, 2);
    }
    @MyTest
    public void testMinus() {
        System.out.println("Запустили тест вычитания");

    }
    @MyTest
    public void testDel() {
        System.out.println("Запустили тест деления");

    }
    @MyTest
    public void testUmn() {
        System.out.println("Запустили тест умножения");

    }

}
