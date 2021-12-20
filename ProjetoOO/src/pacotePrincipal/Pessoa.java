package pacotePrincipal;

public class Pessoa {
	
	
	int idade;
	String nome;
	String CPF;
	endereço endereço;
	
	Pessoa (){
		endereço = new endereço();
	}
	
	String imprimeDadosPessoa(char imprimirEndereço){
		if (imprimirEndereço == 'N' || imprimirEndereço =='n' )
		  return "Nome: "+ nome + "\nIdade: "  + Integer.toString(idade) + "\nCPF: " + CPF;
		else 
			  return "Nome: "+ nome + "\nIdade: "  + Integer.toString(idade) + "\nCPF: " + CPF + "\n" + endereço.imprimirDadosEndereco() ;
	
	}
	
	}
	

