/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_busqueda;

import java.util.Scanner;

/**
 *
 * @author jealt
 */
public class EVA3_11_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[] = new int[10];
        //LLENARLO CON VALORES ALEATORIOS        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100) + 1;
        }
        //IMPRIMIRLO
        for (int val : arreglo) {
            System.out.println("[" + val + "]");
        }
        //PREGUNTAR AL USUARIO EL VALOR A BUSCAR
        Scanner captura = new Scanner(System.in);
        System.out.println("¿Que valor buscas?");
        int valor = captura.nextInt();
        //BUSCAR:
        //RECORRER EL ARREGLO (CICLO FOR)
        
        int pos = -1;//una posicion que no existe
        for(int i = 0; i < arreglo.length; i++) {
            if(valor == arreglo[i]) {
                pos = i;
                break;
            }
        }
        System.out.println("Posicion = " + pos);
    }
}
