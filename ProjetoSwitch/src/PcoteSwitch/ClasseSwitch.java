package PcoteSwitch;
import java.util.Scanner;
public class ClasseSwitch {

	public static void main(String[] args) {
		char operacao = ' ';
		Scanner ent = new Scanner(System.in);
		double n1= 0, n2= 0, total= 0;
		
		System.out.println("digite o valor do primeiro n�mero: ");
		n1 = ent.nextDouble();
		
		System.out.println("digite o valor do segundo n�mero: ");
		n2 = ent.nextDouble();
		
		ent.nextLine();
		
		System.out.println("Didte a opera��o deseja(+, -, *,/,%): ");
		operacao = ent.nextLine().charAt(0);
		switch(operacao) {
		   case '+':
			   total = n1+n2;
			   break;
			
		   case '-':
			   total = n1-n2;
			   break;
			   
		   case '*':
			   total = n1*n2;
			   break;
			
		   case '/':
			   total = n1/n2;
			   break;
			  
			   
		   case '%':
			   total = n1%n2;
			   break;
			default:
				System.out.println("opera��o inv�lida.");
				
		
	}	
		if (operacao == '+' || operacao == '-'|| operacao =='*' || operacao == 
				'/' || operacao == '%')
		System.out.printf("%.2f %c %.2f = %.2f",n1 ,operacao, n2,total );
		
		
		
		
		
		

	}

}
