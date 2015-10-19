/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosuman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author widemos
 */
public class EjercicioSumaN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int valores;

        do {
            System.out.println("¿Cuantos valores quieres sumar?");
            valores = Integer.parseInt(br.readLine());
            System.out.println("los valores son: " + valores);

        } while (valores <= 0);
        
        
        int suma = 0;
        
        for (int i = 1; i <= valores; i++) {
            System.out.println("¿Introduce el numero para el valor:" +i);
            int numero = Integer.parseInt(br.readLine());
            System.out.println("de moomento numero vale:"+numero);
            suma = suma + numero;

        }
        System.out.println("La suma es: " + suma);

    }

}
   
