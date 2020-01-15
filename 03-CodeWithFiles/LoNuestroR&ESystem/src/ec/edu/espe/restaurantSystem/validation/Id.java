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
public class Id {

    public boolean idValidation(String id) {
        boolean correctId = false;

        try {

            if (id.length() == 10) 
            {
                int thirdDig = Integer.parseInt(id.substring(2, 3));
                if (thirdDig < 6) {
                    int[] coefValId = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int checker = Integer.parseInt(id.substring(9, 10));
                    int sum = 0;
                    int digito = 0;
                    for (int i = 0; i < (id.length() - 1); i++) {
                        digito = Integer.parseInt(id.substring(i, i + 1)) * coefValId[i];
                        sum += ((digito % 10) + (digito / 10));
                    }

                    if ((sum % 10 == 0) && (sum % 10 == checker)) {
                        correctId = true;
                    } else if ((10 - (sum % 10)) == checker) {
                        correctId = true;
                    } else {
                        correctId = false;
                    }
                } else {
                    correctId = false;
                }
            } else {
                correctId = false;
            }
        } catch (NumberFormatException nfe) {
            correctId = false;
        } catch (Exception err) {
            System.out.println("Una excepcion ocurrio en el proceso de validadcion");
            correctId = false;
        }

        if (!correctId) {
            System.out.println("La Cédula ingresada es Incorrecta");
        }
        return correctId;
    }
}
