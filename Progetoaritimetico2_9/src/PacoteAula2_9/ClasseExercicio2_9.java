package PacoteAula2_9;
 
import java.math.*;
public class ClasseExercicio2_9 {

	public static void main(String[] args) {
		//x^2 +12x -13=0
		// 2^2 +16x-18=0
		
		double a,b,c ;
		a= 2;
		b=-16;
		c=-18;
		
		double delta = 0;
		delta= (b*b) - (4*a*c);
		
		System.out.printf("O valor de Delta é: %.2f\n", delta);
		
		double x_linha =0;
		x_linha = (-b+ Math.sqrt(delta)) / (2*a); 
		System.out.printf("O valor de x' é: %.0f\n", x_linha);
		
		double x_2linha =0;
		x_2linha = (-b - Math.sqrt(delta)) / (2*a);
		System.out.printf("O valor de x'' é: %.0f", x_2linha);

	}

}
