package proyecto;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
	public static void main(String[] args) throws SQLException {
		conexion.Conectar();
		//ejemplo1
		ResultSet selectAll = conexion.EjecutarSentencia("select nombre,clave from cliente");
				
		while(selectAll.next()){
            String nombre = selectAll.getString("nombre");
            String clave = selectAll.getString("clave");

            System.out.println(nombre + clave);
		}
	}
}
