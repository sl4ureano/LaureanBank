package testes;

import negocio.*;
import auxiliar.*;
import java.util.ArrayList;

public class TestaAplicacao {
	public static void main(String[] args)  {


		///////////////////////// Constantes //////////////////////
		Constantes.Exibir("Bank System 2.0", 1);

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
		Adriano.setCpf("255.055.838-40");
		Adriano.setIdade(21);
		Adriano.setEmail("sl4ureano@outlook.com");
		Adriano.inserirContatos("(21)3868-4518");
		Adriano.inserirContatos("(21)3697-0419");
		Adriano.inserirContatos("(21)3868-4518");
		Adriano.inserirContatos("(21)3697-0419");
		Adriano.setEndereco(enderecoAdriano);
		Adriano.Exibir();


		////////////////// Primeiro Gerente //////////////////////
		Endereco enderecoGerente = new Endereco();
		enderecoGerente.setRua("Rua do Carmo");
		enderecoGerente.setUf("RJ");
		enderecoGerente.setCidade("Rio de Janeiro");
		enderecoGerente.setBairro("Centro");
		enderecoGerente.setNumero(985);
		enderecoGerente.setComplemento("Apt 350");

		Pessoa Marcio = new Pessoa();
		Marcio.setNome("Marcio Silva");
		Marcio.setCpf("265.065.737-40");
		Marcio.setIdade(61);
		Marcio.setEmail("gerente@bradesco.com");
		Marcio.setEndereco(enderecoGerente);

		///////////////////// Primeiro Banco /////////////////////
		Banco banco_bradesco = new Banco();
		banco_bradesco.setNome("Bradesco");
		banco_bradesco.setId(800);

		///////////////////// Segundo Banco /////////////////////
		Banco banco_laurean = new Banco();
		banco_laurean.setNome("Laurean Bank");
		banco_laurean.setId(980);

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
		agenciaCentro.setGerente(Marcio);
		agenciaCentro.Exibir();

        Conta contaCorrenteAdriano = new ContaCorrente(agenciaCentro,36410,Adriano);
        contaCorrenteAdriano.imprimirTipo();
        contaCorrenteAdriano.deposita(200);
        contaCorrenteAdriano.Exibir();


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
        Joao.inserirContatos("(21)9868-5875");
        Joao.inserirContatos("(21)3698-5898");
        Joao.setEndereco(enderecoJOAO);
        Constantes.Exibir("Bank System 2.0", 1);
        Joao.Exibir();


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
        agenciaNiteroi.setBanco(banco_laurean);
        agenciaNiteroi.setGerente(Marcio);
        agenciaNiteroi.Exibir();


        Conta contaCorrenteJoao = new ContaCorrente(agenciaNiteroi,24442,Joao);
        contaCorrenteJoao.deposita(300);
        //contaCorrenteJoao.transfere(100,contaCorrenteAdriano);
        System.out.println(contaCorrenteJoao.transfere(100, contaCorrenteAdriano) ? "Transferencia Efetuada com Sucesso!"
                : "Você não Possui fundos para essa transferência!");
        Constantes.Exibir("l", 1);
		contaCorrenteJoao.imprimirTipo();
        contaCorrenteJoao.Exibir();




	}

}
