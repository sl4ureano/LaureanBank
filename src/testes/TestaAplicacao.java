package testes;

import negocio.*;
import auxiliar.*;

public class TestaAplicacao {
	public static void main(String[] args) {
         
		Banco banco_bradesco = new Banco();
		banco_bradesco.setNome("Bradesco");
		banco_bradesco.setId(800);		
		
		///////////////////////// Constantes //////////////////////
		Constantes constantes = new Constantes();
		constantes.Exibir("Bank System 2.0", 1);

		///////////////////////// Primeira Pessoa//////////////////////
		Endereco enderecoAdriano = new Endereco();
		enderecoAdriano.setRua("Rua do Carmo");
		enderecoAdriano.setUf("RJ");
		enderecoAdriano.setCidade("Rio de Janeiro");
		enderecoAdriano.setBairro("Centro");
		enderecoAdriano.setNumero(985);
		enderecoAdriano.setComplemento("Apt 350");

		Pessoa Adriano = new Pessoa();
		Adriano.setNome("Adriano Laureano");
		Adriano.setCpf("165.065.737-40");
		Adriano.setIdade(21);
		Adriano.setEmail("sl4ureano@outlook.com");
		Adriano.setEndereco(enderecoAdriano);
		constantes.Exibir("l", 1);
		Adriano.Exibir();
		constantes.Exibir("l", 1);

		///////////////////////// Primeira Conta//////////////////////
		Conta contaAdriano = new Conta();
		contaAdriano.setNumero(36410);
		contaAdriano.Desposita(50);
		contaAdriano.Saca(20);
		contaAdriano.Exibir();
		constantes.Exibir("l", 1);

		///////////////////////// Primeira Agencia //////////////////////
		Endereco enderecoAgenciaCentro = new Endereco();
		enderecoAgenciaCentro.setRua("AV Presidente Vargas");
		enderecoAgenciaCentro.setUf("RJ");
		enderecoAgenciaCentro.setCidade("Rio de Janeiro");
		enderecoAgenciaCentro.setBairro("Centro");
		enderecoAgenciaCentro.setNumero(1800);
		enderecoAgenciaCentro.setComplemento("Proximo a Estação da Urugaiana");

		Agencia agenciaCentro = new Agencia();
		agenciaCentro.setNumero_agencia(6980);
		agenciaCentro.setEndereco(enderecoAgenciaCentro);
		agenciaCentro.setBanco(banco_bradesco);
		agenciaCentro.Exibir();
		constantes.Exibir("l", 1);
		constantes.Exibir("n", 6);
		////////////////////////////////////////////////////////////

		///////////////////////// Segunda Pessoa//////////////////////
		Endereco enderecoJOAO = new Endereco();
		enderecoJOAO.setRua("Rua das Paineiras");
		enderecoJOAO.setUf("RJ");
		enderecoJOAO.setCidade("Rio de Janeiro");
		enderecoJOAO.setBairro("Centro");
		enderecoJOAO.setNumero(658);
		enderecoJOAO.setComplemento("Apt 999");

		Pessoa Joao = new Pessoa();
		Joao.setNome("João Fernandez");
		Joao.setCpf("885.085.938-80");
		Joao.setIdade(63);
		Joao.setEmail("joao@gmail.com");
		Joao.setEndereco(enderecoJOAO);
		constantes.Exibir("Bank System 2.0", 1);
		Joao.Exibir();
		constantes.Exibir("l", 1);

		///////////////////////// Segunda Conta//////////////////////
		Conta contaJoao = new Conta();
		contaJoao.setNumero(69685);
		contaJoao.Desposita(17005);
		contaJoao.Saca(680);
		contaJoao.Exibir();
		constantes.Exibir("l", 1);

		///////////////////////// Segunda Agencia //////////////////////
		Endereco enderecoAgenciaNiteroi = new Endereco();
		enderecoAgenciaNiteroi.setRua("AV Presidente Vargas");
		enderecoAgenciaNiteroi.setUf("RJ");
		enderecoAgenciaNiteroi.setCidade("Rio de Janeiro");
		enderecoAgenciaNiteroi.setBairro("Centro");
		enderecoAgenciaNiteroi.setNumero(1800);
		enderecoAgenciaNiteroi.setComplemento("Proximo a Estação da Urugaiana");

		Agencia agenciaNiteroi = new Agencia();
		agenciaNiteroi.setNumero_agencia(8065);
		agenciaNiteroi.setEndereco(enderecoAgenciaNiteroi);
		agenciaNiteroi.setBanco(banco_bradesco);
		agenciaNiteroi.Exibir();
		constantes.Exibir("l", 1);

		///////////////////////////// Transferencia///////////////////////////////
		System.out.println(contaJoao.Transfere(800, contaAdriano) ? "Transferencia Efetuada com Sucesso!"
				: "Você não Possui fundos para essa transferência!");
		constantes.Exibir("l", 1);
		constantes.Exibir("n", 6);
		
		///////////////////////////// Exibindo Extrato da Primeira Conta Novamente///////////////////////////////
		constantes.Exibir("Bank System 2.0", 1);
		constantes.Exibir("l", 1);
		Adriano.Exibir();
		constantes.Exibir("l", 1);
		contaAdriano.Exibir();
		constantes.Exibir("l", 1);
		agenciaCentro.Exibir();
		constantes.Exibir("l", 1);
		constantes.Exibir("n", 6);		

	}

}
