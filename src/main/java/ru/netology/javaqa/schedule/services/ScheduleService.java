package ru.netology.javaqa.schedule.services;

public class ScheduleService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0;// количество денег на счету
        int residualAmount;
        for (int month = 1; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                residualAmount = money - expenses;
                money = residualAmount - (residualAmount / 3 * 2);


            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
