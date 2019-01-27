import java.awt.BorderLayout;
import java.io.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;

public class page3 extends JFrame {

	 Party1 p1=new Party1("PARTY 1","RIYA",10);
	  Party1 p2=new Party1("PARTY 2","RIY",10);
	   Party1 p3=new Party1("PARTY 3","RY",10);
	  Party1 p4=new Party1("PARTY 4","R",10);
	private JPanel contentPane;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page3 frame = new page3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public page3() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Party 1");
		rdbtnNewRadioButton.setFont(new Font("Copperplate Gothic Bold", Font.BOLD | Font.ITALIC, 12));
		rdbtnNewRadioButton.setBounds(36, 181, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Party 2");
		rdbtnNewRadioButton_1.setFont(new Font("Copperplate Gothic Bold", Font.BOLD | Font.ITALIC, 12));
		rdbtnNewRadioButton_1.setBounds(262, 181, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Party 3");
		rdbtnNewRadioButton_2.setFont(new Font("Copperplate Gothic Bold", Font.BOLD | Font.ITALIC, 12));
		rdbtnNewRadioButton_2.setBounds(36, 241, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("party 4");
		rdbtnNewRadioButton_3.setFont(new Font("Copperplate Gothic Bold", Font.BOLD | Font.ITALIC, 12));
		rdbtnNewRadioButton_3.setBounds(262, 241, 109, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_2);
		bg.add(rdbtnNewRadioButton_3);
		
		
		
		JButton btnNewButton = new JButton("Next");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(rdbtnNewRadioButton.isSelected())
				{
					
					p1.setcount();
					int n=p1.getCount();
					try {
					FileOutputStream fos=new FileOutputStream("C:\\Users\\dshub\\Desktop\\Project MD0002\\Pollingboth\\bin\\party1.txt",false);
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					oos.writeObject(p1.getCount());
					oos.flush();
					oos.close();
					
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					//JOptionPane.showMessageDialog(null, n);
					contentPane.setVisible(false);
					contentPane.hide();
					Page4 p4=new Page4();
					p4.setVisible(true);
				}
				else if(rdbtnNewRadioButton_1.isSelected())
				{
					
					p2.setcount();
					//p2.setcount();
					try {
						FileOutputStream fos=new FileOutputStream("C:\\Users\\dshub\\Desktop\\Project MD0002\\Pollingboth\\bin\\party2.txt",false);
						ObjectOutputStream oos=new ObjectOutputStream(fos);
						oos.writeObject(p2.getCount());
						oos.flush();
						oos.close();
						
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
					contentPane.setVisible(false);
					contentPane.hide();
					Page4 p4=new Page4();
					p4.setVisible(true);
				}
				else if(rdbtnNewRadioButton_2.isSelected())
				{
					
					p3.setcount();
					try {
						FileOutputStream fos=new FileOutputStream("C:\\Users\\dshub\\Desktop\\Project MD0002\\Pollingboth\\bin\\party3.txt",false);
						ObjectOutputStream oos=new ObjectOutputStream(fos);
						oos.writeObject(p3.getCount());
						oos.flush();
						oos.close();
						
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
					contentPane.setVisible(false);
					contentPane.hide();
					Page4 p4=new Page4();
					p4.setVisible(true);
					
				}
				else if(rdbtnNewRadioButton_3.isSelected())
				{
					
					p4.setcount();
					try {
						FileOutputStream fos=new FileOutputStream("C:\\Users\\dshub\\Desktop\\Project MD0002\\Pollingboth\\bin\\party4.txt",false);
						ObjectOutputStream oos=new ObjectOutputStream(fos);
						oos.writeObject(p4.getCount());
						oos.flush();
						oos.close();
						
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
					contentPane.setVisible(false);
					contentPane.hide();
					Page4 pg4=new Page4();
					pg4.setVisible(true);
				}
				
				
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setBounds(166, 278, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\dshub\\Desktop\\Project MD0002\\Pollingboth\\require\\voteindia.jpeg"));
		lblNewLabel.setBounds(0, 0, 446, 330);
		contentPane.add(lblNewLabel);
		
		
	}
	
	public  Party1 getparty1() {
			//JOptionPane.showMessageDialog(null, p1.getCount());
			return p1;
		}
		
		public Party1 getparty2() {
			return p2;
		}
		public Party1 getparty3() {
			return p3;
		}
		public  Party1 getparty4() {
			return p4;
		}
		
}
