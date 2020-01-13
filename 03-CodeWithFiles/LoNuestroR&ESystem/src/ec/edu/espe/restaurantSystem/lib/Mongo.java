/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.lib;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.sun.istack.internal.logging.Logger;
import java.net.UnknownHostException;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author camyt
 */
public class Mongo {
    DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    public Mongo(){
        try{
            Mongo mongo = new Mongo("localhost", 27017);
            DataBase = mongo.getDB("Restaurant");
            collection = DateBase.getCollection("LoNuestro");
        }
        catch(UnknownHostException ex){
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
           
        }
    }
    public boolean insert(String name){
        document.put("Name", name);
        collection.insert(document);
        return true;        
    }
    public void show(){
        DBCursor cursor = collection.find();
        while(cursor.hasNext()){
            System.out.println(cursor.next());
        }
    }
    public boolean upgrade(String name, String newName){
        document.put("name", name);
        BasicDBObject newDocument = new BasicDBObject();
        newDocument.put("name", newName);
        collection.findAndModify(document, newDocument);
        return true;
    }
    public boolean delete(String name){
        document.put("name", name);
        collection.remove(document);
        return true;
    }
    
}
