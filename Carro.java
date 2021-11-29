package exercicios7;

import java.time.LocalDate;

public class Carro extends Veiculo {
	private String categoria;

	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario,
			String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
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
