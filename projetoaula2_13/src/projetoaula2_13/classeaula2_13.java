package projetoaula2_13;

public class classeaula2_13 {

	public static void main(String[] args) {
     
		double nota1,nota2,nota3,nota4,frequencia,TotalNotas;
		char statusAluno;
		String nome;
		boolean aprovado;
		
		nome= "Ana Paula da silva Couto";
		statusAluno = 'M';
		nota1= 20;
		nota2 =0;
		nota3 = 20;
		nota4 = 5;
		
		frequencia = 0.80;
		
		TotalNotas = nota1+nota2+nota3+nota4;
		
		aprovado= TotalNotas >=70 && frequencia >= 0.75;
		
		System.out.printf("O aluno %s obteve nota final de %.2f e frequencia %.2f%%. A situação do(a) aluno(a) é %c\n"
				+ "Aluno aprovado? %b", nome, TotalNotas, frequencia, statusAluno, aprovado);
		
		
		
		
				
	}

}
