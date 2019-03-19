package atividade03;

public class ContaCorrente {
	int Numero;
	double Saldo;
	

	
	ContaCorrente(){}
	public void setNumero(int Numero) {
		this.Numero = Numero;
	}
	public void setSaldo(double Saldo) {
		this.Saldo = Saldo;
	}
	
	public int getNumero() {
		return this.Numero;
	}
	public double getSaldo() {
		return this.Saldo;
	}

	void Depositar(double Valor){
		Saldo = (Saldo+Valor);
	}
	void Sacar(double Sacar) {
		Saldo = (Saldo-Sacar);
	}
	void mostrarSaldo () {
		System.out.println(Saldo);
	}

}
