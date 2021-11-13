/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String marca;
        String origen;
        double costo;
        //impuestos
        double impuesto1;
        double impuesto2;
        double impuesto3;
        double impuesto4;
        //porcentajes
        double porcentaje1 = 20;
        double porcentaje2 = 30;
        double porcentaje3 = 15;
        double porcentaje4 = 8;

        double ventaTotal;

        System.out.println("Ingrese la marca del automóvil");
        marca = entrada.nextLine();

        System.out.println("Ingrese el origen del automóvil");
        origen = entrada.nextLine();

        System.out.println("Ingrese el costo del automóvil");
        costo = entrada.nextDouble();

        if (costo < 0) {
            System.out.println("Ingrese un valor válido");
        } else {
            if (origen.equals("Alemania")) {
                impuesto1 = (costo * porcentaje1) / 100;
                ventaTotal = (impuesto1 + costo);
                System.out.printf("El impuesto por pagar es: %.2f\n"
                        + "El precio de venta total es: %.2f\n",
                        impuesto1, ventaTotal);
            } else {
                if (origen.equals("Japon")) {
                    impuesto2 = (costo * porcentaje2) / 100;
                    ventaTotal = (impuesto2 + costo);
                    System.out.printf("El impuesto por pagar es: %.2f\n"
                            + "El precio de venta total es: %.2f\n",
                            impuesto2, ventaTotal);
                } else {
                    if (origen.equals("Italia")) {
                        impuesto3 = (costo * porcentaje3) / 100;
                        ventaTotal = (impuesto3 + costo);
                        System.out.printf("El impuesto por pagar es: %.2f\n"
                                + "El precio de venta total es: %.2f\n",
                                impuesto3, ventaTotal);
                    } else {
                        if (origen.equals("USA")) {
                            impuesto4 = (costo * porcentaje4) / 100;
                            ventaTotal = (impuesto4 + costo);
                            System.out.printf("El impuesto por pagar es: %.2f\n"
                                    + "El precio de venta total es: %.2f\n",
                                    impuesto4, ventaTotal);
                        } else {
                            System.out.printf("No requiere pagar impuesto\n"
                                    + "El precio de venta total es: %.2f\n", costo);
                        }
                    }
                }

            }

        }
    }
}
