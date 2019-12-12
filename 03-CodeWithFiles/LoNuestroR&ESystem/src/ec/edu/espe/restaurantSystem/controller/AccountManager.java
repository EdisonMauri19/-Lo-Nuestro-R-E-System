/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.controller;

import com.google.gson.Gson;
import ec.edu.espe.restaurantSystem.lib.FileLibrary;
import ec.edu.espe.restaurantSystem.lib.PasswordLibrary;
import ec.edu.espe.restaurantSystem.model.Account;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author camyt
 */
public class AccountManager {
    private static Gson gson = new Gson();
    public static void addAccount(Account account){
        String password;
        password = PasswordLibrary.encryptPass(account.getPassword());
        account.setPassword(password);
        FileLibrary.addToFile(account);
        
    }
    public static ArrayList<Account> readAccount(){
        ArrayList<Object> object;
        ArrayList<Account> accounts = new ArrayList<Account>();
        object = FileLibrary.readObjects(Account.class.getSimpleName());
        for (int i = 0; i < object.size(); i++) {
            Account account;
            Object objectJ;
            objectJ = object.get(i);
            String jAccount = gson.toJson(objectJ);
            account = gson.fromJson(jAccount, Account.class);
            accounts.add(account);
            
        }
        return accounts;
         
    }
    public static Account valAccount(String userName, String password){
      ArrayList<Account> accounts;
      accounts = readAccount();
      Account account = null;
        for (int i = 0; i < accounts.size(); i++) {
            if(accounts.get(i).getUserName().equals(userName) && PasswordLibrary.decryptPass(accounts.get(i).getPassword()).equals(password)){
                account = accounts.get(i);
            }
                
        }
        return account;
      
    }
    
    public static int assingId(){
        ArrayList<Account> accounts;
        File f = new File("Account.json");
        if(f.exists())
        {
            accounts = readAccount();
            return accounts.size()+1;
        }else return 1;
        
        
    }
    
}
