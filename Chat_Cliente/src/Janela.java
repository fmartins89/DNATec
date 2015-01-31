import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Janela extends JFrame  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton sairBt, verBt, addBt, chamarBt, okBt;
	JTextArea info;
	JTextField entrada;
	JPanel principal, botoes, input,output;
	//Controle control;
	public Janela(String name){
		 super(name);
	     setResizable(false);
	     setSize(350,250);
	     add_contents();
	     
	}

	private void add_contents() {
		//control=new Controle();
		principal= new JPanel();
		botoes= new JPanel();
		input= new JPanel();
		output= new JPanel();
		
		verBt=new JButton("Ver Animal");
		addBt=new JButton("Adicionar Animal");
		okBt=new JButton("OK");
		sairBt=new JButton("Voltar à Entrada");
		chamarBt= new JButton("Chamar Animal");
		
		entrada= new JTextField(30);
		info=new JTextArea(4,30);
		info.setLineWrap(true);
		//info.setWrapStyleWord(true);
		
		this.getContentPane().add(principal);
		principal.setLayout(new GridLayout(3,1));
		principal.add(botoes);
		principal.add(input);
		principal.add(output);
		botoes.add(verBt);
		botoes.add(addBt);
		botoes.add(sairBt);
		botoes.add(okBt);
		
		entrada.setSize(100, 200);
		input.add(entrada);
		
		output.add(info);
		
		//control=new Controle();
		addBt.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){
				//info.setText(control.action_addBt());
			 	}
			});
		okBt.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){
				//info.setText(control.action_okBt(entrada.getText()));
			 	}
			});

		
				
	}


}
