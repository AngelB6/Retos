package Retos;

import java.util.Scanner;

public class RetoII {
    public static void main(String[] args) {
        // Declaramos las variables necesarias para los procesos y resultados
        float pesoBebe = 0, mesesBebe = 0, dosisVacuna = 0;
        String nomEnfermera, nomPadre, nomBebe;
        System.out.println("Bienvenido \nEnfermera por favor ingrese su nombre: ");
        // Intanciamos la clase Scanner para capturar el valor de ingreso
        Scanner capturar = new Scanner(System.in);
        // Asignamos el valor capturado a la variable correspondiente
        nomEnfermera = capturar.nextLine();
        System.out.println(nomEnfermera + " por favor ingrese el nombre del padre o la madre del bebe \nNombre Padre:");
        // Asignamos el valor capturado a la variable correspondiente
        nomPadre = capturar.nextLine();
        System.out.println(nomEnfermera + " ingrese el nombre del bebe:");
        // Asignamos el valor capturado a la variable correspondiente
        nomBebe = capturar.nextLine();
        System.out.println(nomEnfermera + " ingrese el peso de " + nomBebe + ":");
        // Asignamos el valor capturado a la variable correspondiente
        pesoBebe = capturar.nextInt();
        System.out.println("Ingrese los meses de " + nomBebe + ":");
        // Asignamos el valor capturado a la variable correspondiente
        mesesBebe = capturar.nextInt();
        // Realizamos la operacion 
        dosisVacuna = ((pesoBebe+10) / (mesesBebe*10)) * 8;
        // Mostramos el resultado
        System.out.println(nomEnfermera + " la dosis de la vacuna es: " + dosisVacuna + "\n" + nomPadre + " felicidades por " + nomBebe);
        // Limpiamos el buffer
        capturar.close();
    }   
}