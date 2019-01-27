
import javax.swing.*;
import java.sql.*;

public class NewConnection {
	
	 Connection coll=null;
	 
	public static Connection qbconnector() {
		try {
			
			Class.forName("org.sqlite.JDBC");
			Connection coll=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dshub\\Desktop\\Project MD0002\\Pollingboth\\require\\Location.sqlite");
			JOptionPane.showMessageDialog(null, "connection successfull with page");
			return coll;
		}catch(Exception e) {
		
		JOptionPane.showMessageDialog(null, e);
			return null;
			
		}
	}

	
}
