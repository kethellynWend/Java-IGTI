package pacotePrincipal;

import java.util.*;
public class principal {

	public static void main(String[] args) {
		Scanner entCaracter = new Scanner(System.in);
		Scanner entNumericos = new Scanner(System.in);
		char imprimirEnderešo;
		
		Pessoa p1 = new Pessoa();
		
	
		System.out.println("Digite o nome: ");
		p1.nome = entCaracter.nextLine();
		
		System.out.println("Digite a idade: ");
		p1.idade = entNumericos.nextInt();
		
		System.out.println("Digite o CPF: ");
		p1.CPF =entCaracter.nextLine();
		
		System.out.println("Digite a rua: ");
		p1.enderešo.logaduro = entCaracter.nextLine();
		
		System.out.println("Digite o n˙mero: ");
		p1.enderešo.numero = entNumericos.nextInt();
		
		System.out.println("Digite o complemento: ");
		p1.enderešo.complemento = entCaracter.nextLine();
		
		System.out.println("Digite a cidade: ");
		p1.enderešo.cidade = entCaracter.nextLine();
		
		System.out.println("Digite a estado: ");
		p1.enderešo.estado= entCaracter.nextLine();
		
		System.out.println("Digite a CEP: ");
		p1.enderešo.CEP= entCaracter.nextLine();
		
		System.out.println("DEseja imprimir os dados com o enderešo?");
		imprimirEnderešo = entCaracter.nextLine().charAt(0);
		
		System.out.printf("%s\n", p1.imprimeDadosPessoa(imprimirEnderešo) );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
