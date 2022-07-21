package br.com.tecnicasdeprogramacao.ab.visao;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame{
	
	public TelaPrincipal() {
		
		add(new PainelDaBodega()); 
		setTitle("Bodega do Turgueniev");
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	

	}
	
	public static void main(String[] args) {
		new TelaPrincipal();
	}
}
