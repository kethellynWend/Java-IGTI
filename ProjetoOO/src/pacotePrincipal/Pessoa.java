package pacotePrincipal;

public class Pessoa {
	
	
	int idade;
	String nome;
	String CPF;
	endere�o endere�o;
	
	Pessoa (){
		endere�o = new endere�o();
	}
	
	String imprimeDadosPessoa(char imprimirEndere�o){
		if (imprimirEndere�o == 'N' || imprimirEndere�o =='n' )
		  return "Nome: "+ nome + "\nIdade: "  + Integer.toString(idade) + "\nCPF: " + CPF;
		else 
			  return "Nome: "+ nome + "\nIdade: "  + Integer.toString(idade) + "\nCPF: " + CPF + "\n" + endere�o.imprimirDadosEndereco() ;
	
	}
	
	}
	

