package es.cursojava.mongodb;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;

import utils.UtilidadesMongoDB;



public class PruebasMongodb {

    public static void main(String[] args) {

        // 1. Obtener la colección usando la clase de utilidades
        MongoCollection<Document> usuarios =
                UtilidadesMongoDB.getCollection("getafemongodb", "usuarios");

        // 2. Insertar un documento
//        Document nuevoUsuario = new Document("nombre", "Ana")
//                .append("edad", 28)
//                .append("ciudad", "Madrid");
//
//        usuarios.insertOne(nuevoUsuario);
//        System.out.println("Usuario insertado");

        // 3. Leer todos los documentos
        System.out.println("Todos los usuarios:");
        FindIterable<Document> resultados = usuarios.find();
        for (Document doc : resultados) {
            System.out.println(doc.toJson());
        }

        // 4. Consulta con filtro
        System.out.println("Usuarios con edad >= 27:");
        for (Document doc : usuarios.find(Filters.gte("edad", 27))) {
            System.out.println(doc.toJson());
        }

        // 5. Cerrar conexión (cuando tu programa termine)
        UtilidadesMongoDB.close();
    }

}
