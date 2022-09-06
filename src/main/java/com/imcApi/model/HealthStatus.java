package com.imcApi.model;

public enum HealthStatus {
    Underweight("Under Weight"), NormalWeight("Normal Weight"), Overweight("Over Weight"), Obesity("Obesity");
    private final String healthStatus;

    HealthStatus(String s) {
        this.healthStatus = s;
    }

    public String healthStatus() {
        return this.healthStatus;
    }
}
