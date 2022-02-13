package com.codespace.work32;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        int v_prc_year = 0;
        double profit_mon = 0.0;
//        long deposit = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите сумму депозита (в грн.) -> ");
        long deposit = scanner.nextLong();

        System.out.print("Укажите количесво месяцев -> ");
        int v_monts = scanner.nextInt();

//        Scanner scanner2 = new Scanner("12");
//        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Процент годовых -> ");
//        int v_prc_year = scanner2.nextInt();
//        int v_prc_year = scanner.nextInt();


        if (scanner.hasNextInt()) {
            v_prc_year = scanner.nextInt();
//            System.out.println("Спасибо! Вы ввели число : " + v_prc_year);
        } else {
            v_prc_year = -1;
//            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }


//        System.out.println("сумма депозита : " + deposit + " грн.");
//        System.out.println("количесво месяцев : " + deposit + " грн.");
//        System.out.print("Процент годовых : " + v_prc_year + " %");

        if (v_prc_year != 0) {
//            int v_prc_year = scanner.nextInt();
//            System.out.println("Спасибо! Вы ввели число : " + v_prc_year);

//            profit_mon = deposit * (v_prc_year/12/100);
            profit_mon = (deposit * 0.01 * v_prc_year) / 12;
//            profit_mon = 888.77;

            System.out.println("Процент годовых : " + v_prc_year + " %");


        } else {
            System.out.println("Извините, но то, что Вы ввели для процента годовых - это явно не число. Перезапустите программу и попробуйте снова!");
        }

        System.out.println("profit_mon : " + profit_mon + " грн.");

        System.out.println("Прибыль за " + v_monts + " месяцев -> " + (profit_mon * v_monts) + " грн.");
        System.out.printf("форматирование - доход : %.2f\n", (profit_mon * v_monts));
    }
}
