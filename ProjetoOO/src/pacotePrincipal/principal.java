package pacotePrincipal;

import java.util.*;
public class principal {

	public static void main(String[] args) {
		Scanner entCaracter = new Scanner(System.in);
		Scanner entNumericos = new Scanner(System.in);
		char imprimirEndere�o;
		
		Pessoa p1 = new Pessoa();
		
	
		System.out.println("Digite o nome: ");
		p1.nome = entCaracter.nextLine();
		
		System.out.println("Digite a idade: ");
		p1.idade = entNumericos.nextInt();
		
		System.out.println("Digite o CPF: ");
		p1.CPF =entCaracter.nextLine();
		
		System.out.println("Digite a rua: ");
		p1.endere�o.logaduro = entCaracter.nextLine();
		
		System.out.println("Digite o n�mero: ");
		p1.endere�o.numero = entNumericos.nextInt();
		
		System.out.println("Digite o complemento: ");
		p1.endere�o.complemento = entCaracter.nextLine();
		
		System.out.println("Digite a cidade: ");
		p1.endere�o.cidade = entCaracter.nextLine();
		
		System.out.println("Digite a estado: ");
		p1.endere�o.estado= entCaracter.nextLine();
		
		System.out.println("Digite a CEP: ");
		p1.endere�o.CEP= entCaracter.nextLine();
		
		System.out.println("DEseja imprimir os dados com o endere�o?");
		imprimirEndere�o = entCaracter.nextLine().charAt(0);
		
		System.out.printf("%s\n", p1.imprimeDadosPessoa(imprimirEndere�o) );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
