package examen.bbdd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import examen.utils.UtilidadesBD;

public class ConsultaProductos {
	private static final String CONSULTA_PRODUCTOS = "SELECT " + " id, nombre, tipo, precio, stock "
			+ " FROM GETAFE.TB_PRODUCTOS";

	public static void main(String[] args) {

		consultaProductos();

	}

	public static void consultaProductos() {
		List<Producto> productos = new ArrayList<>();
		try (Connection con = UtilidadesBD.crearConexion();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(CONSULTA_PRODUCTOS)) {

			while (rs.next()) {
				Producto p = new Producto(rs.getInt("id"), rs.getString("nombre"), rs.getString("tipo"),
						rs.getDouble("precio"), rs.getInt("stock"));
				productos.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("Productos leídos: " + productos.size());
		for (Producto p : productos) {
			System.out.println(p);
		}
		System.out.println("TERMINA");
	}

}
