import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.event.ActionEvent;

public class fingerprint extends JFrame {
	
	

	 CFingerPrint m_finger1 = new CFingerPrint();
	  CFingerPrint m_finger2 = new CFingerPrint();
	  CFingerPrintGraphics m_fingergfx = new CFingerPrintGraphics();
	   BufferedImage m_bimage1 = new BufferedImage(m_finger1.FP_IMAGE_WIDTH ,m_finger1.FP_IMAGE_HEIGHT,BufferedImage.TYPE_INT_RGB );
	   BufferedImage m_bimage2 = new BufferedImage(m_finger2.FP_IMAGE_WIDTH ,m_finger2.FP_IMAGE_HEIGHT,BufferedImage.TYPE_INT_RGB );
	 double finger1[] = new double[m_finger1.FP_TEMPLATE_MAX_SIZE];
	   double finger2[] = new double[m_finger2.FP_TEMPLATE_MAX_SIZE];
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fingerprint frame = new fingerprint();
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
	public fingerprint() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 4
				74, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\dshub\\Desktop\\Project MD0002\\Pollingboth\\require\\fingerprintp.png"));
		lblNewLabel.setBounds(32, 59, 117, 160);
		contentPane.add(lblNewLabel);
		
		JLabel lblProvideUs = new JLabel("Provide Us With \r\nYour Fingerprint For\r\n Your Identification!!!!");
		lblProvideUs.setForeground(Color.WHITE);
		lblProvideUs.setBackground(new Color(255, 153, 51));
		lblProvideUs.setFont(new Font("Cooper Black", Font.ITALIC, 16));
		lblProvideUs.setBounds(159, 72, 257, 160);
		contentPane.add(lblProvideUs);
	
		
				  
				  try
				    {
				   
				    m_bimage1=ImageIO.read(new File("C:\\Users\\dshub\\Desktop\\Project MD0002\\Pollingboth\\fingerprint\\fp.bmp")) ;
				  
				    m_finger1.setFingerPrintImage(m_bimage1) ;
				    finger1=m_finger1.getFingerPrintTemplate();
				    m_bimage1 = m_finger1.getFingerPrintImageDetail();
				    


				   // m_bimage2=ImageIO.read(new File("C:\\Users\\dshub\\Desktop\\Project MD0002\\Pollingboth\\fingerprint\\f2.bmp")) ;
				  m_bimage2=ImageIO.read(new File("C:\\Users\\dshub\\Desktop\\Project MD0002\\Pollingboth\\fingerprint\\fp.bmp")) ;
				   
				    m_finger2.setFingerPrintImage(m_bimage2) ;
				    finger2=m_finger2.getFingerPrintTemplate();
				    m_bimage2 = m_finger2.getFingerPrintImageDetail();
				    



				    }
				    catch (Exception ex)
				    {
				    JOptionPane.showMessageDialog (null,ex.getMessage(),"Error",JOptionPane.PLAIN_MESSAGE);
				    }
				    
			  
			  
			 		

				
		
		
		
		JButton btnNewButton = new JButton("SCAN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				  
				//m_finger1.Match(finger1 , finger2,95,false);
				if(m_finger1.Match(finger1, finger2,95,false)>=95)
				{
				contentPane.setVisible(false);
				contentPane.hide();
				page3 page3obj=new page3();
				page3obj.setVisible(true);
				}
				else {
				    JOptionPane.showMessageDialog (null,"Authentiction failed try again");
					
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Cooper Black", Font.BOLD | Font.ITALIC, 10));
		btnNewButton.setBounds(233, 224, 72, 23);
		contentPane.add(btnNewButton);
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\dshub\\Desktop\\Project MD0002\\Pollingboth\\require\\bluebc.png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(Color.BLUE);
		lblNewLabel_1.setBounds(0, 0, 476, 343);
		contentPane.add(lblNewLabel_1);
	}
}
