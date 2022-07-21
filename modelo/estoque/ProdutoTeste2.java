package br.com.tecnicasdeprogramacao.ab.modelo.estoque;

import br.com.tecnicasdeprogramacao.ab.excecoes.PJCException;
import br.com.tecnicasdeprogramacao.ab.excecoes.PNEException;
import br.com.tecnicasdeprogramacao.ab.modelo.produto.Produto;

public class ProdutoTeste2 {
	
	public static void main(String[] args) throws PJCException, PNEException {
		
		EstoqueVector estoque2 = new EstoqueVector();
		
		Produto p1 = new Produto("1A");
		Produto p2 = new Produto("2A");
		Produto p3 = new Produto("3A");
		estoque2.adicionar(p1);
		estoque2.adicionar(p2);
		estoque2.adicionar(p3);
		
		p1.setQuantidade(5);
		p2.setQuantidade(0);
		p3.setQuantidade(7);
		
		System.out.println(estoque2.quantidade());
		
		p1.setNome("Arroz");
		p2.setNome("Feijao");
		p3.setNome("Macarrao");
		System.out.println(estoque2.produtosEmEstoque());
		System.out.println(estoque2.produtosEmFalta());
		
		System.out.println(estoque2.buscar("3A"));
		
		estoque2.apagar("3A");
		System.out.println(estoque2.produtosEmEstoque());
	}
}
