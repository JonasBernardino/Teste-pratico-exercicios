package org.tinnova;


import org.tinnova.fatorial.CalculaFatorial;
import org.tinnova.ordenacao.BubbleSort;
import org.tinnova.soma.SomaMultiplos;
import org.tinnova.votos.CalculaPercentualVotos;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(CalculaPercentualVotos.calculaVotosValidos(800, 1000));

        System.out.println(CalculaPercentualVotos.calculaVotosBrancos(150, 1000));

        System.out.println(CalculaPercentualVotos.calculaVotosNulos(50, 1000));

        int[] entrada = {5, 3, 2, 4, 7, 1, 0, 6};
        System.out.println(Arrays.toString(BubbleSort.ordenar(entrada)));

        try {
            System.out.println(CalculaFatorial.fatorial(5));
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção: " + e.getMessage());
        }

        try {
            System.out.println(SomaMultiplos.somaMultiplosDeCincoETres(10));
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção: " + e.getMessage());
        }
    }
}