package es.cursojava.bbdd;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import utils.UtilidadesBD;

public class ConsultaProductos {
    private static final String CONSULTA_PRODUCTOS="SELECT "+" id, nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku, creado_por, iva " + " FROM GETAFE.TB_PRODUCTOS_PROFE";
    public static void main(String[] args) {

    	consultaProductos();
        

    }

    public static void consultaProductos() {
        List<Producto> productos = new ArrayList<>();
        try (Connection con = UtilidadesBD.crearConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(CONSULTA_PRODUCTOS)) {

            while (rs.next()) {
                Producto p = new Producto(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("categoria"),
                    rs.getDouble("precio"),
                    rs.getInt("stock"),
                    rs.getDate("fecha_alta"),
                    rs.getString("estado"),
                    rs.getString("codigo_sku"),
                    rs.getString("creado_por"),
                    rs.getInt("iva")
                );
                productos.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Productos leídos: " + productos.size());
        for (Producto p : productos) {
            System.out.println(p); // asegúrate de tener toString() en Producto
        }
        System.out.println("TERMINA");
    }


}
