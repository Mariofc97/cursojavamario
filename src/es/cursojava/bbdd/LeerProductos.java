package es.cursojava.bbdd;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import utils.UtilidadesBD;

public class LeerProductos {

	private static final String CONSULTA_PRODUCTOS="SELECT "+" id, nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku, creado_por, iva " + " FROM TB_PRODUCTOS_PROFE";
	public static void main(String[] args) {
		consultaProductos();
	}
	
    public static void consultaProductos() {
        
        Connection conexion = UtilidadesBD.crearConexion();
        Statement st = null;
        ResultSet rs = null;
        List<Producto> productos = new ArrayList<>();
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
                
                productos.add(producto1);
                

            }
            for (Producto p : productos) {
            	System.out.println(p);
            }
            
            // llamar al metodo que guarda la lista en un archivo
            
            String nombreFichero = "./recursos/mario_productos.txt";
            
            System.out.println();
            
            guardarProductosEnFichero(productos, nombreFichero);
            
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
    
    private static void guardarProductosEnFichero(List<Producto> productos, String nombreFichero) {
    	
    	
    	// bufferedwritter escribe primero en una memoria intermedia, como se cierra el, tambien cierra el FileWriter
    	// esto seria un equivalente a:
//    	BufferedWriter bw = null;
//    	try {
//    	    FileWriter fw = new FileWriter(nombreFichero);
//    	    bw = new BufferedWriter(fw);
//    	    bw.write("Texto de prueba");
//    	} catch (IOException e) {
//    	    e.printStackTrace();
//    	} finally {
//    	    if (bw != null) {
//    	        try {
//    	            bw.close();
//    	        } catch (IOException e) {
//    	            e.printStackTrace();
//    	        }
//    	    }
//    	}
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
    	try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero))){
    		
    		for (Producto p : productos) {
    			
    			String fechaStr = sdf.format(p.getFecha_alta());
    			
                String linea = p.getId() + "|" +
                        p.getNombre() + "|" +
                        p.getCategoria() + "|" +
                        p.getPrecio() + "|" +
                        p.getStock() + "|" +
                        fechaStr + "|" +
                        p.getEstado() + "|" +
                        p.getCodigo_sku() + "|" +
                        p.getCreado_por() + "|" +
                        p.getIva();
                
                bw.write(linea);
                bw.newLine();
    		}
    		
    		System.out.println("Archivo" + nombreFichero + " creado correctamente");
    		
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    


}
