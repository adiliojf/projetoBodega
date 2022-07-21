
package br.com.tecnicasdeprogramacao.ab.excecoes;


@SuppressWarnings("serial")
public class PNEException extends Exception{
	
	private String nomeDoAtributo;
	
	public PNEException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	@Override
	public String getMessage() {
		return String.format("O produto %s nao foi encontrado.", nomeDoAtributo);
	}
}	
	

