import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

	public class Connexion {
		
		final String driver = "com.mysql.cj.jdbc.Driver";
		final String url = "jdbc:mysql://localhost/ppem2l"
				+ "?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
		final String user = "root";
		final String password = "";
		
		ResultSet res;
		
		public ResultSet executeRequete(String query)
		{
			try{
				Class.forName(driver).newInstance();
				Connection con = DriverManager.getConnection(url, user, password);
				Statement st = con.createStatement();
				res = st.executeQuery(query);
				return res;
						
			}catch(Exception e){
				System.out.println("Erreur, " + e.getMessage());
				return null;
			}
		}
	
	}