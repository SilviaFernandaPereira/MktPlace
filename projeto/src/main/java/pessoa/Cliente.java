package pessoa;

import java.util.ArrayList;

import com.market.projeto.Cartao;
import com.market.projeto.Endereco;

public class Cliente extends Pessoa {
    private static ArrayList <Cliente> lista_cliente = new ArrayList<>();

    static{
        Cliente pessoa = new Cliente("Lucas", "45454", "12/2/87", endereco, "Riba", "Batman", cartao);
		Cliente pessoa1 = new Cliente("Silvia", "12457896", "25/12/2000", endereco, "admin", "admin", cartao);

		
		Cliente.getLista_cliente().add(pessoa);
		Cliente.getLista_cliente().add(pessoa1);
		
    }
    public Cliente (String nome, String cpf, String dataNasc, Endereco endereco, String login,
    String senha, Cartao cartao) {
        super(nome, cpf, dataNasc, endereco, login, senha, cartao);
    }  
    public static ArrayList<Cliente> getLista_cliente() {
        return lista_cliente;
    }
}
