package PacoteAula3;
import java.math.*;
import java.util.*;

public class classe_aula3_LeituraDoTeclado {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4, frequencia, TotalNotas;
		char statusAluno;
		boolean aprovado;
		
		Scanner entradaNotas = new Scanner(System.in);
		Scanner entradaCaracteres = new Scanner(System.in);
				
		System.out.print("Digite o nome do Aluno: ");
		String nomeAluno = entradaCaracteres.nextLine();
		
		System.out.printf("Didite um caracter para a situação do aluno( O--> Ok; P -->Pendencia;");
		statusAluno = entradaCaracteres.nextLine().charAt(0);
		
		System.out.print("Digite a primeira nota: ");
		nota1 = entradaNotas.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = entradaNotas.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3 = entradaNotas.nextDouble();
		System.out.print("Digite a quarta nota: ");
		nota4 = entradaNotas.nextDouble();

	    System.out.print("Digite a frequencia do aluno: ");
		frequencia = entradaCaracteres.nextDouble();
		
		TotalNotas = nota1 + nota2 + nota3 + nota4;
		aprovado = TotalNotas >= 70 && frequencia >= 0.75;
		
	

		
		System.out.printf("O(a) Aluno(a) %s obteve nota final %.2f  e frequencia %.2f%% a situação do(a) Aluno(a) é %c.\n"
				+ "Aluno(a) aprovado? %b",nomeAluno,TotalNotas,frequencia*100,statusAluno,aprovado);
		
		

	}

}
