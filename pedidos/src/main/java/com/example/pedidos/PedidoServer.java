package com.example.pedidos;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface PedidoServer {
	@WebMethod String adicionarProduto(String nome, double preco, int qtd);
	@WebMethod String verPedido();
	//@WebMethod String alterarPedido();
}
