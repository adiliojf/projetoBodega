package br.com.tecnicasdeprogramacao.ab.modelo.produto;

public class ProdutoPerecivel extends Produto{

	private String validade;
	
	public ProdutoPerecivel(String codigo) {
		super(codigo);
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}
	
	
}
