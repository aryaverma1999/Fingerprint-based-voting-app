import javax.
swing.*;
import java.sql.*;


public class sqlconnection {

		Connection conn=null;
		
		public static Connection dbconnector() {
			
			try {
				Class.forName("org.sqlite.JDBC");
				Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dshub\\Desktop\\Project MD0002\\Pollingboth\\require\\sql.sqlite");
				JOptionPane.showMessageDialog(null, "connection successfull");
				return conn;
			}catch(Exception e) {
			
			JOptionPane.showMessageDialog(null, e);
				return null;
			}

		}
	}
