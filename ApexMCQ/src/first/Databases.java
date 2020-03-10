package first;
import java.sql.*;

public class Databases {
	private static final String url = "jdbc:mysql://localhost:3306/apexmcq";
	private static final String uname="root";
	private static final String pass="";
	
	public static int count_Tables() {
		int i=0;
					try{
						Class.forName("com.mysql.jdbc.Driver");	//Step 2
						
						
						Connection con = DriverManager.getConnection(url , uname , pass);	//Step 3
						
						Statement st = con.createStatement();
						
						ResultSet rs = st.executeQuery("show tables;");
						while(rs.next()) {
							i++;		
						}
						st.close();
						con.close();
						
						}catch(Exception e){
							
							e.printStackTrace();
					}
			return i;
	}
	
	public static String[] Total_Tables() {
		 int i=0;
		 String[] q_papers = new String[count_Tables()];
	 
				 try{
						Class.forName("com.mysql.jdbc.Driver");	//Step 2
						
						
						Connection con = DriverManager.getConnection(url , uname , pass);	//Step 3
						
						Statement st = con.createStatement();
						
						ResultSet rs = st.executeQuery("show tables;");
						while(rs.next()) {
							
							q_papers[i] = rs.getString(1);
							i++;
									
						}
						st.close();
						con.close();
						
						}catch(Exception e){
							
							e.printStackTrace();
					}
	
				 
				 
	return q_papers;	
	}

}
