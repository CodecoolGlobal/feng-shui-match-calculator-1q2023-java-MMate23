package com.codecool.fengshuimatchcalculator.service;

import com.codecool.fengshuimatchcalculator.model.Sign;

import java.time.LocalDate;

public class SignCalculatorImpl implements SignCalculator{
    @Override
    public Sign signCalculator(LocalDate birthdate) {
        int year = birthdate.getYear();
        return Sign.values()[year%12];
    }
}
