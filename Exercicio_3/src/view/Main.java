package view;

import controller.Faturamento;

public class Main {
	public static void main(String[] args) {
		Faturamento fat = new Faturamento();
		int tamValores = 30;
		int tamVSem0 = 21;
		double minValor = 1000.0;
		double maxValor = 50000.0;

		double[] valores = fat.gerarValoresAleatorios(tamValores, minValor, maxValor);
		double[] vSem0 = fat.gerarValoresAleatorios(tamVSem0, minValor, maxValor);

		double[] menorMaior = new double[2];
		fat.maiorMenor(valores, valores.length, menorMaior);
		System.out.printf("Menor valor de faturamento ocorrido em um dia do mês: %.2f\n", menorMaior[0]);
		System.out.printf("Maior valor de faturamento ocorrido em um dia do mês: %.2f\n", menorMaior[1]);

		double media = fat.mediaMensal(vSem0, vSem0.length);
		System.out.printf("Média mensal = %.2f\n", media);

		int numDias = fat.numeroDeDias(media, valores, valores.length);
		System.out.printf("Número de dias acima da média mensal: %d\n", numDias);
	}
}
