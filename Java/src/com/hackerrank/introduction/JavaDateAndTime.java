package com.hackerrank.introduction;

import java.time.LocalDate;
import java.util.Scanner;

public class JavaDateAndTime {

    public static String getDay(int day, int month, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();

        System.out.println(getDay(day, month, year));
    }
}
