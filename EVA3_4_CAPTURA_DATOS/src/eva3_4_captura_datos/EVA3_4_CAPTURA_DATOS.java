/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_captura_datos;

import java.util.Scanner;

/**
 *
 * @author jealt
 */
public class EVA3_4_CAPTURA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        Scanner captura = new Scanner(System.in);
        System.out.println("¿Cuantos nombres vas a capturar?");
        cant = captura.nextInt();
        String[] listaNombres = new String[cant];
        //HAY QUE PREGUNTARA CADA NOMBRE:
        captura.nextLine();
        for (int i = 0; i < listaNombres.length; i++) {
            System.out.println("Nombre i " + (i + 1) + ":" );
            listaNombres[i] = captura.nextLine();
        }
        
        for (int i = 0; i < listaNombres.length; i++) {
            System.out.println(listaNombres[i]);
        }
    }
    
}
