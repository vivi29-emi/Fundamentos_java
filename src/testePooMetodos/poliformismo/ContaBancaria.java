package testePooMetodos.poliformismo;

public class ContaBancaria {
	
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	@Override
	public String toString() {
		
		String s = " Conta Bancaria [";
		s += " ; nomeCliente" + nomeCliente;
		s += " ; numConta" + numConta;
		s += " ; saldo" + saldo;
		s += "]";
		return s;
	}

	// Recebe o valor do cliente a ser depositado
	public void depositar(double valor) {
		saldo += valor;
	}
	// metodo que analise se o saldo da conta for maio ou = zero será permitido fazer o saque.
	public boolean sacar (double valor) {
		if ((saldo - valor) >= 0){
			saldo -= valor;
			return true;
			
		}
		return false;
	}

}
