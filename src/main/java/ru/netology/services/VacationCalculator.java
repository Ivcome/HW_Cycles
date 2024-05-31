package ru.netology.services;

public class VacationCalculator {

    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int monthsOfVacation = 0; // счётчик месяцев отдыха
        int savings = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (savings >= threshold) {  // можем ли отдыхать?
                monthsOfVacation++; // увеличиваем счётчик месяцев отдыха
                savings = savings - expenses - threshold; // количество денег за вычетом расходов и вычет опуска
            } else {
                savings = savings + income; // количество накопленых денег плюс доход
            }
        }
        return monthsOfVacation;
    }
}