package com.hackerrank.introduction;

import java.util.Scanner;

public class JavaStdinandStdoutII {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.nextLine();
        double f = scan.nextDouble();
        scan.nextLine();
        String line = scan.nextLine();

        System.out.println("String: " + line);
        System.out.println("Double: " + f);
        System.out.println("Int: " +  x);
    }
}
