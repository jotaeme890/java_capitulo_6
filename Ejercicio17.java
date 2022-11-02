/**
 * 17 Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
 * Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
 * serán de 4 unidades. No hay que comprobar que los datos se introducen
 * correctamente; podemos suponer que el usuario los introduce bien. Dentro de
 * la pecera hay que colocar de forma aleatoria un pececito, que puede estar
 * situado en cualquiera de las posiciones que quedan en el hueco que forma el
 * rectángulo.
 * 
 * @author jotaeme
 */

import java.util.Scanner;


public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime la altura de la pecera (mínimo 4): ");
        int altura = sc.nextInt();
        System.out.print("Dime el ancho de la pecera (mínimo 4): ");
        int ancho = sc.nextInt();

        int pez = (int)(Math.random()*(altura-2)*(ancho-2));
        int posicion = 0;
        //int pez = (int)(Math.random()*ancho-1+1);
        
        for(int alt = 1 ; alt <= altura-1 ; alt++){//alto de la pecera
            for(int anch = 1; anch <= ancho ; anch++){ //anacho de la pecera con los espacios interiores
                if(anch == 1){ //primera X
                    System.out.print("X ");
                } else if (anch==ancho){ //ultima X
                    System.out.print("X");
                } 
                if(posicion == pez){ //si la posicion es igual a la cuenta del random, se imprime el pececito, en este caso al empezar en 0, se va a incrementar hasta que sea el mismo valor para imrpimir o los espacios o el pececito (tiene que hacer alguna de ellas)
                    System.out.print("~ ");
                }else{
                    System.out.print("  ");
                }
                posicion++;
            }
            System.out.println("");

            if(alt==altura-1){
                for(int anch = 1 ; anch<=ancho ; anch++){
                    
                    if(anch == 1){
                        System.out.print("\\  ");
                    } else if(anch == ancho){
                        System.out.print(" /");
                    } else{
                        System.out.print("X ");
                    }
                }
            }
        }
        sc.close();
    }
}

