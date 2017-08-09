package com.hackerrank.data_structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < size; i++)
            list.add(scanner.nextInt());

        int count = scanner.nextInt();
        for(int i = 0; i < count; i++){
            String command = scanner.next();
            if(command.equals("Insert")){
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                list.add(x, y);
            }
            else if(command.equals("Delete")){
                int x = scanner.nextInt();
                list.remove(x);
            }
        }

        for(Integer elem : list)
            System.out.print(elem + " ");
    }
}