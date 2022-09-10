package com.imcApi.service.bmi;


import com.imcApi.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalcImcImplementationTest {
    private static final double DELTA = 1e-15;

    @Test
    public void shouldCallBmiCalc() {
        User user = new User();
        user.setWeight(60);
        user.setHeight(1.70);
        BmiImplementation calcImcImplementation = new BmiImplementation();
        double result = calcImcImplementation.calcImc(user);
        Assertions.assertEquals(20.76, result, DELTA);
    }

    @Test
    public void shouldCheckIfRoundingWrong() {
        User user = new User();
        user.setWeight(60);
        user.setHeight(1.70);
        BmiImplementation calcImcImplementation = new BmiImplementation();
        double result = calcImcImplementation.calcImc(user);
        Assertions.assertNotEquals(20.77, result, DELTA);
        Assertions.assertNotEquals(20.75, result, DELTA);
    }
}