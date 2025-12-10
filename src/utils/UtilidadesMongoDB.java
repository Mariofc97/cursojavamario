package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;

public class UtilidadesMongoDB {

    // 1. URI de conexión (idealmente sacada de un config o variable de entorno)
    private static final String URI =
        "mongodb+srv://marioferron1997_db_user:wUuiP2I5QTI57EpX@cluster0.bfobsix.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

    // 2. Cliente único para toda la app (Singleton sencillo)
    private static final MongoClient CLIENT = MongoClients.create(URI);

    // 3. Obtener una base de datos
    public static MongoDatabase getDatabase(String dbName) {
        return CLIENT.getDatabase(dbName);
    }

    // 4. Obtener directamente una colección
    public static MongoCollection<Document> getCollection(String dbName, String collectionName) {
        return getDatabase(dbName).getCollection(collectionName);
    }

    // 5. Cerrar el cliente (por ejemplo, al terminar la app)
    public static void close() {
        CLIENT.close();
    }
    
    // esto es lo que te da mongoatlasDB
//    public static void main(String[] args) {
//        String connectionString = "mongodb+srv://marioferron1997_db_user:<db_password>@cluster0.bfobsix.mongodb.net/?appName=Cluster0";
//        ServerApi serverApi = ServerApi.builder()
//                .version(ServerApiVersion.V1)
//                .build();
//        MongoClientSettings settings = MongoClientSettings.builder()
//                .applyConnectionString(new ConnectionString(connectionString))
//                .serverApi(serverApi)
//                .build();
//        // Create a new client and connect to the server
//        try (MongoClient mongoClient = MongoClients.create(settings)) {
//            try {
//                // Send a ping to confirm a successful connection
//                MongoDatabase database = mongoClient.getDatabase("admin");
//                database.runCommand(new Document("ping", 1));
//                System.out.println("Pinged your deployment. You successfully connected to MongoDB!");
//            } catch (MongoException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
