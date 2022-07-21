package br.com.tecnicasdeprogramacao.ab.modelo.bodega;

import br.com.tecnicasdeprogramacao.ab.excecoes.PJCException;
import br.com.tecnicasdeprogramacao.ab.excecoes.PNEException;
import br.com.tecnicasdeprogramacao.ab.modelo.estoque.EstoqueArray;
import br.com.tecnicasdeprogramacao.ab.modelo.produto.Produto;

public class ProdutoTeste {
	
	public static void main(String[] args) throws PJCException, PNEException {
		Bodega bodega = new Bodega(new EstoqueArray());
		Produto p1 = new Produto("1A");
		Produto p2 = new Produto("2A");
		Produto p3 = new Produto("3A");
		Produto p4 = new Produto("4A");
		Produto p5 = new Produto("5A");
		p1.setNome("Arroz");
		p1.setQuantidade(6);
		
		p2.setNome("Feijao");
		p2.setQuantidade(0);
		
		p3.setNome("Macarrao");
		p3.setQuantidade(7);
		
		p4.setNome("Milho Verde");
		p4.setQuantidade(2);
		
		p5.setNome("Frango Congelado");
		p5.setQuantidade(7);
		
		bodega.adicionarProduto(p1);
		bodega.adicionarProduto(p2);
		bodega.adicionarProduto(p3);
		bodega.adicionarProduto(p4);
		bodega.adicionarProduto(p5);
		
		bodega.adicionarProduto(p1);//excecao
		bodega.consultarProduto("6A");//excecao
		bodega.removerProduto("6A");//excecao
		
		//TODO: manipulações de arquivos, entidade Auditoria e interface grafica
		bodega.removerProduto("4A");
		System.out.println("Produtos em estoque: " + bodega.listarProdutos());
		System.out.println("Produtos em falta: " + bodega.listarProdutosEmFalta());
		System.out.println(p1.getQuantidade());
		System.out.println("-------------------------------------");
		bodega.venderProduto("1A", 3);
		bodega.estocarProduto("2A", 11);
		System.out.println("Produtos em estoque: " + bodega.listarProdutos());
		System.out.println(p1.getQuantidade());
		System.out.println("-------------------------------------");
		bodega.venderProduto("1A", 2);
		System.out.println("Produtos em estoque: " + bodega.listarProdutos());
		System.out.println("Produtos em falta: " + bodega.listarProdutosEmFalta());
		System.out.println(p1.getQuantidade());
		
	}
}
