package desafios;

public class Desafio01 {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Jose", 80.50);
		Comida c1 = new Comida("Arroz", 0.350);
		
		System.out.println("\nNome: " + p1.nome + ", Peso da pessoa: "+ p1.peso 
						+ "\nComida: " + c1.nome + ", pesso comida: " + c1.pesoComida);
		
		p1.comer(c1);
		
		System.out.println("\nNome: " + p1.nome + ", Peso da pessoa: "+ p1.peso 
		+ "\nComida: " + c1.nome + ", pesso comida: " + c1.pesoComida);
	}

}
