package view;

import controller.Faturamento;

public class Main {
	public static void main(String[] args) {
		Faturamento fat = new Faturamento();
		
		fat.carregarArquivo("faturamento.xml");
	}
}
