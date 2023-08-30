package pessoa;

import com.market.projeto.Cartao;
import com.market.projeto.Endereco;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String dataNasc;
    protected static Endereco endereco;
    protected String login;
    protected String senha;
    protected static Cartao cartao;
    
    public Pessoa (String nome, String cpf, String dataNasc, Endereco endereco, String login, String senha, Cartao cartao) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.login = login;
        this.senha = senha;
        this.cartao = cartao;
    
    }
    public Cartao getCartao() {
        return cartao;
    }
    
    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }




    
}
