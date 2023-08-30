package com.market.projeto;



public class Cartao {
    protected String numero;
    protected String nome;
    protected String dataValidade;
    protected int cvv;
    protected String cpf;
    // coloquei get e set pro cartao
    public Cartao(String numero, String nome, String dataValidade, int cvv, String cpf){
            this.numero= numero;
            this.nome = nome;
            this.dataValidade = dataValidade;
            this.cvv = cvv;
            this.cpf = cpf;
        }
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
