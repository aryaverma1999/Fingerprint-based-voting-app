import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class CMain {
	
	private CFingerPrint m_finger1 = new CFingerPrint();
	  private CFingerPrint m_finger2 = new CFingerPrint();
	  private CFingerPrintGraphics m_fingergfx = new CFingerPrintGraphics();
	  private BufferedImage m_bimage1 = new BufferedImage(m_finger1.FP_IMAGE_WIDTH ,m_finger1.FP_IMAGE_HEIGHT,BufferedImage.TYPE_INT_RGB );
	  private BufferedImage m_bimage2 = new BufferedImage(m_finger2.FP_IMAGE_WIDTH ,m_finger2.FP_IMAGE_HEIGHT,BufferedImage.TYPE_INT_RGB );
	  private double finger1[] = new double[m_finger1.FP_TEMPLATE_MAX_SIZE];
	  private double finger2[] = new double[m_finger2.FP_TEMPLATE_MAX_SIZE];
	  
	  CMain() {
		  
		  try
		    {
		    //picture1
		    //Set picture new
		    m_bimage1=ImageIO.read(new File(new java.io.File("").getAbsolutePath()+"\\ProcessedSample1.bmp")) ;
		    //Send image for skeletinization
		    m_finger1.setFingerPrintImage(m_bimage1) ;
		    finger1=m_finger1.getFingerPrintTemplate();
		     //See what skeletinized image looks like
		    //m_bimage1 = m_finger1.getFingerPrintImageDetail();
		    //m_panel1.setBufferedImage(m_bimage1);
		    //jTextField1.setText(m_finger1.ConvertFingerPrintTemplateDoubleToString(finger1));

		    //picture2
		    //Set picture new
		  //  m_bimage2=ImageIO.read(new File(new java.io.File("").getAbsolutePath()+"\\ProcessedSample2.bmp")) ;
		    m_bimage2=ImageIO.read(new File(new java.io.File("").getAbsolutePath()+"\\ProcessedSample1.bmp")) ;
		    //Send image for skeletinization
		    m_finger2.setFingerPrintImage(m_bimage2) ;
		    finger2=m_finger2.getFingerPrintTemplate();
		    //See what skeletinized image looks like
		    //m_bimage2 = m_finger2.getFingerPrintImageDetail();
		    //m_panel2.setBufferedImage(m_bimage2);
		    //jTextField2.setText(m_finger2.ConvertFingerPrintTemplateDoubleToString(finger2));



		    }
		    catch (Exception ex)
		    {
		    JOptionPane.showMessageDialog (null,ex.getMessage(),"Error",JOptionPane.PLAIN_MESSAGE);
		    }
		    
	  }
	  
	  public void jButtonStep3_actionPerformed(ActionEvent e)
	  {
	      //match one print
	     try
	      {
	        JOptionPane.showMessageDialog (null,Double.toString(m_finger1.Match(finger1 , finger2,65,false)),"Match %",JOptionPane.PLAIN_MESSAGE);
	      }
	      catch (Exception ex)
	      {
	      JOptionPane.showMessageDialog (null,ex.getMessage() ,"Error Message",JOptionPane.PLAIN_MESSAGE);
	      }
	  }

}
