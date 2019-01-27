
import java.awt.BorderLayout;
import java.io.*;
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			 page3 p=new page3();
			 
		/*	 //JOptionPane.showMessageDialog(null, p.getparty1().getCount());
			 if((p.getparty1().getCount()>p.getparty2().getCount())&&(p.getparty1().getCount()>p.getparty3().getCount())&&(p.getparty1().getCount()>p.getparty4().getCount()))
			 {
				 JOptionPane.showMessageDialog(null, p.getparty1().getName());
			 }
			 else if((p.getparty2().getCount()>p.getparty1().getCount())&&(p.getparty2().getCount()>p.getparty3().getCount())&&(p.getparty2().getCount()>p.getparty4().getCount()))
			 {
				 JOptionPane.showMessageDialog(null, p.getparty2().getName());
			 }
			 else if((p.getparty3().getCount()>p.getparty1().getCount())&&(p.getparty3().getCount()>p.getparty2().getCount())&&(p.getparty3().getCount()>p.getparty4().getCount()))
			 {
				 JOptionPane.showMessageDialog(null, p.getparty3().getName());
			 }
			 else if((p.getparty4().getCount()>p.getparty1().getCount())&&(p.getparty4().getCount()>p.getparty2().getCount())&&(p.getparty4().getCount()>p.getparty3().getCount()))
			 {
				 JOptionPane.showMessageDialog(null, p.getparty4().getName());
			 }
			 else
			 {
				 JOptionPane.showMessageDialog(null, "party 1");
			 } 
			 */
				
				try {
					
					FileInputStream fis1=new FileInputStream("C:\\Users\\dshub\\Desktop\\Project MD0002\\Pollingboth\\bin\\party1.txt");
					ObjectInputStream ois1=new ObjectInputStream(fis1);
					int p1c= (int)ois1.readObject();
					ois1.close();
					
					////////////////////////////////////
					FileInputStream fis2=new FileInputStream("C:\\Users\\dshub\\Desktop\\Project MD0002\\Pollingboth\\bin\\party2.txt");
					ObjectInputStream ois2=new ObjectInputStream(fis2);
					int p2c= (int)ois2.readObject();
					ois2.close();
					
					////////////////////////////////////
					
					FileInputStream fis3=new FileInputStream("C:\\Users\\dshub\\Desktop\\Project MD0002\\Pollingboth\\bin\\party3.txt");
					ObjectInputStream ois3=new ObjectInputStream(fis3);
					int p3c= (int)ois3.readObject();
					ois3.close();
					/////////////////////////////
					
					FileInputStream fis4=new FileInputStream("C:\\Users\\dshub\\Desktop\\Project MD0002\\Pollingboth\\bin\\party4.txt");
					ObjectInputStream ois4=new ObjectInputStream(fis4);
					int p4c= (int)ois4.readObject();
					ois4.close();
					///////////////////////////
					
					if((p1c>p2c)&&(p1c>p3c)&&(p1c>p4c))
					{
						//JOptionPane.showMessageDialog(null, p.getparty1().getCount());
						JOptionPane.showMessageDialog(null, p.getparty1().getName()+" :- "+p1c+"\n"+p.getparty2().getName()+":-"+p2c+"\n"+p.getparty3().getName() +":-"+p3c+"\n"+p.getparty4().getName()+ ":- "+p4c);
					}
					else if((p2c>p1c)&&(p2c>p3c)&&(p2c>p4c))
					{
						JOptionPane.showMessageDialog(null, p.getparty2().getName()+" :- "+p2c+"\n"+p.getparty1().getName()+" :- "+p1c+"\n"+p.getparty3().getName() +" :-"+p3c+"\n"+p.getparty4().getName() + " :- "+p4c);
					}
					else if((p3c>p1c)&&(p3c>p2c)&&(p3c>p4c))
					{
						JOptionPane.showMessageDialog(null, p.getparty3().getName()+" :- "+p3c+"\n" +p.getparty1().getName() +":- "+p1c+"\n"+ p.getparty2().getName() +":-"+p2c+"\n"+ p.getparty4().getName() +":- "+p4c);
					}
					else if((p4c>p1c)&&(p4c>p2c)&&(p4c>p3c))
					{
						JOptionPane.showMessageDialog(null,  p.getparty4().getName()+" :- "+p4c+"\n" +p.getparty1().getName() +":- "+p1c+"\n"+ p.getparty2().getName() +":-"+p2c+"\n"+ p.getparty3().getName() +":- "+p3c);
					}
					else
						JOptionPane.showMessageDialog(null, "dead");
					
				}
				catch(Exception m)
				{
					System.out.println(m);
				}
			 
			}
		});
		
				
				
		
		btnNewButton.setBounds(199, 291, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLogOut = new JButton("LOG OUT");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 JOptionPane.showMessageDialog(null, "Thank you! you are logged out");
			System.exit(0);
			
			}
		});
		btnLogOut.setBounds(417, 11, 85, 23);
		contentPane.add(btnLogOut);
		
		JButton btnNewButton_1 = new JButton("Number of Party");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, " 4 ");
			}
		});
		btnNewButton_1.setBounds(22, 101, 133, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Number Of Booth");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, 700);
			}
		});
		btnNewButton_2.setBounds(22, 129, 133, 23);
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
					pst.setString(1,textField.getText() );
				
					ResultSet rs=pst.executeQuery();
					
					if(textField.getText().equalsIgnoreCase("Delhi"))
					{	
						State s=new State(textField.getText(),12,23,54,85);
						JOptionPane.showMessageDialog(null, s.display());
					}
					
					else if(textField.getText().equalsIgnoreCase("up"))
					{
						State s=new State(textField.getText(),17,23,76,85);
						JOptionPane.showMessageDialog(null, s.display());
					}
						
					//JOptionPane.showMessageDialog(null, s.display());
					
					/*contentPane.hide();
						Login3 page3=new Login3(lblNewLabel_1.getText());
						page3.setVisible(true);
						*/
									
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,e);
				}
				
			}
		});
		btnNewButton_3.setBounds(358, 156, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Number of Official");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "3/booth Total:- 2100");
			}
		});
		btnNewButton_4.setBounds(22, 156, 133, 23);
		contentPane.add(btnNewButton_4);
	}
		}
