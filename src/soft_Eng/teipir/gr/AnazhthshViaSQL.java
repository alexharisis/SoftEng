package soft_Eng.teipir.gr;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AnazhthshViaSQL {

	static int kid,etos, emv;
	   static int check2=0;
	   static String eggr,location,eidos,orof,ypnodwmatia,mpania;
	
	public void searchSql(final String name){

     Connection conn = null;
     PreparedStatement stmt = null;
     ResultSet rs = null;

final        String url = "jdbc:mysql://localhost:3306/test";
final       String user = "alex";
final     String password = "";

     try {
         
         conn = DriverManager.getConnection(url, user, password);
         stmt = conn.prepareStatement("SELECT * FROM ektaseis where idioktitis=?;");
         stmt.setString(1,name);
         rs = stmt.executeQuery();

         while (rs.next()) {
             kid  =rs.getInt(1);
             eggr =rs.getString(2);
             location =rs.getString(3);
	            eidos =rs.getString(4);
	            emv	 =rs.getInt(5);
	            orof = rs.getString(6);
	            etos =rs.getInt(7);
	            ypnodwmatia =rs.getString(8);
	            mpania =rs.getString(9);
             
        check2=1;
         }

     } catch (SQLException ex) {
          

      

     } finally {

         try {
             if (rs != null) {
                 rs.close();
             }
             if (stmt != null) {
                 stmt.close();
             }
             if (conn != null) {
                 conn.close();
             }

         } catch (SQLException ex) {
            
         }
     }

  }
}


	
	
	
	
	
	



