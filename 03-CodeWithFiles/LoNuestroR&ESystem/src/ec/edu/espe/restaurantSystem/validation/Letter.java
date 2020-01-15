/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.validation;





/**
 *
 * @author camyt
 */
public class Letter {
    public int letter(String word){
     
         for (int i = 0; i < word.length(); i++)
		{
			char caracter = word.toUpperCase().charAt(i);
			int valorASCII = (int)caracter;
			if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90))
		///// No letra
                            return 1;
                           
		}
          return 0;
}
}
