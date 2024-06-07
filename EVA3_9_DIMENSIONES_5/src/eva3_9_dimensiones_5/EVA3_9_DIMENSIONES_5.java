/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_dimensiones_5;

/**
 *
 * @author jealt
 */
public class EVA3_9_DIMENSIONES_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cubo[][][][][] = new int[35][25][20][10][5];
                for (int i = 0; i < cubo.length; i++) {
                    for (int j = 0; j < cubo[i].length; j++) {
                        for (int k = 0; k < cubo[i][j].length; k++) {
                            for (int m = 0; m < cubo[i][j][k].length; m++) {
                                for (int n = 0; n < cubo[i][j][k][n].length; n++) {
                                    cubo[i][j][k][m][n] = (int) (Math.random() *100); 
                                }
                            }
                        }
                            
                        }
                    }
                for (int i = 0; i < cubo.length; i++) {
                    for (int j = 0; j < cubo[i].length; j++) {
                        for (int k = 0; k < cubo[i][j].length; k++) {
                            for (int m = 0; m < cubo[i][j][k].length; m++) {
                                for (int n = 0; n < cubo[i][j][k][n].length; n++) {
                                    System.out.println("[" + cubo [i][j][k][m][n] + "]");
                                }
                            }
                        }
                    }
                }
    }
    
}
