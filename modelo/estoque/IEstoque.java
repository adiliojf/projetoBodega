package br.com.tecnicasdeprogramacao.ab.modelo.estoque;

import java.util.Vector;

import br.com.tecnicasdeprogramacao.ab.excecoes.PJCException;
import br.com.tecnicasdeprogramacao.ab.excecoes.PNEException;
import br.com.tecnicasdeprogramacao.ab.modelo.produto.Produto;

public interface IEstoque {
	
	public void adicionar(Produto produto) throws PJCException;
	public Produto buscar(String codigo) throws PNEException;
	public void apagar(String codigo) throws PNEException;
	public int quantidade();//o somatório das quantidades de cada produto em estoque
	public Vector<Produto> produtosEmEstoque();
	public Vector<Produto> produtosEmFalta();
}