package com.hackerrank.exception_handling;

import java.util.Scanner;

public class JavaExceptionHandling {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.println(power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static long power(int n, int p) throws Exception {
        if(n == 0 && p == 0) throw new Exception("n and p should not be zero.");
        else if(n < 0 || p < 0) throw new Exception("n or p should not be negative.");
        else {
            int i = 0;
            int result = 1;
            while(i < p){
                result *= n;
                i++;
            }
            return result;
        }
    }
}
