package com.example.pedidos;

public class Produto {
	private String nome;
	private static int id = 0;
	private double preco;
	private int qtd;
	
	public Produto(String nome, double preco, int qtd) {
		setNome(nome);
		setId(id + 1);
		setPreco(preco);
		setQtd(qtd);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.trim().isEmpty()) {
			throw new IllegalArgumentException("Nome inválido");
		}
		
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}

	public static void setId(int id) {
		Produto.id = id;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 0) {
			throw new IllegalArgumentException();
		}
		
		this.preco = preco;
	}
	
	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		if (qtd <= 0) {
			throw new IllegalArgumentException();
		}
		
		this.qtd = qtd;
	}
}
