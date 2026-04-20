package model;

public class Banco {
    
    private int numero;
    private double saldo;
    private double limite;
    private String nome;
    
    public Conta(int numero, String nome, double saldo, double limite) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

  
    public boolean saca(double valor) {
        if (valor <= (saldo + limite)) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void deposita(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

 
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}