package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class UtilidadesHibernate {
	
	private static SessionFactory sessionFactory;
	
	public static Session crearConexion() {
		
		try {
			SessionFactory sessionFactory = new Configuration()
					.configure() // Carga hibernate.cfg.xml
					.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Conectado");
			
			return session;
		} catch (Throwable ex) {
			System.err.println("Error al crear la SessionFactory." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		
	}
	
	public static Session getSession() {
		return sessionFactory.openSession();
	}
	
	public static void cerrarSessionFactory() {
		if (sessionFactory != null && !sessionFactory.isClosed()) {
			sessionFactory.close();
			System.out.println("SessionFactory cerrada");
		}
	}
	
    public static void insertar(Object entidad) {
        Transaction tx = null;
        try (Session session = getSession()) {
            tx = session.beginTransaction();
            session.persist(entidad);   // sirve para cualquier @Entity
            tx.commit();
            System.out.println("Insert realizado: " + entidad);
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            System.err.println("Error al insertar entidad: " + e.getMessage());
            e.printStackTrace();
        }
    }
	
	

}

