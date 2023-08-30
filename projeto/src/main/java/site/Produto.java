package site;

import java.util.ArrayList;

public class Produto {
    protected String nome;
    protected String descricao;
    protected double valor;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Produto( String nome, String descricao, double valor){
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }
    private static ArrayList <Produto> lista_produto = new ArrayList<> ();

    static {
        Produto bola = new Produto("Bola", "Bola redonda cheia", 120.00);
		Produto apito = new Produto("Apito", "Apito de índio ", 20.00);
		Produto ps5 = new Produto("Playstation 5", "Novo com controle", 3000.00);
		Produto xbox = new Produto("Xbox One", "Novo com controle", 2500.00);
		Produto pcGamer = new Produto("Pc Gamer", "Intel I9, 48gb de Ram, SSd 1Tb, Placa de Vídeo RTX 4080TI", 15000.00);
		Produto nSwitch = new Produto("Switch", "Usado", 50.00);
	
				
		Produto.getLista_Produto().add(bola);
		Produto.getLista_Produto().add(apito);
		Produto.getLista_Produto().add(ps5);
		Produto.getLista_Produto().add(xbox);
		Produto.getLista_Produto().add(pcGamer);
		Produto.getLista_Produto().add(nSwitch);

    }
    public static ArrayList<Produto> getLista_Produto() {
        return lista_produto;

        
    }
    }

    
