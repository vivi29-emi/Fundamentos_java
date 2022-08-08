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




	@Override
	public String toString() {
		String s = " Conta Poupança [";
		s += " diaRendimento:" + diaRendimento;
		s += ";" + super.toString();
		s += "]";
		return s ;
	}
	
	// Metodo para calcular o rendimento
	
	public boolean calcularNovoSaldo (double taxaRendimento) {
		
		// para pegar a data do dia no java
		Calendar hoje = Calendar.getInstance();
		
		// regra na qual pega somente o dia
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			// pegando os atributos da class mae para criar a lógica sendo mesmo que saldo += saldo * taxaRendimento
		        this.setSaldo(this.getSaldo()+ (this.getSaldo()* taxaRendimento));
		        return true;
		}
		return false;
	}

	
	
	
	
	
	

}
