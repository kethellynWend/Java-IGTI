package pacotePrincipal;

public class Pessoa {
	
	
	int idade;
	String nome;
	String CPF;
	enderešo enderešo;
	
	Pessoa (){
		enderešo = new enderešo();
	}
	
	String imprimeDadosPessoa(char imprimirEnderešo){
		if (imprimirEnderešo == 'N' || imprimirEnderešo =='n' )
		  return "Nome: "+ nome + "\nIdade: "  + Integer.toString(idade) + "\nCPF: " + CPF;
		else 
			  return "Nome: "+ nome + "\nIdade: "  + Integer.toString(idade) + "\nCPF: " + CPF + "\n" + enderešo.imprimirDadosEndereco() ;
	
	}
	
	}
	

