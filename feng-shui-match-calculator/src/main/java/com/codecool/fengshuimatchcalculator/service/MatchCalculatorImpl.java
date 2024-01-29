package com.codecool.fengshuimatchcalculator.service;

import com.codecool.fengshuimatchcalculator.model.Match;
import com.codecool.fengshuimatchcalculator.model.Persona;
import com.codecool.fengshuimatchcalculator.model.Sign;

import java.time.LocalDate;

public class MatchCalculatorImpl implements MatchCalculator{

    SignCalculator signCalculator;

    PersonaProvider personaProvider;

    public MatchCalculatorImpl(SignCalculator signCalculator, PersonaProvider personaProvider) {
        this.signCalculator = signCalculator;
        this.personaProvider = personaProvider;
    }

    @Override
    public Match calculate(LocalDate birthdate1, LocalDate birthdate2) {
        Sign firstPerson = signCalculator.signCalculator(birthdate1);
        Sign secondPerson = signCalculator.signCalculator(birthdate2);
        Persona matchedPersona = personaProvider.findPersona(firstPerson);
        System.out.println(firstPerson);
        System.out.println(secondPerson);
        for (Sign good : matchedPersona.goodMatches()) {
            if (good.equals(secondPerson)){
                return Match.Good;
            }
        }
        for (Sign bad : matchedPersona.badMatches()) {
            if (bad.equals(secondPerson)){
                return Match.Bad;
            }
        }
        return Match.Average;
    }
}
