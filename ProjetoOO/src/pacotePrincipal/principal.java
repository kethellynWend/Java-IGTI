package pacotePrincipal;

import java.util.*;
public class principal {

	public static void main(String[] args) {
		Scanner entCaracter = new Scanner(System.in);
		Scanner entNumericos = new Scanner(System.in);
		char imprimirEndereço;
		
		Pessoa p1 = new Pessoa();
		
	
		System.out.println("Digite o nome: ");
		p1.nome = entCaracter.nextLine();
		
		System.out.println("Digite a idade: ");
		p1.idade = entNumericos.nextInt();
		
		System.out.println("Digite o CPF: ");
		p1.CPF =entCaracter.nextLine();
		
		System.out.println("Digite a rua: ");
		p1.endereço.logaduro = entCaracter.nextLine();
		
		System.out.println("Digite o número: ");
		p1.endereço.numero = entNumericos.nextInt();
		
		System.out.println("Digite o complemento: ");
		p1.endereço.complemento = entCaracter.nextLine();
		
		System.out.println("Digite a cidade: ");
		p1.endereço.cidade = entCaracter.nextLine();
		
		System.out.println("Digite a estado: ");
		p1.endereço.estado= entCaracter.nextLine();
		
		System.out.println("Digite a CEP: ");
		p1.endereço.CEP= entCaracter.nextLine();
		
		System.out.println("DEseja imprimir os dados com o endereço?");
		imprimirEndereço = entCaracter.nextLine().charAt(0);
		
		System.out.printf("%s\n", p1.imprimeDadosPessoa(imprimirEndereço) );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
