package Retos;

import java.util.Scanner;

public class RetoIII {
    public static void main(String[] args) {
        // Declaramos las varibales y el metodo random
        int opcion, piedra=1, papel=2, tijera=3;
        int maquina = (int) (Math.random()*3+1);
        System.out.println("Bienvenido!\nSeleccione una de las opciones\n1. Piedra\n2. Papel\n3. Tijera");
        // Instanciamos la clase Scanner para capturar los valores ingresados por el usuario
        Scanner capturar = new Scanner(System.in);
        // Capturamos la opcion seleccionada por el usuario y la asignamos a la variable
        opcion=capturar.nextInt();
        // Creamos una condicional que mostrara que opcion ha seleccuionado el ramdom
        if (maquina==1){
            System.out.println("La maquina ha seleccinado Piedra");
            }else if (maquina==2){
                System.out.println("La maquina ha seleccionado Papel");
            }else{
                System.out.println("La maquina ha seleccionado Tijera");
            }
        // Creamos una condicional que compare la opcion seleccionada por el usuario y ejecute otra condicional donde dependiendo del valor seleccionado por ramdom gane, pierda o empate
        if (opcion==piedra){
            System.out.println("Usted ha seleccionado Piedra");
            if (maquina==3){
                System.out.println("Usted ha ganado");
            }else if (maquina==2){
                System.out.println("Usted ha perdido");
            }else{
                System.out.println("Usted ha empatado");
            }
        }else if (opcion==papel){
            System.out.println("Usted ha seleccionado Papel");
            if (maquina==1){
                System.out.println("Usted ha ganado");
            }else if (maquina==3){
                System.out.println("Usted ha perdido");
            }else{System.out.println();
                System.out.println("Usted ha empatado");
            }
        }else if (opcion==tijera){
            System.out.println("Usted ha seleccionado Tijera");
            if (maquina==2){
                System.out.println("Usted ha ganado");
            }else if (maquina==1){
                System.out.println("Usted ha perdido");
            }else{
                System.out.println("Usted ha empatado");
            }
        }else{
            System.out.println("Ingrese un valor valido");
        }
        // Limpiamos el buffer
        capturar.close();
    }
}