package com.market.projeto;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import enums.UnidadeFederal;
import pessoa.Cliente;
import pessoa.Funcionario;
import site.Menu;
import site.Produto;

@SpringBootApplication
public class ProjetoApplication {

	/*
	 * TODO LIST romulo
	 * colocar menu para funcionario e menu para cliente 
	 * colocar um check na funcao logar pra falar se e func ou cliente
	 * colocar as opçoes do menu como enm, e os produtos
	 * criar carrinho com array list
	 * opção de ver carrinho nos dois menus , funcionario escolhe qual cliente ele quer ver o carrinho
	 * o cliente so do proprio
	 * opção de ver clientes cadastrados no funcionario
	 * talvez criar um historico de compras do cliente
	 * serializar as listas  ??
	 */

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
		boolean terminou = false;
		int escolha; // coloquei pra saber qual indice do menu
		String cliente_logado = "0"; // mudei para string para identificar qual cliente logou pelo cpf
		Endereco endereco = new Endereco("Rua Uniao Industria","Itaipava", 420,"Petropolis","Brasil", "bl 2",UnidadeFederal.RJ);
		Cartao cartao = new Cartao("a","s","12",455, "454");

		
		// Produto bola = new Produto("Bola", "Bola redonda cheia", 120.00);
		// Produto apito = new Produto("Apito", "Apito de índio ", 20.00);
		// Produto ps5 = new Produto("Playstation 5", "Novo com controle", 3000.00);
		// Produto xbox = new Produto("Xbox One", "Novo com controle", 2500.00);
		// Produto pcGamer = new Produto("Pc Gamer", "Intel I9, 48gb de Ram, SSd 1Tb, Placa de Vídeo RTX 4080TI", 15000.00);
		// Produto nSwitch = new Produto("Switch", "Usado", 50.00);
	
		// ArrayList <Produto> lista_produto = new ArrayList<>();
		// ArrayList <Funcionario> lista_Funcionarios = new ArrayList<>();
		
		// lista_produto.add(bola);
		// lista_produto.add(apito);
		// lista_produto.add(ps5);
		// lista_produto.add(xbox);
		// lista_produto.add(pcGamer);
		// lista_produto.add(nSwitch);
		/*
		System.out.println("Bem vindo" + "\n" + "Login" );
		login = sc.nextLine();
		System.out.println("Senha: ");
		senha = sc.nextLine();
		Retirei essas linhas pq o metodo ja escreve elas 
		*/
		// Guardei o retorno da função em uma variavel, então se der true no metodo ele sai do looping
		while(cliente_logado.equals("0")){
			cliente_logado = logar(Cliente.getLista_cliente());
		}
		Menu menu = new Menu();
		while (!terminou){
			escolha = menu.opcoes();
			switch(escolha){
				case 1:
					menu.verLista(lista_produto);
					break;
				case 2:
					menu.verCartoes(Cliente.getLista_cliente(), cliente_logado);
					break;
				case 3:
					menu.add_cliente(Cliente.getLista_cliente());
					break;
				case 4:
					menu.add_produto(lista_produto);
					break;
				case 5:
					menu.add_Funcionarios(lista_Funcionarios);
					break;
				case 0:
					terminou = true;
					break;
				default :
					escolha = menu.opcoes();
			}
		}

		}
		public static String logar(ArrayList<Cliente> lista_cliente){
			Scanner sc2 = new Scanner(System.in);
			String nome, senha;
			System.out.println("Bem vindo" + "\n" + "Login" );
			nome = sc2.nextLine();
			System.out.println("Senha: ");
			senha = sc2.nextLine();
			
			for (int i = 0; i < lista_cliente.size(); i++){
				if (nome.equals(lista_cliente.get(i).getLogin())
				 & senha.equals(lista_cliente.get(i).getSenha())){					
						System.out.println("\nVocê está sendo direcionado\n");								
						return lista_cliente.get(i).getCpf(); // retorna o cpf pra gente saber qual cliente esta logado
				} 
			}
			System.out.println("\nLogin ou Senha incorretos\n");			
			return "0";
		}
	}
		

