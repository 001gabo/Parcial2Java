 
package conexionBD;
 
import java.sql.Connection;
import java.sql.DriverManager;

public class conexionBD {
   private static Connection con;
    private static final String driver ="com.mysql.jdbc.Driver";
    private static final String userBD="root";
    private static final String passBD="";
    private static final String url="jdbc:mysql://localhost/rs120072_hb140222";
    
    public static Connection getConnection(){
        con=null;
        try{
        Class.forName(driver);
        con=DriverManager.getConnection(url, userBD, passBD);
            if(con!=null){
            System.out.println("Conexion exitosa");
            }
        }
        catch(Exception ex){
            System.out.print("Error: "+ex);
        }
        return con;
    }
}
