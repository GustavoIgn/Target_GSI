package controller;

public class InverterController {

	public InverterController() {
		super();
	}

	public String inverterTexto(String texto, int tamanho) {
		if (tamanho == 0) {
			return "";
		} else {
			String l = texto.substring(0, 1);
			tamanho = tamanho - 1;
			return inverterTexto(texto.substring(1), tamanho) + l;
		}
	}
}
