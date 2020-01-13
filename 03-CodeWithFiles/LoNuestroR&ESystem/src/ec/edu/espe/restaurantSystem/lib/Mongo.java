/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.lib;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
/**
 *
 * @author camyt
 */
public class Mongo {
    MongoClient mongoClient = new MongoClient();
    MongoDatabase db = mongoClient.getDatabase("test");
    
}
