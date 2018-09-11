package negocio;

public class Agencia {

	private int numero_agencia;
	private Endereco endereco;
	private Banco banco;

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

	public void Exibir() {
		banco.Exibir();
		System.out.println("Agencia: "+getNumero_agencia());	
		 endereco.Exibir();
	}

}
