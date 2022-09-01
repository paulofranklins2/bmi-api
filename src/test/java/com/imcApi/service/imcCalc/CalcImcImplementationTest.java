package com.imcApi.service.imcCalc;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalcImcImplementationTest {
    private static final double DELTA = 1e-15;

    @Test
    public void shouldCalcTheIMC() {
        CalcImcImplementation calcImcImplementation = new CalcImcImplementation();
        double result = calcImcImplementation.calcImc(60, 1.70);
        Assertions.assertEquals(20.76, result, DELTA);
    }

    @Test
    public void shouldCheckIfRoundingWrong(){
        CalcImcImplementation calcImcImplementation = new CalcImcImplementation();
        double result = calcImcImplementation.calcImc(60, 1.70);
        Assertions.assertNotEquals(20.77, result, DELTA);
        Assertions.assertNotEquals(20.75, result, DELTA);
    }
}