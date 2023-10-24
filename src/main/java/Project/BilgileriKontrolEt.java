package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
Bu class üye kayıt olurken kullanıcı adı, e-mail adresi ve telefon numarası daha önce 
girilen bir veri ile uyuşuyor mu onu kontorl ediyor ve ona göre işlem yapıyor.
 */
public class BilgileriKontrolEt {

    //-------------------------------------------
    // Kayıtlı olan Kullanici Adlarını kontrol ediyor
    public boolean kullaniciAdiUniqueMi(String kAdi) {
        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement stmnt = connection.createStatement();
            String sorgu = "select * from insan";
            ResultSet rs = stmnt.executeQuery(sorgu);
            while (rs.next()) {
                String a = rs.getString("KullaniciAdi");
                if (a.equals(kAdi)) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Database error");
        }
        return false;
    }

    //-------------------------------------------
    // Kayıtlı olan E-Mail adresilerini kontrol ediyor
    public boolean emailUniqueMi(String eMail) {
        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement stmnt = connection.createStatement();
            String sorgu = "select * from insan";
            ResultSet rs = stmnt.executeQuery(sorgu);
            while (rs.next()) {
                String a = rs.getString("EMail");
                if (a.equals(eMail)) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Database error");
        }
        return false;
    }

    //-------------------------------------------
    // Kayıtlı olan Telefon numaralarını kontrol ediyor
    public boolean telefonNoUniqueMi(String TelefonNo) {
        try ( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/araba", "root", "1234");) {
            System.out.println("Database connected");
            Statement stmnt = connection.createStatement();
            String sorgu = "select * from insan";
            ResultSet rs = stmnt.executeQuery(sorgu);
            while (rs.next()) {
                String a = rs.getString("TelefonNo");
                if (a.equals(TelefonNo)) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Database error");
        }
        return false;
    }
}
