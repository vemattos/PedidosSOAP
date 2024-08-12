package com.example.pedidos;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.pedidos.PedidoServer")
public class PedidoServerImpl implements PedidoServer {
	private Pedido pedido;
	
	public PedidoServerImpl() {
		pedido = new Pedido();
	}

	@Override
	public String adicionarProduto(String nome, double preco, int qtd) {
		try {
			Produto p = new Produto(nome, preco, qtd);
			pedido.getProdutos().add(p);
		} catch (Exception e) {
			return e.getMessage();
		}
		
		return "Produto adicionado";
	}

	@Override
	public String verPedido() {
		String s = "";
		
		for (Produto p : pedido.getProdutos()) {
			s += p.getNome() + "\n";
		}
		
		return s;
	}

}
