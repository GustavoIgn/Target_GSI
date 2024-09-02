package controller;

import java.util.Random;

public class Faturamento {

    public static double[] gerarValoresAleatorios(int tam, double min, double max) {
        Random random = new Random();
        double[] valores = new double[tam];
        for (int i = 0; i < tam; i++) {
            valores[i] = min + (max - min) * random.nextDouble();
        }
        return valores;
    }

    public static void maiorMenor(double[] vet, int tam, double[] menorMaior) {
        double menor = vet[0];
        double maior = vet[0];

        for (int i = 1; i < tam; i++) {
            if (menor > vet[i]) {
                menor = vet[i];
            }
            if (maior < vet[i]) {
                maior = vet[i];
            }
        }
        menorMaior[0] = menor;
        menorMaior[1] = maior;
    }

    public static double mediaMensal(double[] vet, int tam) {
        double soma = 0;
        for (int i = 0; i < tam; i++) {
            soma += vet[i];
        }
        return soma / tam;
    }

    public static int numeroDeDias(double media, double[] vet, int tam) {
        int num = 0;
        for (int i = 0; i < tam; i++) {
            if (vet[i] > media) {
                num++;
            }
        }
        return num;
    }
}
