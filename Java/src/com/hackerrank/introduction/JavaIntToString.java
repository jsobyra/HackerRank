package com.hackerrank.introduction;

import java.util.Scanner;

public class JavaIntToString {

    public static void main(String[] args){
        try{
            Scanner scan = new Scanner(System.in);
            Integer n = scan.nextInt();
            n.toString();
            System.out.println("Good job");
        }
        catch (Exception e){
            System.out.println("Wrong answer");
        }
    }
}
