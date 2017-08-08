package com.hackerrank.data_structures;

import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int array[] = new int[size];

        for(int i = 0; i < array.length; i++)
            array[i] = scan.nextInt();

        int count = 0;
        for(int i = 0; i < size; i++){
          for(int j = size; j > 0; j--){
              int sum = 0;
              for(int k = i; k < j; k++){
                  sum += array[k];
              }
              if(sum < 0) count++;
          }
        }

        System.out.print(count);
    }
}
