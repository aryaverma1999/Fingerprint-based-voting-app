package multidproject;

import java.awt.EventQueue;

import javax.swing.*;
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Loginpage {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginpage window = new Loginpage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection connection=null;
	/**
	 * Create the application.
	 */
	public Loginpage() {
		initialize();
		connection=sqlconnection.dbconnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 732, 437);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(229, 141, 74, 14);
		frame.getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(361, 138, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(229, 207, 46, 14);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBounds(361, 204, 86, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query="Select * from sql where Username=? and Password=?";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, textField.getText());
					pst.setString(2, passwordField.getText());
					
					ResultSet rs=pst.executeQuery();
					int count=0;
					while(rs.next()) {
						count++;
						
						
					}
					if(count==1)
					{
						//JOptionPane.showMessageDialog(null, "Username and and password is correct");
						Login2 pg=new Login2();
						frame.setVisible(false);
						Login2 page2obj=new Login2();
						page2obj.setVisible(true);
						
						
						
					}
					else if(count>1)
					{
						JOptionPane.showMessageDialog(null, "Dublicate username and password ");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Incorrect Username or Password  \n Try again... ");
					}
					rs.close();
					pst.close();
				}catch(Exception e) {
				
					JOptionPane.showMessageDialog(null, e);
				
				}
			
			}
		});
		btnLogin.setBounds(271, 284, 89, 23);
		frame.getContentPane().add(btnLogin);
	}
}
