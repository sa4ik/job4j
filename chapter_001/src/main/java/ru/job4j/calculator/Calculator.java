package ru.job4j.calculator;

/**
 * Калькулятор.
 *  @author Sergey Sachavichka (sachavichka@gmail.com).
 */

public class Calculator {
private double result;

    /**
     *
     * @param first
     * @param second
     */

    /**
     *
     * @сложение
     */
    public void add(double first, double second) { this.result = first + second; }

    /**
     *
     * @деление
     */
public void div(double first, double second){ this.result = first / second; }

    /**
     *
     * @вычитание
     *
     */

public void substract(double first, double second){ this.result = first - second; }

    /**
     *
     * @умножение
     */

public void multiple(double first, double second){ this.result = first * second; }

    /**
     * 
     * @return
     */

public double getResult() { return this.result; }

}