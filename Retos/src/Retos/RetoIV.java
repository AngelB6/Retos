package Retos;

import java.util.Scanner;

public class RetoIV {
    public static void main(String[] args) {
        // Declaramos las variables
        int opcion, seleccion;
        // Capturamos el valor ingresado por el usuario 
        Scanner capturar = new Scanner(System.in);
        System.out.println("Bienvenido al juego carisellazo!\nIngrese la opcion que desea\n1. Cara\n2. Sello");
        // Asignamos el valor capturado a la variable opcion
        opcion = capturar.nextInt();
        // Creamos una condicinal que dependiendo del valor ingresado por el ususario muestre la opcion seleccionada
        if (opcion==1){
            System.out.println("Usted selecciono Cara\nLa moneda esta girando.........");
        }else if(opcion==2){
            System.out.println("Usted selecciono Sello\nLa moneda esta girando.........");
        }else{
            System.out.println("Ingrese un valor valido");
        }
        // Ejecutamos un random 
        seleccion = (int) (Math.random()*2+1);
        // Creamos una condicional que dependeindo del valor seleccionado por random compare el valor ingresado por el usuario y muestre si gano o perdio
        if (opcion==seleccion){
            System.out.println("Felicidades, ha ganado");
        }else{ 
            System.out.println("Perdiste");
        }
        // Limpiamos el buffer
        capturar.close();
    }    
}