package negocio;

public class Banco implements  Interface {
	private String nome;
	private int id;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	

	public void Exibir() {
		System.out.println("Nome do Banco: " + getNome());
	}
}
