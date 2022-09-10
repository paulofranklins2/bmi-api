package com.imcApi.service.bmi;


import com.imcApi.model.User;

public interface BmiService {
    double calcImc(User user);
}
