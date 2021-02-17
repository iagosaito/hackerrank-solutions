package com.hackerrank.diagonaldifference;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int primeiraDiagonal = 0;
        int segundaDiagonal = 0;

        for (int linha = 0; linha < arr.size(); linha++) {
            for (int coluna = 0; coluna < arr.get(linha).size(); coluna++) {

                if (linha == coluna) {
                    primeiraDiagonal += arr.get(linha).get(coluna);
                    segundaDiagonal += (arr.get(linha).get((arr.size() - 1) - linha));
                    break;
                }
            }
        }

        return Math.abs(primeiraDiagonal - segundaDiagonal);
    }
}
