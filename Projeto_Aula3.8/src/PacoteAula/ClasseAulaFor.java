package PacoteAula;
import java.util.Scanner;
public class ClasseAulaFor {

	public static void main(String[] args) {

		
		//for (inicialização; condiação; incrimento)
		int i=0, j = 0;
		
		
		//*for (i = 0; i <= 5; i++) {
		//	System.out.printf("Valor de i: %d\n", i);
			//for (j= 0; j<3; j++) {
				//System.out.printf("	 Valor de j: %d\n", j);	
			//}	
		//} 
		
		for (i= 0; i <=10; i++) {
			System.out.printf("Tabuada do %d: \n", i);

			for (j =0; j <=10; j++) {
				System.out.printf("%d * %d =%d.\n", i, j, i*j );
				
			}
		}
	

		
		
		
		
		
		
		
		
		
	}

}
