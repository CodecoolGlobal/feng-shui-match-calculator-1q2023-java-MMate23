package com.codecool.fengshuimatchcalculator;

import com.codecool.fengshuimatchcalculator.service.*;
import com.codecool.fengshuimatchcalculator.ui.FengShuiMatchCalculatorUi;

import java.time.LocalDate;

class Program
{
    public static void main(String[] args) {
        SignCalculator signCalculator = new SignCalculatorImpl();
        PersonaProvider personaProvider = new PersonaProviderImpl();
        MatchCalculator matchCalculator = new MatchCalculatorImpl(signCalculator,personaProvider);
        FengShuiMatchCalculatorUi fengShuiMatchCalculatorUi = new FengShuiMatchCalculatorUi(matchCalculator);
        fengShuiMatchCalculatorUi.run();

    }
}
