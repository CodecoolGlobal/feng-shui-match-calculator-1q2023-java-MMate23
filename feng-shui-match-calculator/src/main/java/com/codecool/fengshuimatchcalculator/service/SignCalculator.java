package com.codecool.fengshuimatchcalculator.service;

import com.codecool.fengshuimatchcalculator.model.Sign;

import java.time.LocalDate;

public interface SignCalculator {

    Sign signCalculator(LocalDate birthdate);
}
