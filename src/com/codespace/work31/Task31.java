package com.codespace.work31;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите вес в фунтах -> ");
        double weight_funt = scanner.nextDouble();

        final double VALUE_FUNT = 453.6;

        double ww = weight_funt * VALUE_FUNT;//вес в ГРАММАХ1

        long kilo = (long)(ww / 1000);
        float gramm = Math.round (((float)(ww - kilo * 1000)*100));//умножаем на 100 - чтобы точно еопределить ДВА знака после запятой
        gramm = gramm / 100;//возвращаем ДВА знака после запятой

        System.out.println("kg = " + kilo + "; gm = " + gramm);

    }
}
