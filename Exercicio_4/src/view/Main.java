package view;

import controller.FaturamentoController;

public class Main {

    public static void main(String[] args) {
        double[] valoresEstados = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};
        String[] estados = {"SP", "RJ", "MG", "ES", "Outros"};

        double valorTotal = 0;
        for (double valor : valoresEstados) {
            valorTotal += valor;
        }

        double[] percentuais = FaturamentoController.calcularPercentuais(valoresEstados, valorTotal);

        System.out.printf("Valor total de faturamento: R$%.2f\n", valorTotal);
        for (int i = 0; i < estados.length; i++) {
            System.out.printf("Percentual de %s: %.2f%%\n", estados[i], percentuais[i]);
        }
    }
}
