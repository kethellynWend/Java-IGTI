package pacoteleitradedados;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.*;
public class ClasseLeituradeDados {
	
	public static void main(String[] args) {
 
		try {
		FileWriter arquivo = new FileWriter ("C:\\Users\\Kethellyn\\SaidaDados.txt.txt");
		PrintWriter gravarArquivos = new PrintWriter(arquivo);
		
		for (int i = 0; i < 1000; i++){
		   gravarArquivos.printf("Valor do i: %d%n", i);
		   
		
		}
		gravarArquivos.close();
		arquivo.close();
		
		
			
			
		} catch (IOException e){
			System.out.println("Ocorreu um erro ao gravar o arquivo" + e.getMessage());
			
			
		}
		System.out.println("Fim da execução.");
		
		
		
		/*try {
			
			FileReader arquivo = new FileReader("C:\\Users\\Kethellyn\\arquivoDados.txt.txt");
			BufferedReader lerArquivo = new BufferedReader(arquivo);
			
			String linha;
			linha= lerArquivo.readLine();
			
			System.out.println("");
			
				while(linha!= null) {
					
					String[] dadosCliente = new String[4];
					dadosCliente = linha.split(";");
					
					
					System.out.printf("Codigo do cliente: %s. \n Nome do Cliente: %s. \n Endereço:%s. \n Cidade: %s. \n", dadosCliente[0], dadosCliente[1], dadosCliente[2],dadosCliente[3]);

					linha= lerArquivo.readLine();
					System.out.println("");
					
				
					
				}
				lerArquivo.close();
				arquivo.close();
				
		} catch (IOException e){
			System.out.println("Erro lendo dados: " + e.getMessage());
			
		}*/
	}

}
