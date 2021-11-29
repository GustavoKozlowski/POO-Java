package exercicios7;

import java.time.LocalDate;

public class Moto extends Veiculo{
	
	private int cilindradas;

	public Moto(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario,
			int cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	@Override
	public double lavarVeiculo() {
		// TODO Auto-generated method stub
		return super.lavarVeiculo();
	}

	@Override
	public double trocarOleo() {
		// TODO Auto-generated method stub
		return super.trocarOleo();
	}

	@Override
	public double revisao() {
		// TODO Auto-generated method stub
		return super.revisao();
	}
	
	
}
