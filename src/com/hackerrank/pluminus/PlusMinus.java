package com.hackerrank.pluminus;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PlusMinus {

    public static void plusMinus(int[] arr) {

        int tamanhoDoVetor = arr.length;

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        for (int contador = 0; contador < arr.length; contador++) {
            if (arr[contador] > 0) {
                positivos += 1;
            } else if (arr[contador] < 0) {
                negativos += 1;
            } else {
                zeros += 1;
            }
        }

        System.out.println(BigDecimal.valueOf((double) positivos / tamanhoDoVetor).setScale(6, RoundingMode.HALF_UP).doubleValue());
        System.out.println(BigDecimal.valueOf((double) negativos / tamanhoDoVetor).setScale(6, RoundingMode.HALF_UP).doubleValue());
        System.out.println(BigDecimal.valueOf((double) zeros / tamanhoDoVetor).setScale(6, RoundingMode.HALF_UP).doubleValue());
    }

}
