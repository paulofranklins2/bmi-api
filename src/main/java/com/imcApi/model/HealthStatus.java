package com.imcApi.model;

public enum HealthStatus {
    Underweight("Under Weight"), NormalWeight("Normal Weight"), Overweight("Over Weight"), Obesity("Obesity");
    private final String HEALTHSTATUS;

    HealthStatus(String s) {
        this.HEALTHSTATUS = s;
    }

    public String healthStatus() {
        return this.HEALTHSTATUS;
    }
}
