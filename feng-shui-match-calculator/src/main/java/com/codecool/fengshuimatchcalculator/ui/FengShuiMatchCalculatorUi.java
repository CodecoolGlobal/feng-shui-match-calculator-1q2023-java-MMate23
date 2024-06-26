package com.codecool.fengshuimatchcalculator.ui;

import com.codecool.fengshuimatchcalculator.model.Match;
import com.codecool.fengshuimatchcalculator.service.MatchCalculator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FengShuiMatchCalculatorUi {

    private final MatchCalculator matchCalculator;

    public FengShuiMatchCalculatorUi(MatchCalculator matchCalculator) {

        this.matchCalculator = matchCalculator;
    }

    public void run() {
        displayWelcomeMessage();
        LocalDate birthdate1 = getBirthDate(1);
        LocalDate birthdate2 = getBirthDate(2);

        Match match = matchCalculator.calculate(birthdate1, birthdate2);
        System.out.println("Feng shui match result: " + match);
    }

    private void displayWelcomeMessage() {
        System.out.println("*** FENG SHUI MATCH CALCULATOR ***");
    }

    private LocalDate getBirthDate(int person) {
        LocalDate userDate = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter birthdate(yyyy-MM-dd):");
        try {
            String userInput = scan.nextLine();
            userDate = LocalDate.parse(userInput);
        }catch (InputMismatchException ex ){
            System.out.println("NOPE" + ex);
        }
        return userDate;
    }
}

