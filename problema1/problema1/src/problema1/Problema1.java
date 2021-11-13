/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        entrada.useLocale(Locale.US);
        //variables
        double costokilo;
        double valor_consumido;
        double descuento;
        double porcentaje;
        double valorTotal;
        int edad;
        
       porcentaje = 10;
        
        System.out.println("Ingrese el costo por kilovatio");
        costokilo = entrada.nextDouble();
        
        System.out.println("Ingrese los kilovatios consumidos");
        valor_consumido = entrada.nextDouble();
        
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        
        valorTotal = (costokilo * valor_consumido);
        
        if (edad > 65){
            descuento = (porcentaje * valorTotal)/100;
            valorTotal = (valorTotal - descuento);
        }
         System.out.printf("el valor total a pagar es de: %.2f", valorTotal);
    }
    
}
