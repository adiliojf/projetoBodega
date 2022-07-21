package br.com.tecnicasdeprogramacao.ab.modelo.estoque;

import java.util.Vector;

import br.com.tecnicasdeprogramacao.ab.excecoes.PJCException;
import br.com.tecnicasdeprogramacao.ab.excecoes.PNEException;
import br.com.tecnicasdeprogramacao.ab.modelo.produto.Produto;

public class EstoqueVector implements IEstoque{

	final private Vector<Produto> produtos = new Vector<>();
	
	@Override
	public void adicionar(Produto produto) throws PJCException{
		Produto produtoAchado = null;
		for(Produto produtoTeste: produtos) {
			if(produtoTeste.equals(produto)){
				produtoAchado = produtoTeste;
			}
		}
			if(produtoAchado == null) {
				this.produtos.add(produto);
			}else {
				throw new PJCException(produto.getCodigo());
			}
	}
	
	@Override
	public Produto buscar(String codigo) throws PNEException{
		Produto produtoAchado = null;
		for(Produto produtoTeste: produtos) {
			if(produtoTeste.getCodigo().equals(codigo)){
				produtoAchado = produtoTeste;
			}
		}
			if(produtoAchado == null) {
				throw new PNEException(codigo);
			}
			return produtoAchado;

	}
	
	@Override
	public void apagar(String codigo) throws PNEException {
		Produto produto = buscar(codigo);
		if(produto != null) {
			this.produtos.remove(produto);
		}
		
	}
	
	@Override
	public int quantidade() {
		int quantidadeTotal = 0;
		for(Produto produto: produtos) {
			quantidadeTotal += produto.getQuantidade();
		}
		return quantidadeTotal;
	}
	
	@Override
	public Vector<Produto> produtosEmEstoque() {
		Vector<Produto> vetor = new Vector<>();
		for(Produto produto: produtos) {
			if(produto.getQuantidade() > 0) {
				vetor.addElement(produto);
			}
		}
		return vetor;
		
	}
	
	@Override
	public Vector<Produto> produtosEmFalta() {
		Vector<Produto> vetor = new Vector<>();
		for(Produto produto: produtos) {
			if(produto.getQuantidade() == 0) {
				vetor.addElement(produto);
			}
		}
		return vetor;
	}

}
