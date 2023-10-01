package org.tinnova.soma;

public class SomaMultiplos {

    public static String somaMultiplosDeCincoETres(int entrada) {
        if (entrada < 0) {
            throw new IllegalArgumentException("O número de entrada deve ser não negativo.");
        }
        int total = 0;
        for (int i = 0; i < entrada; i++){
            if(i % 3 == 0 || i % 5 == 0){
                total = i +total;
            }
        }
        return "A soma dos multiplos de 3 e 5 é = "+total;
    }
}
