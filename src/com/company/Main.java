package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 0; // Начальное значение диапазона - "от"
        int b = 107; // Конечное значение диапазона - "до"

        int randomAge = a + (int) (Math.random() * b);
        System.out.println("случайный возраст: " + randomAge);

    }
}
