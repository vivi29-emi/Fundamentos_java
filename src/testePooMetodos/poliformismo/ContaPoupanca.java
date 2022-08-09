package testePooMetodos.poliformismo;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
	
	private int diaRendimento;
	

	

	public int getDiaRendimento() {
		return diaRendimento;
	}




	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}




	@Override // <- Subescrevendo o método da class mãe
	public String toString() {
		String s = " Conta Poupança [";
		s += " diaRendimento:" + diaRendimento;
		s += ";" + super.toString(); // <- recebendo o toString da class mãe
		s += "]";
		return s ;
	}
	
	// Método para calcular o rendimento
	
	public boolean calcularNovoSaldo (double taxaRendimento) {
		
		//  pega a data do dia
		Calendar hoje = Calendar.getInstance();
		
		// regra na qual pega somente o dia
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			// pegando os atributos da class mãe para criar a lógica sendo mesmo que saldo += saldo * taxaRendimento
		        this.setSaldo(this.getSaldo()+ (this.getSaldo()* taxaRendimento));
		        return true;
		}
		return false;
	}

	
	
	
	
	
	

}
