package negocio;

import auxiliar.Constantes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

public class Pessoa implements  Interface{
	private String nome;
	private String cpf;
	private int idade;
	private String email;
	private ArrayList<String> contatos = new ArrayList<String>();
	private Endereco endereco;

	public void inserirContatos (String contato){
		contatos.add(contato);
	}

	public void listarContatos(){
		for (String contato:contatos){
			System.out.println(contato);
		}

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
		Constantes.Exibir("l", 1);
		System.out.println(
				"Nome: " + getNome() + "\nCPF: " + getCpf() + "\nIdade: " + getIdade() + "\nEmail: " + getEmail()+ "\nTelefones: ");
		listarContatos();
		endereco.Exibir();
		Constantes.Exibir("l", 1);
		
	}

}
