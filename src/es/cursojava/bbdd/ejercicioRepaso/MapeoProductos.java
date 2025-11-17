package es.cursojava.bbdd.ejercicioRepaso;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import es.cursojava.bbdd.Producto;
import utils.UtilidadesBD;

public class MapeoProductos {
    private static final String CONSULTA_PRODUCTOS="SELECT "+" id, nombre, categoria, precio, stock, fecha_alta, estado, codigo_sku, creado_por, iva " + " FROM GETAFE.TB_PRODUCTOS_PROFE";
    public static void main(String[] args) {

    	consultaProductosEnMapa();
        

    }

    public static List<Producto> consultaProductos() {
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
        
        return productos;
    }
    
    // mismo ejercicio de consultaProductos pero con Mapa
    public static Map<Integer, Producto> consultaProductosEnMapa(){
    	Map<Integer, Producto> productosMap = new HashMap<>();
    	
        try (Connection con = UtilidadesBD.crearConexion();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(CONSULTA_PRODUCTOS)) {
        	
        	while(rs.next()) {
        		Producto p =new Producto(
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
        		
        		productosMap.put(p.getId(), p);
        	}
        	
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("Productos leidos: " + productosMap.size());
        for(Producto p : productosMap.values()) {
        	System.out.println(p);
        }
        
        return productosMap;
    }
    
    public static Map<Integer, Producto> mapearProductosConLista(List<Producto> productos){
    	Map<Integer, Producto> mapaProductos = new HashMap<>();
    	
    	for (Producto p : productos) {
    		mapaProductos.put(p.getId(),p);
    	}
    	
    	return mapaProductos;
    }
    
    public static void buscarPorId(Map<Integer,Producto> mapaProductos) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Introduce un integer Id: ");
    	int id = scan.nextInt();
    	
    	Producto productoEncontrado = mapaProductos.get(id);
    	
    	if(productoEncontrado!=null) {
    		System.out.println("Encontrado " + productoEncontrado);
    	} else {
    		System.out.println("No existe ese producto");
    	}
    }


}
