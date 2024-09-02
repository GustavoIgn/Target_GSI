package controller;

public class FibonacciController {
	
	public FibonacciController() {
		super();
	}
	
	public boolean buscarValor(int num) {
		if (num == 0 || num == 1) {
			return true;
		}
		
		int anterior = 0, atual = 1;
		
		while (atual < num) {
			int proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
		}
		
		return (atual == num);
	}
}
