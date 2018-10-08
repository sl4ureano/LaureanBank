package negocio;

public class Endereco implements  Interface{

	private String uf;
	private String cidade;
	private String bairro;
	private String rua;
	private int numero;
	private String complemento;

	public String getUf() {
		return uf;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public void Exibir() {
		System.out.println("Endere?o: "+getRua()+" - "+getNumero()+ " - "+getComplemento()+" - "+getBairro()+" - "+getCidade()+" - "+getUf());		
	}

}
