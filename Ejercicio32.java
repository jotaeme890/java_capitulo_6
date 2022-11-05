/**
 * 32 Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con
 * el carácter “|”. La anchura del sendero siempre es la misma, los dos caracteres
 * del borde más cuatro caracteres en medio, en total 6 caracteres (incluyendo
 * espacios). A cada metro, el sendero puede continuar recto, girar un carácter a
 * la izquierda o girar un carácter a la derecha, por supuesto de forma aleatoria.
 * Por cada metro de sendero - representado por una línea - puede que haya un
 * obstáculo o puede que no, la probabilidad es del 50%. La posición del obstáculo
 * es aleatoria dentro de la línea. En caso de existir un obstáculo en un metro de
 * sendero (en una línea), puede ser una planta (carácter *) o una piedra (carácter
 * O) , la probabilidad de que salga uno u otro es la misma. Recuerda que nunca
 * habrá más de un obstáculo por metro de sendero, habrá uno o ninguno.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la longitud del sendero: ");
        int altura = sc.nextInt();
        int espacios= 12; //espacios laterales
        int numfigura = 0;
        int sendero = 0;
        int posicion2 = 0;
        
        for(int i = 1; i<=altura ; i++){
            int numeroposicion = (int)(Math.random()*3+1);

            switch (numeroposicion) {
                case 1:
                    numfigura = 0;

                    sendero = 0;
                    espacios--;
                    for(int b = 1; b<=espacios;b++){
                        System.out.print(" ");
                    }

                    System.out.print("|");

                    numfigura =(int)(Math.random()*2+1);
                    switch (numfigura) {
                        case 1:
                        sendero = numfigura;
                        break;
                        case 2:
                        numfigura = 0;
                        break;
                    }

                    for(int c = 1; c<=4;c++){
                        posicion2++;
                        if(sendero==posicion2){
                            System.out.print("*");
                        } else{
                            if(sendero==posicion2){
                                System.out.print("O");
                            } 
                            else{
                                System.out.print(" ");
                            }
                        }
                    }

                    System.out.print("|");
                    System.out.println("");
                break;
                
                case 2:
                    numfigura = 0;
                    posicion2 = 0;
                    sendero = 0;
                    for(int d = 1; d<=espacios;d++){
                        System.out.print(" ");
                    }

                    System.out.print("|");
                        numfigura =(int)(Math.random()*2+1);
                        switch (numfigura) {
                            case 1:
                                sendero = numfigura;
                            break;
                            case 2:
                                numfigura = 0;
                            break;
                        }

                        for(int e = 1; e<=4;e++){
                            posicion2++;
                            if(sendero==posicion2){
                                System.out.print("*");
                            } else{
                                if(sendero==posicion2){
                                    System.out.print("O");
                                } 
                                else{
                                    System.out.print(" ");
                                }
                            }
                        }
                    System.out.print("|");
                    System.out.println("");
                break;

                case 3:
                    numfigura = 0;
                    posicion2 = 0;
                    sendero = 0;
                    espacios++;
                    for(int f = 1; f<=espacios;f++){
                        System.out.print(" ");
                    }

                    System.out.print("|");
                        numfigura =(int)(Math.random()*2+1);
                        switch (numfigura) {
                            case 1:
                                sendero = numfigura;
                            break;
                            case 2:
                                numfigura = 0;
                            break;
                        }

                        for(int g = 1; g<=4;g++){
                            posicion2++;
                            if(sendero==posicion2){
                                System.out.print("*");
                            } else{
                                if(sendero==posicion2){
                                    System.out.print("O");
                                } 
                                else{
                                    System.out.print(" ");
                                }
                            }
                        }
                    System.out.print("|");
                    System.out.println("");
                break;
            }   
        }

        sc.close();
    }
}