/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_15_sumatoria;

import java.util.Scanner;

/**
 *
 * @author jealt
 */
public class EVA3_15_SUMATORIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ver = new Scanner(System.in);
        System.out.println("entero");
        int num1 = ver.nextInt();
        
        int resu = calcularSum(num1);
        System.out.println(resu);
    }
    public static int calcularSum(int base){
        int resu = 0;
        for (int i = 0; i < base; i++) {
            resu += i;
        }
        return resu;
    }
    
}
