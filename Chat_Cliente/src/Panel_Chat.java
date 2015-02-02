
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Panel_Chat extends JPanel  {

	private static final long serialVersionUID = -4754423608222536693L;
	JButton btn_enviar, btn_sair;
	JTextArea txt_send, txt_chat;
	//JLabel lbl_user, lbl_pwd;
	//JTextField cmp_user;
	//JPasswordField cmp_pwd;
	//JCheckBox chk_admin;
	//Controle control;
	public Panel_Chat(){
	     add_contents();
	}
	
	private void add_contents() {
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill=GridBagConstraints.BOTH;

		//Caixa de texto chat
		c.insets = new Insets(7,7,7,7);

		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 2;
		c.weighty = 4;

		c.anchor = GridBagConstraints.LINE_START;
		txt_chat=new JTextArea();
		txt_chat.setEditable(false);
		txt_chat.setLineWrap(true);
		txt_chat.setWrapStyleWord(true);
		//lbl_user.setEditable(false);
		this.add(txt_chat,c);
		
		//Caixa de texto para digitar mensagem
		c.insets = new Insets(7,7,0,7);

		c.gridx = 0;
		c.gridy = 4;
		c.weightx = 2;
		c.weighty = 2;
		txt_send=new JTextArea();
		txt_send.setEditable(true);
		txt_send.setLineWrap(true);
		txt_send.setWrapStyleWord(true);
		this.add(txt_send,c);




		//Button OK
		c.gridx = 0;
		c.gridy = 5;
		c.weightx = 1;
		c.weighty = 1;
		c.fill=GridBagConstraints.HORIZONTAL;
		//c.ipadx=100;
		//c.anchor = GridBagConstraints.LINE_START;
		btn_enviar=new JButton("Enviar");
		//btn_ok.setPreferredSize(new Dimension(200, 20));
		this.add(btn_enviar,c);
	}
}
