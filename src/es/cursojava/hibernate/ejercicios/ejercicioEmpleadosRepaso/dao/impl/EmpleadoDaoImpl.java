package es.cursojava.hibernate.ejercicios.ejercicioEmpleadosRepaso.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import es.cursojava.hibernate.ejercicios.ejercicioEmpleadosRepaso.dao.EmpleadoDao;
import es.cursojava.hibernate.ejercicios.ejercicioEmpleadosRepaso.entities.Empleado;
import utils.UtilidadesHibernate;

public class EmpleadoDaoImpl implements EmpleadoDao {
	
	private Session session;
	private Transaction transaction;
	
	public EmpleadoDaoImpl() {
		session = UtilidadesHibernate.getSessionFactory();
		transaction = session.beginTransaction();
	}

	@Override
	  public void guardar(Empleado empleado) {
	    Transaction tx = null;
	    try (Session session = UtilidadesHibernate.getSessionFactory()) {
	      tx = session.beginTransaction();
	      session.persist(empleado);
	      tx.commit();
	    } catch (Exception e) {
	      if (tx != null) tx.rollback();
	      throw e;
	    }
	  }

	@Override
	public Empleado buscarPorId(Long id) {
		// TODO Auto-generated method stub
		Empleado empleado = session.get(Empleado.class, id);
	 	transaction.commit();
		return empleado;
	}

	@Override
	public Empleado buscarPorNif(String nif) {
		Query<Empleado> query = session.createQuery("FROM Empleado WHERE nif = :nifEmpleado", Empleado.class);
		query.setParameter("nifEmpleado", nif);
		//transaction.commit();
		return query.uniqueResult();
		// TODO Auto-generated method stub
	}

	@Override
	public List<Empleado> buscarTodos() {
		// TODO Auto-generated method stub
		Query<Empleado> query = session.createQuery("from Empleado", Empleado.class);
		return query.list();
	}

	@Override
	public List<Empleado> buscarPorDepartamento(String departamento) {
		Query<Empleado> query = session.createQuery("FROM Empleado WHERE departamento = :dept", Empleado.class);
		// TODO Auto-generated method stub
		query.setParameter("dept", departamento);
		transaction.commit();
		return query.list();
	}
	
	public void commitTransaction() {
		if (transaction != null && transaction.isActive()) {
			transaction.commit();
		}
	}
	
	public void rollbackTransaction() {
		transaction.rollback();
	}

}
