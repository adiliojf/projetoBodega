package br.com.tecnicasdeprogramacao.ab.visao;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PainelDaBodega extends JPanel{
	
	public PainelDaBodega() {
		JButton botao1 = new JButton();
		botao1.setText("ADICIONAR PRODUTO");
		botao1.setSize(50,20);
		
		JButton botao2 = new JButton();
		botao2.setText("REMOVER PRODUTO");
		botao2.setSize(50,20);
		
		JButton botao3 = new JButton();
		botao3.setText("BUSCAR PRODUTO");
		botao3.setSize(50,20);
		botao3.setIcon(null);
		
		setLayout(new FlowLayout());
		add(botao1);
		add(botao2);
		add(botao3);
	
	}
}
