package negocio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Conta   {

    protected double saldo;
    private Agencia agencia;
    private int numero;
    private  Pessoa titular;
    private Calendar ultima_transacao = Calendar.getInstance();
    private DateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm");


    public Conta(Agencia agencia, int numero, Pessoa titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public Calendar getUltima_transacao() {
        return ultima_transacao;
    }

    public void setUltima_transacao(Calendar ultima_transacao) {
        this.ultima_transacao = ultima_transacao;
    }

    public abstract void deposita(double valor);


    public abstract boolean saca(double valor);


    public abstract boolean transfere(double valor, Conta destino);

    public abstract void imprimirTipo();

    protected abstract void adicionarCabecalho();


    public double getSaldo() {
        return this.saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return this.numero;
    }


    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Não pode valor menor ou igual a 0");
            return;
        }
        this.numero = numero;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void Exibir() {
        System.out.println("Número da Conta: " + getNumero() + "\nSaldo: R$ " + getSaldo() +"\nDia e Hora: " +  df.format(ultima_transacao.getTime()));
    }
}
