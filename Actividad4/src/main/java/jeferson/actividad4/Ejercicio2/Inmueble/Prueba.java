/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jeferson.actividad4.Ejercicio2.Inmueble;

/**
 *
 * @author JEFERSON
 */

public class Prueba {
    public static void main(String args[]) {
        ApartamentoFamiliar apto1 = new ApartamentoFamiliar(103067, 120, "Avenida Santander 45-45", 3, 2, 200000);
        System.out.println("Datos apartamento");
        apto1.calcularPrecioVenta(ApartamentoFamiliar.valorArea);
        apto1.imprimir();

        System.out.println("Datos apartaestudio");
        Apartaestudio aptestudio1 = new Apartaestudio(12354, 50, "Avenida Caracas 30-15", 1, 1);
        aptestudio1.calcularPrecioVenta(Apartaestudio.valorArea);
        aptestudio1.imprimir();
    }
}
