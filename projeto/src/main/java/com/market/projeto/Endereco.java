package com.market.projeto;

import enums.UnidadeFederal;

public class Endereco {
    protected String rua;
    protected String bairro;
    protected int num;
    protected String cidade;
    protected String pais;
    protected String complemento;
    UnidadeFederal uf;

    public Endereco(String rua, String bairro, int num, String cidade, String pais, String complemento, UnidadeFederal uf){
        this.rua = rua;
        this.bairro = bairro;
        this.num = num;
        this.cidade = cidade;
        this.pais = pais;
        this.complemento = complemento;
        this.uf = uf;
    }
    
}
