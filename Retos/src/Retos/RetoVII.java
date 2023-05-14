package Retos;

import java.util.Scanner;

public class RetoVII {
    public static void main(String[] args) {
        // Declaramos las variables para el primer condiconal el cual reinica por completo el programa
        int respuesta1 = 1;
        // Instanciamos la clase Scanner para capturar los valores ingresados por el usuario 
        Scanner capturar = new Scanner(System.in);
        // Creamos un ciclo while que se ejecutara al final del juego preguntando al usuario si desea reiniciar el programa
        while (respuesta1==1) {
            // Declaramos las variables para el desarrollo del juego
            int opcion, seleccion, apuesta = 0, total = 0, i = 0, respuesta = 1;               
            System.out.println("Bienvenido al juego carisellazo!");
            // Creamos un ciclo while que se ejcutara siempre que la respuesta del usuario sea igual a 1 (Si)
            while (respuesta == 1){
                System.out.println("Ingrese la cantidad de dinero que desea apostar");
                // Asigamos el valor capturado a la variable apuesta
                apuesta = capturar.nextInt();
                System.out.println("Su apuesta es de: " + apuesta + "\nIngrese la opcion que desea\n1. Cara\n2. Sello");
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
                    // Sumamos al valor apostado el valor ganado
                    apuesta = apuesta + apuesta;
                    // Sumamos al total el valor ganado en la apuesta
                    total = total + apuesta;
                }else{
                    System.out.println("Perdiste");
                    // Restamos al valor apostado el valor perdido
                    apuesta = apuesta - apuesta;
                    // Restamos al total el valor perdido en la apuesta
                    total = total - apuesta;
                }
                // Incrementamos el contador para saber cuantas veces a jugado el usuario
                i++;
                System.out.println("¿Desea volver a jugar?\n1. Si\n2. No");
                // Asignamos el valor capturado a la variable respuesta (Segundo ciclo)
                respuesta = capturar.nextInt();
            }
            // Mostramos los resultados
            System.out.println("Gracias por jugar\nUsted jugo " + i + " y quedo con " + total);
            System.out.println("¿Desea reiniciar el programa?\n1. Si\n2. No");
            // Asignamos el valor capturado a la variable respuesta1 (Primer ciclo)
            respuesta1 = capturar.nextInt();
        }
    }
}