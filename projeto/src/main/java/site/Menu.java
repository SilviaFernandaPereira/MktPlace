package site;

import java.util.ArrayList;
import java.util.Scanner;

import com.market.projeto.Cartao;
import com.market.projeto.Endereco;

import enums.UnidadeFederal;
import pessoa.Cliente;
import pessoa.Funcionario;

public class Menu {
    
    String  frases[] = {"Ver lista de produtos", "Ver cartoes", "Adicionar novo cliente",
        "Adicionar novo produto","Adicionar Funcionarios"};

    public int opcoes (){
        int escolha;
        Scanner sc = new Scanner(System.in); // eu tinha jogado em escopo global, e ela rodou. sem precisar criar uma scannr para 

        for (int i = 0; i < frases.length; i++){
            System.out.println((i + 1) + ". " + frases[i]);
        }
        // poderia colocar essa frase e da linha 31 na array mas ia mexer no loop de cima 
        System.out.println("0 para sair\nEscolha uma opção");
        escolha = sc.nextInt();
        return escolha;
    }
    // coloquei a lista de produtos em um metodo, passando a lista de produtos como parametro, criada na linha 35
	public int verLista(ArrayList <Produto> lista_produto){
        int escolha;
		for (int i =0; i < lista_produto.size();i++){
			System.out.println((i + 1) + " " + lista_produto.get(i).getNome() + 
			", descrição: " + lista_produto.get(i).getDescricao() + ", R$ " +
			lista_produto.get(i).getValor());
		}
        System.out.println("\nEscolha o numero do seu produto\n\n0 para voltar");
        Scanner sc3 = new Scanner(System.in);
        escolha = sc3.nextInt();
        // nao adicionou a nada, só uma msg pra indicar que foi, da pra criar um carrinho ou alguma cobrança no cartao
        //mas nao sei ainda como
        System.out.println("\nAdicionado ao carrinho\n");
        return escolha;
    }
    public void verCartoes(ArrayList<Cliente> lista_cliente, String cpf){
        for(int i = 0; i < lista_cliente.size(); i++){
            if (lista_cliente.get(i).getCpf().equals(cpf)){
                System.out.println("Nome " + lista_cliente.get(i).getCartao().getNome());
                System.out.println("Num: " + lista_cliente.get(i).getCartao().getNumero()); 
                System.out.println("Val: " + lista_cliente.get(i).getCartao().getDataValidade()); 
                System.out.println("CVV : " + lista_cliente.get(i).getCartao().getCvv()); 
            }
        }
    }
        // recebe a lista de cliente e devolve ela atualizada
    public ArrayList<Cliente> add_cliente (ArrayList<Cliente> lista_cliente){
        String nome, cpf, dataNasc, login, senha;
        String cartao_nome, cartao_numero, cartao_dataValidade, cartao_cpf; // coloquei em outra linha pra facilitar
        int cartao_cvv;
        String end_rua, end_bairro, end_cidade, end_pais, end_complemento;
        int end_num;
        Scanner sc4 = new Scanner(System.in);
        Scanner sc5 = new Scanner(System.in);
        String frases2 [] = {"Nome: ", "CPF: ", "Data Nasc:", "Login: ", "Senha: ", "Numero: ", "Data Validade:",
    "CVV: ", "Rua: ", "Bairro: ", "Cidade: ", "País: ", "Complemento: ", "Cadastro iniciado", "Cadastro realizado",
    "Precisamos de um cartão", "Precisamos de um endereço"};
        // nova variavel pra escolha do UF
        int escolha_UF ;

        System.out.println(frases2[13] + "\n" + frases2[0]);
        nome = sc4.nextLine();
        cartao_nome = nome;
        System.out.println(frases2[1]);
        cpf = sc4.nextLine();
        cartao_cpf = cpf;
        System.out.println(frases2[2]);
        dataNasc = sc4.nextLine();
        System.out.println(frases2[3]);
        login = sc4.nextLine();
        System.out.println(frases2[4]);
        senha = sc4.nextLine();
        System.out.println(frases2[15] + "\n" + frases2[5]);
        cartao_numero = sc4.nextLine();
        System.out.println(frases2[6]);
        cartao_dataValidade = sc4.nextLine();
        System.out.println(frases2[7]);
        cartao_cvv = sc5.nextInt();
        System.out.println(frases2[16] + "\n" + frases2[8]);
        end_rua = sc4.nextLine();
        System.out.println(frases2[9]);
        end_bairro = sc4.nextLine();
        System.out.println(frases2[10]);
        end_cidade = sc4.nextLine();
        System.out.println(frases2[11]);
        end_pais = sc4.nextLine();
        System.out.println(frases2[12]);
        end_complemento = sc4.nextLine();
        System.out.println(frases2[5]);
        end_num = sc5.nextInt();
        System.out.println("Escoha um estado: ");
        for (UnidadeFederal estado: UnidadeFederal.values() ){
            System.out.println((estado.ordinal() + 1) + ": " + estado);
        }
        System.out.println("Escolha pelo número");
        escolha_UF = sc5.nextInt();
        UnidadeFederal uf_escolhido = UnidadeFederal.values()[escolha_UF - 1];
        System.out.println("Voce escolheu o estado:" + uf_escolhido);
        // cria um cartao e um endereço com as informações pedidas 
        // depois cria um cliente novo e usa os objetos como parametro

        Cartao cartao = new Cartao(cartao_numero, cartao_nome, cartao_dataValidade, cartao_cvv, cartao_cpf);
        Endereco endereco = new Endereco(end_rua, end_bairro, end_num, end_cidade, end_pais, end_complemento, uf_escolhido);
        Cliente cliente = new Cliente(cartao_nome, cartao_cpf, dataNasc, endereco, login, senha, cartao);
        // adiciona esse cliente novo a lista de cliente
        lista_cliente.add(cliente);
        // mensagem falando que foi bem sucedido
        System.out.println(frases2[14]);
        // devolve a lista atualizada
        return lista_cliente;
        }

