import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.Timer;
import java.io.*;

public class Page4 extends JFrame {

	private JPanel contentPane;
	Timer timer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page4 frame = new Page4();
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
	public Page4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("THANK YOU YOUR VOTE MEANS A LOT");
		lblNewLabel.setForeground(new Color(255, 0, 51));
		lblNewLabel.setFont(new Font("Bodoni MT Black", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel.setBounds(0, 119, 424, 158);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\dshub\\Desktop\\Project MD0002\\Pollingboth\\require\\voteindia.jpeg"));
		lblNewLabel_1.setBounds(0, 0, 434, 340);
		contentPane.add(lblNewLabel_1);
		
		
		timer=new Timer(1000,new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
		
				contentPane.setVisible(false);
				contentPane.hide();
				page2 page2obj=new page2();
				page2obj.setVisible(true);
				timer.stop();
			}
		});
		timer.start();
			
	}
		
		
	
}
