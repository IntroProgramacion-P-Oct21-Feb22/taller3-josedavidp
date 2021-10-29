/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author Usuario
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double variable1 = 10; 
        double variable2 = 9;
        double variable3 = 20;
        double variable4 = 500;
        double variable5 = 2;
        double variable6 = 3;
        double variable7 = 200;
        double variable8 = 50;
        double variable9 = 51;
        
        boolean resultado = (((variable1 * variable2) + variable3 - (variable4 / variable5) + (Math.pow(variable6, variable5)) >= variable7) || (variable8 >= (variable8 - variable8 + variable9)));
        
        System.out.println(resultado);
    }
    
}
