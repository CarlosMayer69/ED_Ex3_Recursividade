package controller;

public class QuantidadeDigitos {

	public QuantidadeDigitos() {
		super();
	}

	public int qtdDigitos(int numero) {
	    /*a) Condição de parada: se o número for menor que 10, 
	     * a quantidade de dígitos é 1.
	     * */
	    if(numero < 10) {
	        return 1;
	    }
	    
	    /*b) Função para o termo n em função do termo anterior: 
	     * chama a função qtdDigitos novamente com o seu parâmetro 
	     * dividido por 10 (para remover o último dígito) e soma 1.
	     */
	    return qtdDigitos(numero / 10) + 1;
	}

}
