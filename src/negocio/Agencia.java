package negocio;

import auxiliar.Constantes;

public class Agencia implements  Interface{

	private int numero_agencia;
	private Endereco endereco;
	private Banco banco;
	private Pessoa gerente;

	public int getNumero_agencia() {
		return numero_agencia;
	}

	public void setNumero_agencia(int numero_agencia) {
		this.numero_agencia = numero_agencia;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	
	public Pessoa getGerente() {
		return gerente;
	}

	public void setGerente(Pessoa gerente) {
		this.gerente = gerente;
	}

	public void Exibir() {
		banco.Exibir();
		System.out.println("Agencia: "+getNumero_agencia());
		System.out.println("Gerente: "+gerente.getNome());
		 endereco.Exibir();
		Constantes.Exibir("l", 1);
	}

}
