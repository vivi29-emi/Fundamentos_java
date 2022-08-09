package testePooMetodos.poliformismo;

public class TesteContaBancaria {
	

	public static void main (String [] args) {
		

		System.out.println("*** Teste conta Bancaria ***");
				
				
		// Estanciando a class contaBancaria
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente(" Maria da Abadiana");
        contaSimples.setNumConta(" 000123-4");
		
		
		contaSimples.depositar(100);
		realizarSaque(contaSimples,50);
		
		System.out.println(contaSimples);
		
		
		System.out.println("*** Teste conta Poupança ***");
		
		
		// Estanciando a class contaPoupanca
				ContaPoupanca contaPoupanca = new ContaPoupanca();
				contaPoupanca.setNomeCliente(" Maria da Abadiana");
				contaPoupanca.setNumConta(" 000123-5");
				contaPoupanca.setDiaRendimento(8);
				
				
				contaPoupanca.depositar(100);
				
				realizarSaque(contaPoupanca,50);
				realizarSaque(contaPoupanca,70);
				
				
				// lógica que pega a taxa de rendimendo e verifica se houve ou não de acordo com o dia.
				if(contaPoupanca.calcularNovoSaldo(0.5)) {
					
					System.out.println("Rendimento aplicado, novo saldo :" + contaPoupanca.getSaldo());
				}else {
					System.out.println("Não houve rendimento do data de hoje, saldo não atualizado");
				}
				
				System.out.println(contaPoupanca);
				
				
				System.out.println("*** Teste Conta Especial ***");
				
				
				// Estanciando a class contaEspecial
						ContaEspecial contaEspecial = new ContaEspecial();
						contaEspecial.setNomeCliente(" Maria da Abadiana");
						contaEspecial.setNumConta(" 000123-5");
					    contaEspecial.setLimite(100);
						
					    contaEspecial.depositar(100);
					    realizarSaque(contaEspecial,50);
						realizarSaque(contaEspecial,50);
						
						
			    System.out.println(contaEspecial);

		
	}
	
	// Método que verifica se o cliente possui saldo para realizar o saque
	private static void realizarSaque(ContaBancaria conta, double valor) {
		
		if (conta.sacar(valor)) {
			
			System.out.println("Saque efetuado com sucesso, saldo atual : " + conta.getSaldo());
		}else {
			System.out.println("Saldo insuficiente para saque : " + valor +";");
		}
	}
	

}
