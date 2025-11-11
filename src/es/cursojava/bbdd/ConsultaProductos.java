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
    private static final String CONSULTA_PRODUCTOS="SELECT "+" id, nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku, creado_por, iva " + " FROM TB_PRODUCTOS_PROFE";
    public static void main(String[] args) {

    	consultaProductos();
        

    }

    public static void consultaProductos() {
        
        Connection conexion = UtilidadesBD.crearConexion();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = conexion.createStatement();
            rs = st.executeQuery(CONSULTA_PRODUCTOS);
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String categoria = rs.getString("categoria");
                double precio = rs.getDouble("precio");
                int stock = rs.getInt("stock");
                Date date = rs.getDate("fecha_alta");
                String estado = rs.getString("estado");
                String codigo_sku = rs.getString("codigo_sku");
                String creado_por = rs.getString("creado_por");
                int iva = rs.getInt("iva");
                
                Producto producto1 = new Producto(id,nombre,categoria,precio,stock,date,estado,codigo_sku,creado_por,iva);
                
                List<Producto> productos = new ArrayList<>();
                productos.add(producto1);
                
                for (Producto p : productos) {
                    System.out.println(p);
                }

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            UtilidadesBD.cierraConexion(conexion);
            try {
                st.close();
                rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }


        System.out.println("TERMINA");
    }


}
