package testePooMetodos;

public class testContaCorrente {

	public static void main(String[] args) {
		
		
		ContaCorrente conta = new ContaCorrente();
		conta.numero= "023654-9";
		conta.agencia ="2412";
		conta.especial = true;
		conta.limiteEspecial= 500;
		conta.saldo = 200;
		
		System.out.println("Saldo da conta" + conta.numero + " = " + conta.saldo);
		
		boolean efetuarSaque = conta.realizarSaque(5);
		
		if (efetuarSaque) {
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
			}else {
				System.out.println("Não foi possível realizar saque. Saldo insuficiente");
			}
		efetuarSaque = conta.realizarSaque(500);
		
		if (efetuarSaque) {
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
			}else {
				System.out.println("Não foi possível realizar saque. Saldo insuficiente");
			}
		System.out.println("Depósito de 500 reais");
		conta.depositar(500);
		conta.consultarSaldo();
		
		if (conta.verificarUsoCheqEspecial()) {
			System.out.println("Está usando cheque especial");
			} else {
				System.out.println("Não está usando o cheque especial");
			}

	}
	

}
