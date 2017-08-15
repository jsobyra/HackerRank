package com.hackerrank.data_structures;

import java.util.Scanner;

public class Java1DArray2 {
    public static boolean canWin(int leap, int[] game) {
        return isSolvable(0, leap, game);
    }

    private static boolean isSolvable(int position, int leap, int[] game) {
        if(position < 0 || game[position] == 1) return false;
        else if(position == game.length-1 || position + leap >= game.length) return true;

        game[position] = 1;

        return isSolvable(position-1, leap, game) ||
                isSolvable(position+1, leap, game) ||
                isSolvable(position+leap, leap, game);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
