package Retos;
import java.util.Scanner;

public class RetoV {
    public static void main(String[] args) {
        // Declaramos las variables necesarias
        String mes;
        int dia;
        Scanner capturar = new Scanner(System.in);
        System.out.println("Bienvenido!\nIngrese el mes en el que nacio");
        // Asignamos el vlaor ingresado por el usuario a la variables mes 
        mes = capturar.nextLine();
        // Creamos una condicional dependiendo del mes en el que nacio y luego le preguntamos el dia para saber el signo y mostrar sus carateristicas
        if(mes.equalsIgnoreCase("enero")){
            System.out.println("Ingrese por favor el dia que nacio");
            dia = capturar.nextInt();
            if(dia >=1 || dia <=19){
                System.out.println("Signo: Capricornio \nSe caracteriza por ser prudente y práctico en todos los asuntos que le conciernen.");
            }else if(dia >=20 || dia <=31){
                System.out.println("Signo: Acuario \nSimpático, original y brillante, es un signo muy humanitario, al mismo tiempo que independiente e intelectual.");
            }else{
                System.out.println("Ingrese un dia valido");
            }
        }else if(mes.equalsIgnoreCase("febrero")){
            System.out.println("Ingrese por favor el dia que nacio");
            dia = capturar.nextInt();
            if(dia >=1 || dia <=18){
                System.out.println("Signo: Acuario \nSimpático, original y brillante, es un signo muy humanitario, al mismo tiempo que independiente e intelectual.");
            }else if(dia >=19 || dia <=28){
                System.out.println("Signo: Piscis \nSensible ante el sufrimiento de los demás, responde con buena voluntad y ganas de ayudar.");
            }else{
                System.out.println("Ingrese un dia valido");
            }
        }else if(mes.equalsIgnoreCase("marzo")){
            System.out.println("Ingrese por favor el dia que nacio");
            dia = capturar.nextInt();
            if(dia >=1 || dia <= 20){
                System.out.println("Signo: Piscis \nSensible ante el sufrimiento de los demás, responde con buena voluntad y ganas de ayudar.");
            }
            else if(dia >=21 || dia <= 31){
                System.out.println("Signo: Aries \nSe caracteriza por ser una persona rebosante de energía y entusiasmo.");
            }else{
                System.out.println("Ingrese un dia valido");
            }
        }else if(mes.equalsIgnoreCase("abril")){
            System.out.println("Ingrese por favor el dia que nacio");
            dia = capturar.nextInt();
            if(dia >= 1 || dia <= 19){
                System.out.println("Signo: Aries \nSe caracteriza por ser una persona rebosante de energía y entusiasmo.");
            }else if (dia >= 20 || dia <=30 ){
                System.out.println("Signo: Tauro \nPersonas firmes, decididas y constantes en varios sentidos.");
            }else{
                System.out.println("Ingrese un dia valido");
            }
        }else if(mes.equalsIgnoreCase("mayo")){
            System.out.println("Ingrese por favor el dia que nacio");
            dia = capturar.nextInt();
            if(dia >=1 || dia <=20){
                System.out.println("Signo: Tauro \nPersonas firmes, decididas y constantes en varios sentidos.");
            }else if(dia >= 21 || dia <=31 ){
                System.out.println("Signo: Géminis \nSe adaptan con facilidad y rapidez a todo");
            }else{
                System.out.println("Ingrese un dia valido");
            }
        }else if(mes.equalsIgnoreCase("junio")){
            System.out.println("Ingrese por favor el dia que nacio");
            dia = capturar.nextInt();
            if(dia >=1 || dia<=20){
                System.out.println("Signo: Géminis \nSe adaptan con facilidad y rapidez a todo");
            }else if(dia >= 21 || dia <=30){
                System.out.println("Signo: Cáncer \nPuede ser desde retraído, insociable y pelma, hasta deslumbrante, atractivo y admirado por los demás.");
            }else{
                System.out.println("Ingrese un dia valido");
            }
        }else if(mes.equalsIgnoreCase("julio")){
            System.out.println("Ingrese por favor el dia que nacio");
            dia = capturar.nextInt();
            if(dia >=1 || dia <=22){
                System.out.println("Signo: Cáncer \nPuede ser desde retraído, insociable y pelma, hasta deslumbrante, atractivo y admirado por los demás.");
            }else if(dia >=23 || dia <=31){
                System.out.println("Signo: Leo \nCreativo y abierto, tiene ambición, valor, fuerza, autonomía y total seguridad en sí mismo.");
            }else{
                System.out.println("Ingrese un dia valido");
            }
        }else if(mes.equalsIgnoreCase("agosto")){
            System.out.println("Ingrese por favor el dia que nacio");
            dia = capturar.nextInt();
            if(dia >=1 || dia <=22){
                System.out.println("Signo: Leo \nCreativo y abierto, tiene ambición, valor, fuerza, autonomía y total seguridad en sí mismo.");
            }else if(dia >=23 || dia <=31){
                System.out.println("Signo: Virgo \nEspíritu crítico, precisión, reserva, paciencia y convencionalismo.");
            }else{
                System.out.println("Ingrese un dia valido");
            }
        }else if(mes.equalsIgnoreCase("septiembre")){
            System.out.println("Ingrese por favor el dia que nacio");
            dia = capturar.nextInt();
            if(dia >=1 || dia <=22){
                System.out.println("Signo: Virgo \nEspíritu crítico, precisión, reserva, paciencia y convencionalismo.");
            }else if(dia >=23 || dia <=31){
                System.out.println("Signo: Libra \nTiene elegancia, encanto, diplomacia y buen gusto, ama la belleza, es muy curioso por naturaleza y odia los conflictos.");
            }else{
                System.out.println("Ingrese un dia valido");
            }
        }else if(mes.equalsIgnoreCase("octubre")){
            System.out.println("Ingrese por favor el dia que nacio");
            dia = capturar.nextInt();
            if(dia >=1 || dia <=22){
                System.out.println("Signo: Libra \nTiene elegancia, encanto, diplomacia y buen gusto, ama la belleza, es muy curioso por naturaleza y odia los conflictos.");
            }else if(dia >=23 || dia <=31){
                System.out.println("Signo: Escorpio \nTiene mucha imaginación e intuición, además de una gran capacidad para el análisis, fuerza de voluntad y firmeza, aunque también es muy sensible y emocional consigo mismo y con el entorno.");
            }else{
                System.out.println("Ingrese un dia valido");
            }
        }else if(mes.equalsIgnoreCase("noviembre")){
            System.out.println("Ingrese por favor el dia que nacio");
            dia = capturar.nextInt();
            if(dia >=1 || dia <=21){
                System.out.println("Signo: Escorpio \nTiene mucha imaginación e intuición, además de una gran capacidad para el análisis, fuerza de voluntad y firmeza, aunque también es muy sensible y emocional consigo mismo y con el entorno.");
            }else if(dia >=22 || dia <=30){
                System.out.println("Signo: Sagitario \nEs versátil, adora las aventuras y buscar nuevos horizontes, ya que tiene una mente abierta a nuevas ideas y experiencias y mantiene una actitud decidida ante la adversidad.");
            }else{
                System.out.println("Ingrese un dia valido");
            }
        }else if(mes.equalsIgnoreCase("diciembre")){
            System.out.println("Ingrese por favor el dia que nacio");
            dia = capturar.nextInt();
            if(dia >=1 || dia <=21){
                System.out.println("Signo: Sagitario \nEs versátil, adora las aventuras y buscar nuevos horizontes, ya que tiene una mente abierta a nuevas ideas y experiencias y mantiene una actitud decidida ante la adversidad.");
            }else if(dia >=22 || dia <=31){
                System.out.println("Signo: Capricornio \nSe caracteriza por ser prudente y práctico en todos los asuntos que le conciernen.");
            }else{
                System.out.println("Ingrese un dia valido");
            }
        }else{
            System.out.println("Ingrese un mes valido");
        }
        // Limpiamos el buffer
        capturar.close();
    }
}