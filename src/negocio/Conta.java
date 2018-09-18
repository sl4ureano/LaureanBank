package negocio;
import auxiliar.*;

public class Conta {

	private double saldo;	
	private int numero;
	private Agencia agencia;
	private Pessoa titular;
	

	public void Desposita(double valor) {
		this.saldo += valor;
	}

	public boolean Saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean Transfere(double valor,Conta destino) {		
		if (this.saldo >= valor) {			
			this.saldo -= valor + Constantes.TAXA_TRANSFERENCIA;
			destino.Desposita(valor);
			return true;
		}
		return false;		
	}	
	
	public double getSaldo() {
		return saldo;
	}	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Pessoa getTitular() {
		return titular;
	}

	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}

	public void Exibir() {
		System.out.println("Número da Conta: " + getNumero() + "\nSaldo: R$ " + getSaldo());
	}
}
