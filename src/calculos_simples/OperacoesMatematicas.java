package calculos_simples;

public class OperacoesMatematicas {
	
	private double primeiroNumero;
	private String operacao;
	private double segundoNumero;
	
	public double calcular(double primeiroNumero, String operacao, double segundoNumero) {
		double resultado = 0;
		if(operacao.equals("+")) {
			resultado = primeiroNumero + segundoNumero;
		}
		if(operacao.equals("-")) {
			resultado = primeiroNumero - segundoNumero;
		}
		if(operacao.equals("*")) {
			resultado = primeiroNumero * segundoNumero;
		}
		if(operacao.equals("/") && segundoNumero != 0) {
			resultado = primeiroNumero / segundoNumero;
		}
		return resultado;
	}

	public double getPrimeiroNumero() {
		return primeiroNumero;
	}

	public void setPrimeiroNumero(double primeiroNumero) {
		this.primeiroNumero = primeiroNumero;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public double getSegundoNumero() {
		return segundoNumero;
	}

	public void setSegundoNumero(double segundoNumero) {
		this.segundoNumero = segundoNumero;
	}
	
	
}
