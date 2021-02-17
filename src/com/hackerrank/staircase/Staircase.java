package com.hackerrank.staircase;


/**
 * link for challenge: https://www.hackerrank.com/challenges/staircase/problem?h_r=next-challenge&h_v=zen
 * author: Iago Hisami Saito
 */
public class Staircase {

    public static void stairCase(int n) {

        for (int linha = 1; linha <= n; linha++) {
            for (int coluna = 1; coluna <= n; coluna++) {
                if (coluna <= n-linha) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }

    }
}
