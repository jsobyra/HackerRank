package com.hackerrank.introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

    static int B, H;
    static boolean flag = true;


    static {
        try{
            Scanner scan = new Scanner(System.in);
            B = scan.nextInt();
            H = scan.nextInt();
            if(B <= 0 || H <= 0) throw new Exception();
        }
        catch (Exception e){
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }
}
