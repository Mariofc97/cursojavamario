package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UtilidadesHibernate {
	
	private static SessionFactory sessionFactory;
	private static Session session;
	
	// Inicializa la SessionFactory si aún no lo está
	public static void crearConexion() {
		try {
			if (sessionFactory == null || sessionFactory.isClosed()) {
				sessionFactory = new Configuration()
						.configure() // Carga hibernate.cfg.xml
						.buildSessionFactory();
				System.out.println("SessionFactory creada y conexión establecida");
			}
		} catch (Throwable ex) {
			System.err.println("Error al crear la SessionFactory: " + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	private static Session getSession() {
        SessionFactory sessionFactory = new Configuration()
                .configure() // Carga hibernate.cfg.xml
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        return session;
	}
	
	public static Session getSessionFactory() {
		if (session == null || !session.isOpen()) {
			session = getSession();
		}
		
		return session;
	}
	
//	public static Session getSession() {
//		// Por si acaso alguien llama a getSession() sin haber creado antes la conexión
//		if (sessionFactory == null || sessionFactory.isClosed()) {
//			crearConexion();
//		}
//		return sessionFactory.openSession();
//	}
	
	public static void cerrarSessionFactory() {
		if (sessionFactory != null && !sessionFactory.isClosed()) {
			sessionFactory.close();
			System.out.println("SessionFactory cerrada");
		}
	}
	
	public static void insertar(Object entidad) {
	    Session session = null;
	    Transaction tx = null;

	    try {
	        session = getSession();              // Abrimos sesión
	        tx = session.beginTransaction();     // Iniciamos transacción

	        session.persist(entidad);            // Guardamos la entidad

	        tx.commit();                         // Confirmamos
	        System.out.println("Insert realizado: " + entidad);

	    } catch (Exception e) {
	        System.err.println("Error al insertar entidad: " + e.getMessage());
	        e.printStackTrace();

	        // Intentamos hacer rollback solo si tiene sentido
	        if (tx != null && tx.getStatus().canRollback()) {
	            try {
	                tx.rollback();
	            } catch (Exception ex) {
	                System.err.println("Error al hacer rollback: " + ex.getMessage());
	                ex.printStackTrace();
	            }
	        }

	    } finally {
	        // Cerramos la sesión SI sigue abierta
	        if (session != null && session.isOpen()) {
	            session.close();
	        }
	    }
	}
}
