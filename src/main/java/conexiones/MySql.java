 
package conexiones;

import beans.UsuarioBean;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySql {

    public Connection getConexion() {
        
     
        // Configuración de la conexión
        String jdbcUrl = "jdbc:mysql://localhost:3306/schema1";
        String usuario = "root";
        String contraseña = "root";
        Connection conexion=null ;
        try {
            // Cargar el controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión
             conexion = DriverManager.getConnection(jdbcUrl, usuario, contraseña);
             
            // Hacer algo con la conexión (consultas, actualizaciones, etc.)

            // Cerrar la conexión
            
        } catch (ClassNotFoundException e) {
            System.err.println("Error al cargar el controlador JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error al establecer la conexión: " + e.getMessage());
        }
    
    return conexion;
}

public HashSet<UsuarioBean> selectUsuarios(){
    HashSet<UsuarioBean> listaUsuarios=new HashSet<UsuarioBean>();
    Connection conexion=null;
    conexion=this.getConexion();
    PreparedStatement statement =null;
    ResultSet rstUsuario = null;
    String sql="select * from usuarios";
        try {
            statement = conexion.prepareStatement(sql);
            rstUsuario =   statement.executeQuery();
            int contador=0;
            while(rstUsuario.next())
            {
                contador++;
                UsuarioBean usuario=new UsuarioBean();
                usuario.setApe1(rstUsuario.getString("ape1"));
                usuario.setApe2(rstUsuario.getString("ape2"));
                usuario.setNombre(rstUsuario.getString("nombre"));
                usuario.setDni(rstUsuario.getString("dni"));
                listaUsuarios.add(usuario);
                
            }
            rstUsuario.close();
            statement.close();
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySql.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return listaUsuarios;
}
}