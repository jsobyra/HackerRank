package com.hackerrank.introduction;

import java.util.Scanner;

public class JavaLoopsII {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i = 0; i < N; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int s = 0;
            for(int j = 0; j < n; j++){
                s += b;
                b *= 2;
                System.out.print(a + s + " ");
            }
            System.out.println();
        }
    }
}
