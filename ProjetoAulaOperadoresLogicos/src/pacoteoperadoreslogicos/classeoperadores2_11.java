package pacoteoperadoreslogicos;

public class classeoperadores2_11 {

	public static void main(String[] args) {

		boolean treseq, prc, c10e, rsc;
		treseq = true;
		prc = true;
		c10e = true;
		rsc = false;
		
		boolean concederemprestimo = (treseq && prc || c10e) && !rsc;
		
		System.out.printf("Emprestimo concedido? %b\n",concederemprestimo);
	}

}
