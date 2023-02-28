package view;

import controller.QuantidadeDigitos;

public class Principal {

	public static void main(String[] args) {
		
		QuantidadeDigitos qd = new QuantidadeDigitos();
		
		int numero = 1234;
		int qtdDigitos = qd.qtdDigitos(numero / 10) + 1;
		System.out.println(qtdDigitos);
				
		/*Exemplo, para o número 1234:
		qtdDigitos(1234)
		Será iniciado a função recursiva, com n = 1234:
		1 + qtdDigitos(123)
		Nesse ponto, n = 123:
		1 + 1 + qtdDigitos(12)
		Nesse ponto, n = 12:
		1 + 1 + 1 + qtdDigitos(1)
		Nesse ponto, n = 1:
		1 + 1 + 1 + 1
		Resultado: 4		
		*/
	}

}
