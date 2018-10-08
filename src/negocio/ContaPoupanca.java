package negocio;

import auxiliar.Constantes;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Agencia agencia, int numero,Pessoa titular) {
        super(agencia, numero,titular);
    }

    @Override
    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor + Constantes.TAXA_IMPOSTO;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public boolean transfere(double valor,Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor + Constantes.TAXA_TRANSFERENCIA;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public void adicionarCabecalho() {
        System.out.println("#Conta#");
    }

    public void imprimirTipo() {
        adicionarCabecalho();
    }


}
