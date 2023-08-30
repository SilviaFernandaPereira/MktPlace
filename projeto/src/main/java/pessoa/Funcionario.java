package pessoa;

import com.market.projeto.Cartao;
import com.market.projeto.Endereco;

public class Funcionario extends Pessoa {
    private String ctps;
    private String matricula;
    

public Funcionario(String nome, String cpf, String dataNasc, Endereco endereco, String login, String senha, String ctps, String matricula, Cartao cartao) {
    super(nome, cpf, dataNasc, endereco, login, senha, cartao);

    this.ctps = ctps;
    this.matricula = matricula;
}
}
