package ingressos_online.model;

import java.text.NumberFormat;

public abstract class Evento {
	
	private int id;
	private String nome;
	private int tipo;
	private float preco;
	
	public Evento(int id, String nome, int tipo, float preco) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void visualizar() {

		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();

		String tipo = "";

		switch (this.tipo) {
			case 1 -> tipo = "Show";
			case 2 -> tipo = "Festival";
			default -> tipo = "Inválido";
		}

		System.out.println("***************************************");
		System.out.println("DADOS DO EVENTO                        ");
		System.out.println("***************************************");
		System.out.println("ID do Evento: " + this.id);
		System.out.println("Nome do Evento: " + this.nome);
		System.out.println("Tipo do Evento: " + tipo);
		System.out.println("Preço do Evento: " + nfMoeda.format(this.preco));
	}
	
	
}
