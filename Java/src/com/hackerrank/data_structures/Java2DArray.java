package com.hackerrank.data_structures;

import java.util.Scanner;

public class Java2DArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int hourglass = Integer.MIN_VALUE;

        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int r = 1; r < 5; r++){
            for(int c = 1; c < 5; c++){
                int sum = count(r, c, arr);
                if(sum > hourglass) hourglass = sum;
            }
        }

        System.out.println(hourglass);
    }

    private static int count(int r, int c, int arr[][]){
        int sum = 0;

        for(int j = c-1; j <= c+1; j++){
            sum += arr[r-1][j];
        }
        for(int j = c-1; j <= c+1; j++){
            sum += arr[r+1][j];
        }
        sum += arr[r][c];

        return sum;
    }
}
