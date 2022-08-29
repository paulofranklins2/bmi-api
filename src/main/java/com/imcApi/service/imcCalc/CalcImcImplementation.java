package com.imcApi.service.imcCalc;

import org.springframework.stereotype.Component;

@Component
public class CalcImcImplementation implements CalcImc {
    @Override
    public double calcImc(double weight, double height) {
        return Math.round((weight / (height * height)) * 100.0) / 100.0;
    }
}
