/*Bu sınıfta veritabanı bağlantısı yapılmıştır*/
package PROJE;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class BaglantiDurumu {
    public final String URL = "jdbc:mysql://localhost:3306/";
    public final String DB_NAME = "projeson";
    public final String ID = "root";
    public final String PW = "";
    public final String DRIVER = "com.mysql.jdbc.Driver";
    
    public Connection conn;
    
    public Connection baglan()
    {
        try {
            Class.forName(DRIVER).newInstance();
            conn = DriverManager.getConnection(URL+DB_NAME,ID,PW);
            
//            JOptionPane.showMessageDialog(null,"Veritabanı bağlantı başarılı");
            
        }catch(Exception e){
//        JOptionPane.showMessageDialog(null,"Veritabanı bağlantı başarısız \n"+ e);
        JOptionPane.showMessageDialog(null,e);
        }//try-catch sonu
        return conn;  
    }//metod sonu

}//Class Sonu

