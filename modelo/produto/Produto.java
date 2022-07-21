package br.com.tecnicasdeprogramacao.ab.modelo.produto;

public class Produto {
	
	private String codigo;
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		try {
			if(quantidade >= 0) {
				this.quantidade = quantidade;
			}else {
				throw new IllegalArgumentException("Fora do range.");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void decrementarQuantidade(int quantidade) {
		try {
			if(quantidade > 0 && getQuantidade() > 0) {
				this.quantidade -= quantidade;
			}else {
				throw new IllegalArgumentException("Fora do range.");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void incrementarQuantidade(int quantidade) {
		try {
			if(quantidade > 0) {
				this.quantidade += quantidade;
			}else {
				throw new IllegalArgumentException("Fora do range.");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public String toString() {
		return codigo + " = "+ nome;
	}
	
}
