/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Ashbld
 */
public class login_koneksi {
    private static Connection konek;
public static Connection GetConnection() throws SQLException
{
if (konek == null) {
Driver driver = new Driver();
konek = (Connection)
DriverManager.getConnection("jdbc:mysql://localhost/toko?zeroDateTimeBehavior=convertToNull", "root", "");
}
return konek;
} 

}
