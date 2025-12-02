package es.cursojava.hibernate.ejercicios.ejercicioEmpleados.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import es.cursojava.hibernate.ejercicios.ejercicioEmpleados.entities.Empleado;
import utils.UtilidadesHibernate;

public class EmpleadoDaoImpl implements EmpleadoDao{
	
	private Session session;
	private Transaction transaction;
	
	public EmpleadoDaoImpl() {
		session = UtilidadesHibernate.getSessionFactory();
		transaction = session.beginTransaction();
	}

	@Override
	public void guardar(Empleado empleado) {
		// TODO Auto-generated method stub
		session.persist(empleado);
		//sesion.flush();
	}

	@Override
	public Empleado buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return session.get(Empleado.class, id);
	}

	@Override
	public Empleado buscarPorNif(String nif) {
		// TODO Auto-generated method stub
		Query<Empleado> query = session.createQuery("from Empleado e where e.nif = :nifParam",Empleado.class);
		query.setParameter("nifParam", nif);
		return query.uniqueResult();
	}

	@Override
	public List<Empleado> buscarPorDepartamento(String departamento) {
		// TODO Auto-generated method stub
		Query<Empleado> query = session.createQuery("from Empleado e where e.departamento = :departamentoParam", Empleado.class);
		query.setParameter("departamentoParam", departamento);
		return query.list();
	}

	@Override
	public List<Empleado> buscarTodos() {
		// TODO Auto-generated method stub
		Query<Empleado> query = session.createQuery("from Empleado",Empleado.class);
		
		return query.list();
	}
	
	public void commitTransaction() {
		if (transaction != null && transaction.isActive()) {
			transaction.commit();
		}
		
		transaction = session.beginTransaction();
	}

}
