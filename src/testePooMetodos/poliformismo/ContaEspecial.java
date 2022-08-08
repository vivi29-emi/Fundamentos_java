package testePooMetodos.poliformismo;

public class ContaEspecial extends ContaBancaria {

	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	 
	@Override
	public String toString() {
		
		String s = " Conta Especial [";
		s += " limite:" + limite;
		s += ";" + super.toString();
		s += "]";
		return s ;
	}
	
	// metodo que verificar se tem limiteEspecial e retorna o valor do limite atualizado
	public boolean sacar (double valor) {
		
		double saldoComLimite = this.getSaldo()+ limite;
		
		if ((saldoComLimite - valor) >= 0){
			this.setSaldo(this.getSaldo()-valor);
			return true;
			
		}
		return false;
	}
	
}
