/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema2 {
//Solución que imprima el costo de un pedido de un artículo del cual se tiene 
 // la descripción, la cantidad que se requiere y el precio unitario. Si la 
 //cantidad pedida excede de 50 unidades, se hace un descuento de 15%.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        entrada.useLocale(Locale.US);
        //variables
       int cantidad; 
       double precioUnidad;
       double descuento;
       double porcentaje;
       double valorTotal = 0;
       String articulo;
        
       porcentaje = 15;

       System.out.println("Ingrese el nombre del artículo");
       articulo = entrada.nextLine();
        
       System.out.println("Ingrese la cantidad que requiere");
       cantidad = entrada.nextInt();
       
       System.out.println("Ingrese el precio unitario del artículo");
       precioUnidad = entrada.nextDouble();
        
       valorTotal = precioUnidad * cantidad;
       
       if(cantidad <= 0){
           System.out.println("Ingrese los datos correctamente");
           valorTotal = 0;
       } else {
            if (cantidad >= 1 && cantidad <=49){
            valorTotal = (precioUnidad * cantidad);
            }else {
            if (cantidad >= 50){
            descuento = (porcentaje * valorTotal)/100;
            valorTotal = (valorTotal - descuento);}
            }

            }
       System.out.printf("el valor total a pagar es de: %.2f\narticulo:%s\n", 
               valorTotal, articulo);
        }
                
                
         
    }
    

