package misproyectos.actividad4ejercicio4_1;
import java.util.*;
public class Actividad4Ejercicio4_1 { //se cambio el nombre de la clase: PruebaCuenta, a la indicacion de la actividad.

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        
        System.out.println("Ingrese saldo inicial = $");
        float saldoInicialAhorros = input.nextFloat();
        
        System.out.print("Ingrese tasa de interés = ");
        float tasaAhorros = input.nextFloat();
        
        CuentaAhorros cuenta1 = new CuentaAhorros(saldoInicialAhorros, tasaAhorros);
        
        System.out.print("Ingresar cantidad a consignar: $");
        float cantidadDepositar = input.nextFloat();
        
        cuenta1.consignar(cantidadDepositar);
        
        System.out.print("Ingresar cantidad a retirar: $");
        float cantidadRetirar = input.nextFloat();
        
        cuenta1.retirar(cantidadRetirar);
        
        cuenta1.extractoMensual();
        cuenta1.imprimir();
        
    }
}
