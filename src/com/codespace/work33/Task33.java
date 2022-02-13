package com.codespace.work33;
import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите стоимость шкафа (в $) -> ");
        double cost_skaf = scanner.nextDouble();

        System.out.print("Укажите % понижения стоимости шкафа -> ");
        double prc_fall_cost_skaf = scanner.nextDouble();

        System.out.print("Укажите курс доллара (грн.) -> ");
        double cost_usd = scanner.nextDouble();

        System.out.print("Укажите % повышения курса доллара -> ");
        double prc_cost_usd = scanner.nextDouble();

        System.out.println("Стоимость шкафа (в $) : " + cost_skaf);
        System.out.println("% понижения стоимости шкафа : " + prc_fall_cost_skaf);
        System.out.println("курс доллара : " + cost_usd);
        System.out.println("% повышения курса доллара : " + prc_cost_usd);
        System.out.println("__________________________");

        System.out.println("понижение стоимости шкафа ($) : " + cost_skaf * prc_fall_cost_skaf / 100);
        System.out.println("стоимость шкафа №_1 ($) : " + (cost_skaf - (cost_skaf * prc_fall_cost_skaf / 100)));

        System.out.println("стоимость шкафа №_1 (грн.) : " + ((cost_skaf - (cost_skaf * prc_fall_cost_skaf / 100))) * cost_usd);

        double new_cost_usd = (cost_usd + (cost_usd * prc_cost_usd / 100 ));
        System.out.println("новый курс доллара : " + new_cost_usd);

        System.out.println("стоимость шкафа №_2 (грн.) : " + ((cost_skaf - (cost_skaf * prc_fall_cost_skaf / 100))) * new_cost_usd);


    }
}
