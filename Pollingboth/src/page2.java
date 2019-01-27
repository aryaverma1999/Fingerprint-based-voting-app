import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

public class page2 extends JFrame {

	private JPanel contentPane;
	//private JFrame faml;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page2 frame = new page2();
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
	public page2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 370);
		 contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.setBounds(174, 297, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				contentPane.hide();
				fingerprint fingerprintf=new fingerprint();
				fingerprintf.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		btnNewButton.setFont(new Font("Berlin Sans FB Demi", Font.ITALIC, 15));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 447, 292);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\dshub\\Desktop\\Project MD0002\\Pollingboth\\require\\welcome.jpeg"));
		contentPane.add(lblNewLabel);
	}
}
