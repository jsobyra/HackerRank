package com.hackerrank.data_structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List list[] = new ArrayList[n];
        for(int i = 0; i < n; i++){
            int size = scan.nextInt();
            list[i] = new ArrayList(size);
            for(int j = 0; j < size; j++) list[i].add(scan.nextInt());
        }

        n = scan.nextInt();
        for(int i = 0; i < n; i++){
            int q = scan.nextInt();
            int x = scan.nextInt();

            try{
                System.out.println(list[q-1].get(x-1));
            } catch (Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
