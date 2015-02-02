import java.awt.*;
import javax.swing.*;

public class Panel_Login extends JPanel  {

	private static final long serialVersionUID = 4112399807439431066L;
	JButton btn_ok;
	JLabel lbl_user, lbl_pwd;
	JTextField cmp_user;
	JPasswordField cmp_pwd;
	JCheckBox chk_admin;
	//Controle control;
	public Panel_Login(){
	     add_contents();
	}
	
	private void add_contents() {
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill=GridBagConstraints.HORIZONTAL;

		//Label Username
		c.insets = new Insets(7,7,0,7);

		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 2;
		c.anchor = GridBagConstraints.LINE_START;
		lbl_user=new JLabel("Username");
		//lbl_user.setEditable(false);
		this.add(lbl_user,c);
		
		//campo Username
		c.insets = new Insets(7,7,7,7);

		c.gridx = 0;
		c.gridy = 1;
		c.weightx = 2;
		c.anchor = GridBagConstraints.LINE_START;
		cmp_user=new JTextField(20);
		this.add(cmp_user,c);


		//Label Password
		c.insets = new Insets(7,7,0,7);
		c.gridx = 0;
		c.gridy = 2;
		c.weightx = 2;
		c.anchor = GridBagConstraints.LINE_START;
		lbl_pwd=new JLabel("Password");
		this.add(lbl_pwd,c);
		
		//Campo Password
		c.insets = new Insets(7,7,7,7);
		c.gridx = 0;
		c.gridy = 3;
		c.weightx = 2;
		c.anchor = GridBagConstraints.LINE_START;
		cmp_pwd=new JPasswordField(20);
		this.add(cmp_pwd,c);

		//Checkbox Admin
		c.gridx = 0;
		c.gridy = 4;
		c.weightx = 1;
		c.anchor = GridBagConstraints.LINE_START;
		chk_admin=new JCheckBox("Logar como Administrador");
		this.add(chk_admin,c);
		//chk_admin.isSelected();

		//Button OK
		c.gridx = 0;
		c.gridy = 5;
		c.weightx = 1;
		c.fill=GridBagConstraints.HORIZONTAL;
		//c.ipadx=100;
		//c.anchor = GridBagConstraints.LINE_START;
		btn_ok=new JButton("OK");
		//btn_ok.setPreferredSize(new Dimension(200, 20));
		this.add(btn_ok,c);
		
		
		/*
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

		*/
				
	}


}
