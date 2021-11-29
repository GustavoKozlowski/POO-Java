package exercicios7;

import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {
		  Proprietario proprietario1 = new Proprietario("Tory Lanez");
		   Carro carro = new Carro("Honda Civic", LocalDate.of(2020, 8, 8),proprietario1,"Zabaletaaaa");
		   
		   carro.trocarOleo();
		   carro.revisao();
		   
		   System.out.println ("Proprietário: " + proprietario1.getNome() +"\n" + "Veiculo: " + carro.toString());
		 
	}

}
