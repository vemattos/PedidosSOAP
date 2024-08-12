package com.example.pedidos;

import javax.xml.ws.Endpoint;

public class PedidoServerPublisher {

  public static void main(String[] args)
  {
    Endpoint.publish("http://127.0.0.1:9876/pedido",
    new PedidoServerImpl());
    
    Endpoint.publish("http://127.0.0.1:9876/produto",
    	    new ProdutoServerImpl());
  }
}
