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
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author camyt
 */
public class AccountManager {
    private Gson gson;
    public void addAccount(Account account){
        String password;
        password = PasswordLibrary.decryptPass(account.getPassword());
        account.setPassword(password);
        FileLibrary.addToFile(account);
        
    }
    public ArrayList<Account> readAccount(){
        ArrayList<Object> object;
        ArrayList<Account> accounts = new ArrayList<Account>();
        object = FileLibrary.readObjects(Account.class.getSimpleName());
        System.out.println(Arrays.toString(object.toArray())+"papa");
        for (int i = 0; i < object.size(); i++) {
            Account account;
            String jsonAccount = gson.toJson(object.get(i));
            System.out.println(jsonAccount+"papa2");
            account = gson.fromJson(jsonAccount, Account.class);
            accounts.add(account);
            
        }
        return accounts;
         
    }
    public Account valAccount(String userName, String password){
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
    
}