        public ArrayList<Produto> add_produto(ArrayList <Produto> lista_produto){
                Scanner sc6 = new Scanner(System.in);
                Scanner sc7 = new Scanner(System.in);
                String nome, descricao;
                double valor;

                System.out.println("Nome do produto: ");
                nome = sc6.nextLine();
                System.out.println("Descrição: ");
                descricao = sc6.nextLine();
                System.out.println("Preço: ");
                valor = sc7.nextDouble();

                Produto produto = new Produto(nome, descricao, valor);
                // adiciona o produto a arraylist
                lista_produto.add(produto);
                System.out.println("Cadastrado com sucesso");
            return lista_produto;
        }
        public ArrayList<Funcionario> add_Funcionarios(ArrayList<Funcionario> lista_Funcionarios){
            Scanner sc8 = new Scanner(System.in);
            Scanner sc9 = new Scanner(System.in);
            String nome,cpf,dataNasc,login,senha;
            String end_rua, end_bairro, end_cidade, end_pais, end_complemento;
            String cartao_nome,cartao_numero,cartao_dataValidade,cartao_cpf;
            int cartao_cvv,end_num;
            String ctps,matricula;
          
            System.out.println("Digite o nome do Funcionário:");
            nome = sc8.nextLine();
            System.out.println("Digite seu cpf:");
            cpf = sc8.nextLine();
            cartao_cpf= cpf;
            System.out.println("Digite a data de nascimento:");
            dataNasc = sc8.nextLine();
            System.out.println("Digite a sua CTPS:");
            ctps = sc8.nextLine();
            System.out.println("Digite a sua matricula: ");
            matricula = sc8.nextLine();
            System.out.println("Digite a rua:");
            end_rua = sc8.nextLine();
            System.out.println("Digite o numero da sua casa: ");
            end_num = sc9.nextInt();
            System.out.println("Digite o seu bairro:");
            end_bairro = sc8.nextLine();
            System.out.println("Digite a sua cidade:");
            end_cidade = sc8.nextLine();
            System.out.println("Digite o seu País:");
            end_pais = sc8.nextLine();
            System.out.println("Informe algum complemento para o seu endereço:");
            end_complemento = sc8.nextLine();
            System.out.println("Escoha um estado: ");
            for (UnidadeFederal estado: UnidadeFederal.values() ){
                System.out.println((estado.ordinal() + 1) + ": " + estado);
            }
            System.out.println("Escolha pelo número");
            int escolha_UF = sc9.nextInt();
            UnidadeFederal uf_escolhido = UnidadeFederal.values()[escolha_UF - 1];
            System.out.println("Digite um login:");
            login = sc8.nextLine();
            System.out.println("Digite uma senha");
            senha = sc8.nextLine();
            System.out.println("Agora Para finalizarmos precisamos que nos informe um cartão valido\nDigite o numero do seu cartão");
            cartao_numero = sc8.nextLine();
            System.out.println("Digite o codigo de segurança do cartão");
            cartao_cvv = sc9.nextInt();
            System.out.println("Digite a data de validade do cartão");
            cartao_dataValidade = sc8.nextLine();
            System.out.println("agora para facilitar na sua proxima compra de um nome para o cartão registrado");
            cartao_nome = sc8.nextLine();

            Cartao cartao = new Cartao(cartao_numero, cartao_nome, cartao_dataValidade, cartao_cvv, cartao_cpf);
            Endereco endereco = new Endereco(end_rua, end_bairro, end_num, end_cidade, end_pais, end_complemento, uf_escolhido);
            Funcionario Funcionario = new Funcionario(nome, cpf, dataNasc, endereco, login, senha, ctps, matricula, cartao);
            lista_Funcionarios.add(Funcionario);
            System.out.println("Cliente cadastrado");
            return lista_Funcionarios;     
        }
    }
  
