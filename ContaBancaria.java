public class ContaBancaria {
private double saldo;

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

// nossos métodos

public void depositar(double valor) {
	if(valor <= 0 ) {
		System.out.println("Valor para depósito inválido!");
		return;
	}
	
	saldo = saldo + valor;	
}

	public static void main(String[] args) {
	ContaBancaria conta = new ContaBancaria();

	conta.setSaldo(2500);

	System.out.println("Novo Saldo: " + conta.getSaldo());
	
	}
}

