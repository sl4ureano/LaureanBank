package negocio;

import java.util.Iterator;

public class Pessoa {
	private String nome;
	private String cpf;
	private int idade;
	private String email;
	private String[] contatos;
	private Endereco endereco;
	

	public String[] getContatos() {
		return contatos;
	}

	public void setContatos(String[] contatos) {
		this.contatos = contatos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void Exibir() {
		System.out.println(
				"Nome: " + getNome() + "\nCPF: " + getCpf() + "\nIdade: " + getIdade() + "\nEmail: " + getEmail()+ "\nTelefones: ");
		for (String contato : getContatos()) {System.out.println("           " +contato);}		
		endereco.Exibir();
		
	}

}
