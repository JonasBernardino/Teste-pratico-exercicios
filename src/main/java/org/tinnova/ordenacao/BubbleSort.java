package org.tinnova.ordenacao;

public class BubbleSort {

    public static int[] ordenar(int[] entrada) {
        int tamanho = entrada.length;

        for (int i = 0; i < tamanho-1; i++) {
            
            for (int k = 0; k < tamanho-i-1; k++) {
                if (entrada[k] > entrada[k+1]) {
                    int troca = entrada[k];
                    entrada[k] = entrada[k+1];
                    entrada[k+1] = troca;
                }
            }
        }
        return entrada;
    }
}
