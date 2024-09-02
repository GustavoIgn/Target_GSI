package view;

import java.util.Scanner;

import controller.InverterController;

public class Main {
    public static void main(String[] args) {
        InverterController iCont = new InverterController();
        Scanner input = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\tInsira o texto que quer inverter:");
            String texto = input.nextLine();
            int tamanho = texto.length();

            System.out.println("\tInvertendo " + texto + " fica " + iCont.inverterTexto(texto, tamanho));

            System.out.println("\tDeseja continuar? (S/N):");
            String resposta = input.next().toUpperCase();
            input.nextLine();

            if (resposta.equals("N")) {
                continuar = false;
                System.out.println("\tPrograma encerrado.");
            }
        }
        input.close();
    }
}
