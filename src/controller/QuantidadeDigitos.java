package controller;

public class QuantidadeDigitos {

	public QuantidadeDigitos() {
		super();
	}

	public int qtdDigitos(int numero) {
	    /*a) Condi��o de parada: se o n�mero for menor que 10, 
	     * a quantidade de d�gitos � 1.
	     * */
	    if(numero < 10) {
	        return 1;
	    }
	    
	    /*b) Fun��o para o termo n em fun��o do termo anterior: 
	     * chama a fun��o qtdDigitos novamente com o seu par�metro 
	     * dividido por 10 (para remover o �ltimo d�gito) e soma 1.
	     */
	    return qtdDigitos(numero / 10) + 1;
	}

}
