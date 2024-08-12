package com.example.pedidos;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.pedidos.ProdutoServer")
public class ProdutoServerImpl implements ProdutoServer {

	@Override
	public int qtdProduto() {
		return 40;
	}
	
}
