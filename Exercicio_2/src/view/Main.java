package view;

import java.util.Scanner;
import controller.FibonacciController;

public class Main {

	public static void main(String[] args) {

		boolean continuar = true;
		Scanner input = new Scanner(System.in);
		while (continuar) {
			int num;

			System.out.println("\tInsira o número que deseja buscar:");
			num = input.nextInt();

			FibonacciController fCont = new FibonacciController();
			if (fCont.buscarValor(num)) {
				System.out.println("\tO número " + num + " SIM faz parte da sequencia de Fibonacci!");
			} else {
				System.out.println("\tO número " + num + " NÃO faz parte da sequencia de Fibonacci!");
			}

			System.out.println("\tDeseja continuar? (S/N):");
			String resposta = input.next().toUpperCase();

			if (resposta.equals("N")) {
				continuar = false;
				System.out.println("\tPrograma encerrado.");
			}
		}
		input.close();
	}

}
