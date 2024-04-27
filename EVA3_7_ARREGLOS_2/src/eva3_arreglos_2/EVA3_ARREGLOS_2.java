/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_arreglos_2;

/**
 *
 * @author jealt
 */
public class EVA3_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JAVA: 0 PRIMER ELEMENTO
        //       N - 1 AL ÚLTIMO ELEMENTO
        //N --- TOTAL DE ELEMENTOS ALMACENADOS EN EL ARREGLO
        
        //vamos a crear un arreglo y llenarlo de valores aleatorios.
        //int datos[],
        int datos[] = new int[10];
        
        //Asignar valores aleatorios entre 0 y 99, (1, 100)
        for(int i = 0; i < datos.length; i++) {
            datos[i] = (int) (Math.random() * 100);//0 - 99
        }
        //Imprimir los elementos del arreglo;
        for(int i = 0; i < datos.length; i++) {
            System.out.print("[" + datos[i] + "]");
        }
                
    }
}
    

