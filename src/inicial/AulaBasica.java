package inicial;

import java.util.Scanner;

import calculos_simples.OperacoesMatematicas;

public class AulaBasica {
	
	public static void main(String[] args) {
		OperacoesMatematicas operacao = new OperacoesMatematicas();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro numero: ");
		double primeiroNumero = entrada.nextDouble();
		
		System.out.print("Informe o tipo da operacao: ");
		String op = entrada.next();
		
		System.out.print("Informe o segundo numero: ");
		double segundoNumero = entrada.nextDouble();
		
		System.out.println("\nResultado da operacao = " + operacao.calcular(primeiroNumero, op, segundoNumero));
	}

}
