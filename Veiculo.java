package exercicios7;

import java.time.LocalDate;

public class Veiculo implements Oficina{
	
	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;
	
	public Veiculo(String modelo,  LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}
	
		
	public double getValorCobrado() {
		return valorCobrado;
	}

	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", valorCobrado=" + valorCobrado + ", dataConserto=" + 
				dataConserto  + ", proprietario=" + proprietario + "]";
	}


	@Override
	public double lavarVeiculo() {
		return valorCobrado = valorCobrado + TipoServico.LAVAR.getValorPorServico();
	}

	@Override
	public double trocarOleo() {

		if(dataConserto.getDayOfWeek().name().equals("SATURDAY"))
			valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico() - 50;
		else
			valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico();
		return valorCobrado;
	}

	@Override
	public double revisao() {
		if(dataConserto.getDayOfMonth() == 8)
			valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico() * 0.9;
		else
			 valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico();
		return valorCobrado;
		
	}
	
	
}
