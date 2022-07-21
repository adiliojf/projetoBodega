package br.com.tecnicasdeprogramacao.ab.excecoes;


@SuppressWarnings("serial")
public class PJCException extends Exception{
	private String nomeDoAtributo;
	
	public PJCException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	@Override
	public String getMessage() {
		return String.format("O produto %s ja foi cadastrado." , nomeDoAtributo);
	}
}	
	

