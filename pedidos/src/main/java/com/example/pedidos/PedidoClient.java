package com.example.pedidos;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import java.net.URI;
import java.net.URL;

class PedidoClient {

  public static void main(String args[]) throws Exception {
    URL url = URI.create("http://127.0.0.1:9876/pedido?wsdl").toURL();
    QName qname = new QName("http://pedidos.example.com/","PedidoServerImplService");
    Service ws = Service.create(url, qname);
    PedidoServer pedido = ws.getPort(PedidoServer.class);
    
    System.out.println(pedido.adicionarProduto("Produto 1", 10.0, 5));
    System.out.println(pedido.adicionarProduto("Produto 2", 10.0, 5));
    System.out.println(pedido.verPedido());
    
    URL url2 = URI.create("http://127.0.0.1:9876/produto?wsdl").toURL();
    QName qname2 = new QName("http://pedidos.example.com/","ProdutoServerImplService");
    Service ws2 = Service.create(url2, qname2);
    ProdutoServer produto = ws2.getPort(ProdutoServer.class);
    
    System.out.println(produto.qtdProduto());
  }
}
