package omorfia;
import java.sql.*;

public class Conexion {
    public static Connection conectar(){
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/base_dedatos", "root", "");
            return cn;
        }catch(SQLException e){
            System.out.println("Error en conexión local" + e);
        }
        return (null);
    }

    public static void close() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
