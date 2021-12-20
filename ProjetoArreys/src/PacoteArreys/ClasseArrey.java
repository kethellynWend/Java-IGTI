package PacoteArreys;
import java.util.*;
public class ClasseArrey {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		int numero =0, somatorio =0, contador =0;
		
		do {
			System.out.println("Digite números positivos ou zeros para sair");
			numero = entrada.nextInt();
			
			if (numero == 18)
				continue;
			
			somatorio = somatorio + numero;
			
			
		} while (numero > 0);
	 System.out.printf("O somatorio é : %d",somatorio);
		
		
		//Arreys
		//tipo[] nome = new tipo [tamnho];
/*		int [] numeros = new int [6];
		int total = 0, i=0;
		Scanner ent = new Scanner(System.in);
		
		for(i = 0; i< 6; i++) {
			System.out.printf("Digite o %d número: ", i+1);
			numeros [i] = ent.nextInt();
			total= total + numeros[i];
			System.out.printf("Total parcial : %d.\n",total );
		}
		
		System.out.printf("O valor total é: %d.", total);*/
		
		//break e continue
		/*System.out.println("Digie o número desejado: ");
		numero = entrada.nextInt();
		
		while (numero > 0) {
			somatorio = somatorio + numero;
			
			System.out.println("Digie o número desejado: ");
			numero = entrada.nextInt();
			if (numero == 18)
			 break;
		}
		System.out.printf("O somatorio foi: %d.",somatorio);
		*/
	}

}
