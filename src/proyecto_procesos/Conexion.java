package proyecto_procesos;

import java.sql.Connection;
import javax.swing.JOptionPane;
        
package proyecto_procesos;

public class Conexion {
    Connection conectar = null;
    String usuario = "";
    String contraseña = "";
    String bd = "";
    String ip = "";
    String puerto = "";
    String cadena = "jdbc:mysql"+ip+":"+puerto+"/"+bd;
    
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdb.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contraseña);
            JOptionPane.showMessageDialog(null,"Se conecto a base de datos");

        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se conecto a base de datos, error: "+e.toString());
        }
       
    }
    
}
