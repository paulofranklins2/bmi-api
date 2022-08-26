package com.imcApi.service.imcCalc;

import com.imcApi.model.HealthStatus;
import org.springframework.stereotype.Component;

@Component
public class LogicHealthStatusImplementation implements LogicHealthStatus {
    @Override
    public HealthStatus logicStatus(double imc) {
        HealthStatus healthStatus;
        if (imc < 18.5) {
            healthStatus = (HealthStatus.Underweight);
        } else if (imc < 24.9) {
            healthStatus = (HealthStatus.NormalWeight);
        } else if (imc < 29.9) {
            healthStatus = (HealthStatus.Overweight);
        } else {
            healthStatus = (HealthStatus.Obesity);
        }
        return healthStatus;
    }
}
