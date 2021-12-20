package pacotePrincipal;

public class endereço {
	String logaduro;
	int numero;
	String complemento;
	String cidade;
	String estado;
	String CEP;
	
	String imprimirDadosEndereco() {
		return "Rua: " + "," + Integer.toString(numero) + "," + complemento + "Cidade: " + cidade + "Estado: " + estado + "CEP: " + CEP;
		
	}
}
