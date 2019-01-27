
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class pollingstart {

	private JFrame frame;
	private JPasswordField passwordField;
	
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pollingstart window = new pollingstart();
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
	public pollingstart() {
		initialize();
		connection=sqlconnection.dbconnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 445, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(125, 109, 74, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(125, 145, 46, 14);
		frame.getContentPane().add(lblPassword);
		
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
						//Login2 pg=new Login2();
						frame.setVisible(false);
						page2 p=new page2();
						p.setVisible(true);
						
						
						
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
		btnLogin.setBounds(155, 189, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(202, 145, 102, 14);
		frame.getContentPane().add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(202, 106, 101, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
	}
}
