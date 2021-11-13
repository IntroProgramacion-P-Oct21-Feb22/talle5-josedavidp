/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //variables
        int dias;
        double precio;
        double descuento1;
        double descuento2;
        double descuento3;
        double porcentaje1;
        double porcentaje2;
        double porcentaje3;
        double valorTotal = 0;
        double subTotal;

        porcentaje1 = 10;
        porcentaje2 = 15;
        porcentaje3 = 20;

        System.out.println("Ingrese el número de días");
        dias = entrada.nextInt();

        System.out.println("Ingrese el precio de la habitación");
        precio = entrada.nextDouble();

        subTotal = precio * dias;
        if (dias <= 0) {
            valorTotal = 0;
            subTotal = 0;
        }

        if (dias <= 5) {
            valorTotal = subTotal;
        } else {

            if (dias > 5 && dias <= 10) {
                descuento1 = (porcentaje1 * subTotal) / 100;
                valorTotal = (subTotal - descuento1);
            }
        }
        if (dias > 10 && dias <= 15) {
            descuento2 = (porcentaje2 * subTotal) / 100;
            valorTotal = (subTotal - descuento2);
        } else {
            if (dias > 15) {
                descuento3 = (porcentaje3 * subTotal) / 100;
                valorTotal = (subTotal - descuento3);
            }
        }
        System.out.printf("el valor subtotal a pagar es de: %.2f, %n", subTotal);
        System.out.printf("el valor total a pagar es de: %.2f", valorTotal);

    }

}
