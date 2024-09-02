package controller;

public class FaturamentoController {

	public static double calcularPercentual(double valorEstado, double valorTotal) {
		return (valorEstado / valorTotal) * 100;
	}

	public static double[] calcularPercentuais(double[] valoresEstados, double valorTotal) {
		double[] percentuais = new double[valoresEstados.length];
		for (int i = 0; i < valoresEstados.length; i++) {
			percentuais[i] = calcularPercentual(valoresEstados[i], valorTotal);
		}
		return percentuais;
	}
}