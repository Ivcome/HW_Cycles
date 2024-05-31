
package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationCalculatorTest {

    @Test
    public void calculateVacationMonths() {
        VacationCalculator calculator = new VacationCalculator();
        int income = 10000; // Доходы
        int expenses = 3000; // расходы
        int threshold = 20000; // траты на отпуск

        int result = calculator.calculateVacationMonths(income, expenses, threshold);

        assertEquals(3, result);
    }
}
