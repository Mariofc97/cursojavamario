package es.cursojava.bbdd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utils.UtilidadesBD;

public class TransaccionDemo {

	public static void main(String[] args) {
		testTransaction();
	}

	// El término rollback (en español, reversión o retroceso) se usa principalmente
	// en el contexto de bases de datos y control de versiones de software, y
	// significa deshacer cambios para volver a un estado anterior considerado
	// correcto o estable.

	// El COMMIT en bases de datos es el opuesto de un ROLLBACK.
	// Sirve para confirmar de forma permanente los cambios realizados durante una
	// transacción.
	
//	🔹 Ejemplo práctico
//
//	Supongamos que transfieres dinero entre cuentas:
//
//	BEGIN TRANSACTION;
//
//	UPDATE cuentas SET saldo = saldo - 500 WHERE id = 1;
//	UPDATE cuentas SET saldo = saldo + 500 WHERE id = 2;
//
//	-- Verificas que todo esté correcto
//	COMMIT;  -- ✅ Cambios guardados
//
//
//	Si la segunda instrucción falla (por ejemplo, la cuenta no existe):
//
//	ROLLBACK;  -- ❌ Deshace todo, nadie pierde dinero

	public static void testTransaction() {
		int contador = 10_000;
		Connection con = null;
		PreparedStatement ps = null;
		try {

			con = UtilidadesBD.crearConexion();
			con.setAutoCommit(false);

			// Borramos la tabla
			String delete = "DELETE FROM EMPLEADOS";
			ps = con.prepareStatement(delete);
			int totalBorrados = ps.executeUpdate();
			System.out.println("Registros eliminados: " + totalBorrados);
			ps.close();

			String insert = "INSERT INTO EMPLEADOS VALUES (?,?,?,?,?,?,?)"; // se hace esto para evitar la concatenacion
																			// de string

			java.util.Date fecha = new java.util.Date();
			for (int i = 1; i < 99999; i++) {
				ps = con.prepareStatement(insert);
				ps.setInt(1, i);
				ps.setString(2, "Nombre " + i);
				ps.setInt(3, (int) (Math.random() * 100));
				ps.setDouble(4, Math.random() * 10000);
				ps.setInt(5, 2);
				ps.setDate(6, null);
				ps.setInt(7, 1);

				ps.executeUpdate();

				// if(i==contador){

				// contador+=100_000;
				// }

				if (i % contador == 0) {
					java.util.Date fecha2 = new java.util.Date();
					long tiempoFinal = fecha2.getTime() - fecha.getTime();
					System.out.println("Tiempo transcurrido para " + i + " registros = " + tiempoFinal);
					Thread.sleep(2000);
				}

				if (i == 999999) {
					throw new SQLException("Por que sí");
				}

				ps.close();
			}

			// Realizamos el commit
			con.commit();
		} catch (Exception sqle) {
			System.out.println("Error" + sqle.getMessage());
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			System.out.println("Cerramos conexiones");

			try {
				con.setAutoCommit(true);
				con.close();
				ps.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}
}
