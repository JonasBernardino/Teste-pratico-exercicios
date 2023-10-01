package org.tinnova.fatorial;

public class CalculaFatorial {

    public static String fatorial(int entrada) {
        if (entrada < 0) {
            throw new IllegalArgumentException("O fatorial de um número negativo não é definido.");
        }
        int fatorial = 1;
        for (int i = 1; i <= entrada; i++) {
            fatorial *= i;
        }
        return "O fatorial de "+ entrada + " é = "+fatorial;
    }
}
