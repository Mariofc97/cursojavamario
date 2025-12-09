package utils;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class UtilidadesMongoDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String uri = "mongodb+srv://marioferron1997_db_user:wUuiP2I5QTI57EpX@cluster0.bfobsix.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
		// 2. Crear cliente
		try (MongoClient mongoClient = MongoClients.create(uri)) {

			// 3. Seleccionar base de datos
			MongoDatabase database = mongoClient.getDatabase("getafemongodb");

			// 4. Seleccionar colección
			MongoCollection<Document> usuarios = database.getCollection("usuarios");

			// 5. Insertar un documento
			Document nuevoUsuario = new Document("nombre", "Ana").append("edad", 28).append("ciudad", "Madrid");

			usuarios.insertOne(nuevoUsuario);
			System.out.println("Usuario insertado");

			// 6. Leer documentos (find todos)
			FindIterable<Document> resultados = usuarios.find();
			for (Document doc : resultados) {
				System.out.println(doc.toJson());
			}

			// 7. Consulta con filtro (edad >= 27)
			System.out.println("Usuarios con edad >= 27:");
			for (Document doc : usuarios.find(Filters.gte("edad", 27))) {
				System.out.println(doc.toJson());
			}
		}
	}

}
