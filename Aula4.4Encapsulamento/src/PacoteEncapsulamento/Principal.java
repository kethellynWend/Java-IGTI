package PacoteEncapsulamento;

public class Principal {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.setnportas(4);
		c1.setMarca("Willys");
		c1.setMarca("Jipe 4x4");
		c1.setNcavalos(70);
		System.out.printf("Marca: %s.\n Modelo:%s\n Numero de Portas: %d.\n QCavalos: %d.\n", c1.getMarca(), c1.getModelo(), c1.getnpotas(), c1.getNcavalos());


		
	}

}
