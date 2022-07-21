package br.com.tecnicasdeprogramacao.ab.modelo.bodega;

import java.util.Vector;

import br.com.tecnicasdeprogramacao.ab.excecoes.PJCException;
import br.com.tecnicasdeprogramacao.ab.excecoes.PNEException;
import br.com.tecnicasdeprogramacao.ab.modelo.estoque.IEstoque;
import br.com.tecnicasdeprogramacao.ab.modelo.produto.Produto;

public class Bodega{
	
	private IEstoque estoque;
//	List<Produto> produtos = new ArrayList<>();
	
	public Bodega(IEstoque estoque) {
		this.estoque = estoque;
	}
	
	public void adicionarProduto(Produto produto){
		try {
			this.estoque.adicionar(produto);
		} catch (PJCException e) {
			System.out.println(e.getMessage());
		}
	}
	public void removerProduto(String codigo){
		try {
			this.estoque.apagar(codigo);
		} catch (PNEException e) {
			System.out.println(e.getMessage());
		}
	}
	public void venderProduto(String codigo, int quantidade) {
				//referenciei metodo dessa classe pq já tratei
				Produto produtoAchado = consultarProduto(codigo);
				if(produtoAchado != null) {
					produtoAchado.decrementarQuantidade(quantidade);
				}
			
	}
	public void estocarProduto(String codigo, int quantidade) {
			Produto produtoAchado = consultarProduto(codigo);
			if(produtoAchado != null) {
				produtoAchado.incrementarQuantidade(quantidade);
			}
	}
	
	public Produto consultarProduto(String codigo){
		Produto produtoTeste = null;
		try {
			 produtoTeste = this.estoque.buscar(codigo);
		} catch (PNEException e) {
			System.out.println(e.getMessage());
		}
		return produtoTeste;
	}
	
	public Vector<Produto> listarProdutos(){
		return estoque.produtosEmEstoque();
	}
	
	public Vector<Produto> listarProdutosEmFalta(){
		return this.estoque.produtosEmFalta();
	}
	
	
	
}
