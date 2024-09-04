package controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class Faturamento {
	
	public Faturamento() {
		super();
	}

	public void carregarArquivo(String nomeArquivo) {
		try {
			File inputFile = new File(nomeArquivo);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();

			NodeList nList = doc.getElementsByTagName("row");

			List<Double> faturamentoList = new ArrayList<>();

			for (int temp = 0; temp < nList.getLength(); temp++) {
				double valor = Double.parseDouble(nList.item(temp).getChildNodes().item(3).getTextContent());
				if (valor > 0) {
					faturamentoList.add(valor);
				}
			}

			if (faturamentoList.isEmpty()) {
				System.out.println("Nenhum valor de faturamento registrado.");
				return;
			}

			double menorFaturamento = Collections.min(faturamentoList);
			double maiorFaturamento = Collections.max(faturamentoList);

			double soma = 0;
			for (double faturamento : faturamentoList) {
				soma += faturamento;
			}
			double mediaMensal = soma / faturamentoList.size();

			int diasAcimaDaMedia = 0;
			for (double faturamento : faturamentoList) {
				if (faturamento > mediaMensal) {
					diasAcimaDaMedia++;
				}
			}

			System.out.println("Menor valor de faturamento: " + menorFaturamento);
			System.out.println("Maior valor de faturamento: " + maiorFaturamento);
			System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}