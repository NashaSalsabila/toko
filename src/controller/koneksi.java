/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashbld
 */
public class koneksi {
    
    public static ResultSet executeQuery(String SQL){
    ResultSet rs = null;
    Connection konek = setKoneksi();
    try{
        Statement st = konek.createStatement();
        rs = st.executeQuery(SQL);
    } catch (SQLException ex){
      Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);   
    }
    return rs;
    }
    
    public static int execute(String SQL){
    int status = 0;
    Connection konek = setKoneksi();
    try{
    Statement st = konek.createStatement();
    status = st.executeUpdate(SQL);
    }catch(SQLException ex){
      Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);   
    }
    return status;
    }   
    
    public static Connection setKoneksi(){
    String konString = "jdbc:mysql://localhost:3306/toko"; 
        Connection konek = null; 
    try{
    Class.forName("com.mysql.jdbc.Driver"); 
    konek = (Connection)
                DriverManager.getConnection(konString,"root","");
                 System.out.println("Koneksi Berhasil");
        } catch (ClassNotFoundException ex){
        Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("Koneksi Gagal");
    } catch (SQLException ex){
        Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("Koneksi Gagal");
    }
     return konek;
    }
    
   public static Object getConnection() {
    return null;
   } 

    public static Object GetConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    String sql = null;
    
    public koneksi(){
    try
    {
     con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/toko","root","");
     st = con.createStatement();
    }
    catch (Exception a)
    {
    JOptionPane.showMessageDialog(null,"Koneksi Database Gagal"+ a);    
    }
}
}


  
