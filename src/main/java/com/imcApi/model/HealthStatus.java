package com.imcApi.model;

public enum HealthStatus {
    UnderWeight("Under Weight"), NormalWeight("Normal Weight"), OverWeight("Over Weight"), Obesity("Obesity");
    private final String healthStatus;

    HealthStatus(String s) {
        this.healthStatus = s;
    }

    public String healthStatus() {
        return this.healthStatus;
    }
}
