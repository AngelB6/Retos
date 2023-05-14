package Retos;

import java.util.Scanner;

public class RetoVI {
    public static void main(String[] args) {
        // Declaramos las variables necesarias
        int canProd, precio = 0, total = 0;
        // Instanciamos la clase Scanner para capturar los datos ingresados por el usuario 
        Scanner capturar = new Scanner(System.in);
        System.out.println("Bienvenido!\nIngrese la cantidad de productos que desea comprar");
        // Asignamos los datos capturados a la variable
        canProd = capturar.nextInt();
        // Creamos un ciclo for que dependiendo la cantidad de productos digitada por el ususario es la cantidad de veces que se va a ejecutar
        for (int i = 1; i <= canProd;){
            System.out.println("Ingrese el precio del producto N" + i);
            // Asignamos el valor capturado a la variable
            precio = capturar.nextInt();
            // Realizamos el proceso de suma de las variables para hallar el total
            total = total + precio;
            i++;
        }
        System.out.println("El total de la compra es: " + total);
        // Limpiamos el buffer
        capturar.close();
    }
}