package com.imcApi.service.imcCalc;

import com.imcApi.model.HealthStatus;
import org.springframework.stereotype.Component;

@Component
public class LogicHealthStatusImplementation implements LogicHealthStatus {
    @Override
    public HealthStatus logicStatus(double bmi) {
        HealthStatus healthStatus;
        if (bmi < 18.5) {
            healthStatus = (HealthStatus.UnderWeight);
        } else if (bmi < 24.9) {
            healthStatus = (HealthStatus.NormalWeight);
        } else if (bmi < 29.9) {
            healthStatus = (HealthStatus.OverWeight);
        } else {
            healthStatus = (HealthStatus.Obesity);
        }
        return healthStatus;
    }
}
