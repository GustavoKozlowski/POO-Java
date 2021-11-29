package exercicios7;

public enum TipoServico {
	
	OLEO(100),
	LAVAR(50),
	REVISAO(200);

	private double valorPorServico;

	private TipoServico(double valorPorServico) {
		this.valorPorServico = valorPorServico;
	}

	public double getValorPorServico() {
		return valorPorServico;
	}
	
	
}
