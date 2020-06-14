package musteri_takip;
import java.sql.Connection;//Belirli bir veritabanına sahip bir oturumu temsil eder.
import java.sql.DriverManager;//JDBC sürücüsünü yönetmek için temel bir hizmet sunar.

public class Connectionz {
    
    public static Connection con;
    public static String dbFile = "kullanici.accdb";// C:\Users\Optical\Desktop\müsteri_takip_sistemi\musteri_takip.kullanici.accdb
    /*                     |
    dbFile diskteki veritabanı dosyaları için arabirim. Her tablo tek bir DbFile ile temsil edilir.
    */
    public static String dbUrl = "jdbc:ucanaccess://"+dbFile+";memory = true";
    /*                     |
    Java DB için veritabanı bağlantısı URL sözdizimiddir.
    */
    
    public static Connection getConnection(){// getConnection() : Veritabanına bağlantı kurmak için
        try{
            con = DriverManager.getConnection(dbUrl, "", "");
        }
        catch(Exception ex){// Exception : İstenmeyen veya beklenmeyen bir olaydır ve ex ise bir değişken olarak atanmış halidir
            System.out.println(""+ex);
        }
        return con;
    }
    
}
