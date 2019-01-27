package multidproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Login2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login2 frame = new Login2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection connectionvar=null;
	/**
	 * Create the frame.
	 */
	public Login2() {
		
		connectionvar=NewConnection.qbconnector();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setBounds(215, 51, 85, 41);
		lblNewLabel.setFont(new Font("Britannic Bold", Font.BOLD | Font.ITALIC, 13));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("RESULT");
		btnNewButton.setBounds(211, 231, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLogOut = new JButton("LOG OUT");
		btnLogOut.setBounds(417, 11, 85, 23);
		contentPane.add(btnLogOut);
		
		JButton btnNewButton_1 = new JButton("Number of Party");
		btnNewButton_1.setBounds(61, 101, 133, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Number Of Booth");
		btnNewButton_2.setBounds(61, 155, 133, 23);
		contentPane.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(361, 102, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Location");
		lblNewLabel_1.setBounds(290, 103, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_3 = new JButton("Search");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					String query="select * from Location where Location=?";
					PreparedStatement pst=connectionvar.prepareStatement(query);
					pst.setString(1,lblNewLabel_1.getText() );
				
					ResultSet rs=pst.executeQuery();
					JOptionPane.showMessageDialog(null, "play");
					
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,e);
				}
				
			}
		});
		btnNewButton_3.setBounds(317, 155, 89, 23);
		contentPane.add(btnNewButton_3);
	}
}
