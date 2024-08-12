package com.example.pedidos;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	private static int nrPedido = 0;
	private ArrayList<Produto> produtos;
	private Date data;
	private double valorTotal;
	
	public Pedido() {
		setData(Date.from(Instant.now()));
		produtos = new ArrayList<>();
		setNrPedido(nrPedido + 1);
	}

	public static int getNrPedido() {
		return nrPedido;
	}

	public static void setNrPedido(int nrPedido) {
		Pedido.nrPedido = nrPedido;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
}
