package com.example.pedidos;

public class Main {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Produto 1", 20.0, 5);
		
		System.out.println(p1.toString());
		
		Produto p2 = new Produto("Produto 2", 15.0, 2);
		
		System.out.println(p2.toString());
		
		Pedido p = new Pedido();
		
		System.out.println(p.getData());
	}

}
