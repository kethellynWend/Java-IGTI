
package aula3_2;
import java.math.*;
import java.util.*;
public class classeala3_2 {

	public static void main(String[] args) {
		
		double n1, n2, n3, total, media, frequencia;
		Scanner entrada = new Scanner(System.in);
		String situa�ao;
		System.out.println("Digite o primeiro n�mero: ");
		n1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo n�mero: ");
		n2 = entrada.nextDouble();
		
		System.out.println("Digite o terceiro n�mero: ");
		n3 = entrada.nextDouble();
		
		total = n1 + n2 + n3;
		media = total / 3;
		
		System.out.println("Digite a frequencia do aluno: ");
		frequencia = entrada.nextDouble();
		
		if (total >= 70 && frequencia >= 0.75) {
		 situa�ao = "Aprovado";
		 
		 if (total >= 90)
			 situa�ao = "Aprovado com conceito A";
		 else if (total >=80 && total <90)
			 situa�ao = "Aprovado com conceit B";
		 else
			 situa�ao = "Aprovado com conceito C";
		 
		}
		else if ( total >= 40 && total < 70 && frequencia >= 0.75 )
			situa�ao = "Recupera��o";
		 
		 else
			 situa�ao = "Reprovado";

		
		System.out.printf("O aluno obteve nota total %.2f e a m�dia por avalia��o de %.2f. A frequencia foi %.2f%%. Com isso o aluno est� %s"
				,total ,media, frequencia*100, situa�ao);
		
		
		

			
		
		
		
	}

}
