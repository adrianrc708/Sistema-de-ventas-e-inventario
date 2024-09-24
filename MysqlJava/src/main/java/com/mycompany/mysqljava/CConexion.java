package com.mycompany.mysqljava;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class CConexion {
    Connection conectar = null;
        String usuario = "root";
        String contrasennia = "sgtssdk123*";
        String bd = "dbjavamysql";
        String ip ="localhost";
        String puerto ="3306";
        
        String cadena = "jdbc:mysql//"+ip+":"+puerto+"/"+bd;
        
        public Connection estableceConexion(){
          try{  
             Class.forName("com.mysql.jdbc.Driver");
             conectar = DriverManager.getConnection(cadena, usuario, contrasennia);
             JOptionPane.showMessageDialog(null, "Se conecto a la base de datos";
             
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se conecto a la base de datos, error:"+e.toString());
        }
          return conectar;
        }
}
