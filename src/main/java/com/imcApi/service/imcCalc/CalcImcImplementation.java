package com.imcApi.service.imcCalc;

import org.springframework.stereotype.Component;

@Component
public class CalcImcImplementation implements CalcImc {
    @Override
    public double calcImc(double weight, double height) {
        return (weight / (height * height));
    }
}
