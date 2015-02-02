import javax.swing.*;

public class Janela extends JFrame  {
	private static final long serialVersionUID = 1L;
	JButton sairBt, verBt, addBt, chamarBt, okBt;
	JTextArea info;
	JTextField entrada;
	JPanel principal,login, botoes, input,output;
	Panel_Login panel_login;
	Panel_Chat panel_chat;
	Panel_Admin panel_admin;
	
	//Controle control;
	public Janela(String name){
		 super(name);
	     setResizable(false);
	     setSize(350,250);
	     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     panel_login=new Panel_Login();
	     panel_chat=new Panel_Chat();
	     //this.getContentPane().add(panel_login);
	     this.getContentPane().add(panel_chat);
	     //add_contents();
	}
}