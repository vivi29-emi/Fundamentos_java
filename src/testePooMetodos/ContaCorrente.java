package testePooMetodos;


public class ContaCorrente {

	String numero;
	String agencia;
	boolean especial ;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;
	
	// Pega o valor do saldo e o reduz de acordo com a quantia a sacar.
	boolean realizarSaque(double quantidadeASacar) {
		
		if (saldo >= quantidadeASacar) {
			saldo -= quantidadeASacar;
			return true;
			
		}else {
			// caso não tenha saldo na conta a regra abaixo verifica se o limite especial tem saldo
			if(especial) {
				double limite = limiteEspecial + saldo;
				if(limite >= quantidadeASacar) {
					saldo -= quantidadeASacar;
					
					return true;
				}else {
					
					return false;
				}
			}else {
				// não possui conta especial e não tem  saldo suficiente 
				return false;
			}
			
			
			
		}
	
	}
	void depositar (double valorDepositado) {
		saldo += valorDepositado;
	}
	
	void consultarSaldo() {
		System.out.println("Saldo atual da conta :"+ saldo);
	}
	
	boolean verificarUsoCheqEspecial() {
		return saldo < 0 ;
	}
	
	
}
