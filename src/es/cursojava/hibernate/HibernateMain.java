package es.cursojava.hibernate;

import java.util.Calendar;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class HibernateMain {
    public static void main(String[] args) {
    	

        try {
            SessionFactory sessionFactory = new Configuration()
                    .configure() // Carga hibernate.cfg.xml
                    .buildSessionFactory();
            Session session = sessionFactory.openSession();
            System.out.println("Conectado");
            
            Transaction tx =  session.beginTransaction();
            
            Empresa empresa1 = new Empresa("Jabones Llorente","S.L.","A-81493602","Venta jabones",Calendar.getInstance().getTime());
            Empresa empresa2 = new Empresa("Llorente","S.L.","A-81493603","Venta jamones",Calendar.getInstance().getTime());
       // con esto se inserta el objeto en la base de datos
            session.persist(empresa1);
            session.persist(empresa2);
            
            
            tx.commit();
            // HIBERNATE QUERY LANGUEAGE HQL
            // From Empresa es con el numero de la clase
            //List<Empresa> empresas = query.list(); HAY QUE METER UNA LISTA EN EL QUERY
            //Query<Empresa> query = session.createQuery("from Empresa", Empresa.class);
            List<Empresa> empresas = session.createQuery("from Empresa", Empresa.class).list();
            for (Empresa empresa : empresas) {
				System.out.println(empresa);
			}
        } catch (Throwable ex) {
            System.err.println("Error al crear la SessionFactory." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
}
