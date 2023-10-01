package org.tinnova.votos;

public class CalculaPercentualVotos {

    private static final int MULTIPLICA_PERCENTUAL = 100;
    private static final String PERCENTUAL_DE_VOTOS = "Percentual de votos";

    private static String calcularPercentual(int tipoVoto, int totalEleitores, String mensagem) {
        if (totalEleitores == 0) {
            return "Não Pode dividir por 0";
        }
        double total = (double) tipoVoto / totalEleitores * MULTIPLICA_PERCENTUAL;
        return String.format(mensagem, total);
    }

    public static String calculaVotosValidos(int validos, int totalEleitores) {
        return calcularPercentual(validos, totalEleitores, PERCENTUAL_DE_VOTOS + " válidos: %.2f%%");
    }

    public static String calculaVotosBrancos(int brancos, int totalEleitores) {
        return calcularPercentual(brancos, totalEleitores, PERCENTUAL_DE_VOTOS + " brancos: %.2f%%");
    }

    public static String calculaVotosNulos(int nulo, int totalEleitores) {
        return calcularPercentual(nulo, totalEleitores, PERCENTUAL_DE_VOTOS + " nulo: %.2f%%");
    }

}
