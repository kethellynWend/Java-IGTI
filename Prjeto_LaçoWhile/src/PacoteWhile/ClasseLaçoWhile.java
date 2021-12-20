package PacoteWhile;
import java.util.Scanner;
public class ClasseLaçoWhile {

	public static void main(String[] args) {
		char saida = 'N';
		Scanner entrada =new Scanner(System.in);
		int numero= 0, somatorio= 0, contaNumeros= 0;
		
		
		while (saida != 'S') {
			System.out.println("Digite um numero:     ");
			numero = entrada.nextInt();
			entrada.nextLine();
			System.out.println("Gostaria de sair (S - sim N - não)?");
			saida = entrada.nextLine().charAt(0);
			somatorio = somatorio + numero;
			contaNumeros ++;
		}
		System.out.printf("O somatório é: %d.\n", somatorio);
		System.out.printf("Foram digitados %d números", contaNumeros);

		}
	

}

