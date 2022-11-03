/**
 * 25 Escribe un programa que muestre por pantalla 100 números enteros separados
 * por un espacio. Los números deben estar generados de forma aleatoria en
 * un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
 * almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
 * 
 * @author jotaeme
 */



public class Ejercicio25 {
    public static void main(String[] args) {
        int cont = 0;

        do {
            int numnum = (int)(Math.random()*191+10);
            cont++;
            if(numnum%2==0){
                System.out.print(numnum + " ");
            } else if(numnum%3==0){
                System.out.print(numnum + " ");
            } else if (numnum%5==0){
                System.out.print(numnum + " ");
            }
            else 
                System.out.print("#" + numnum + "# ");
        } while (cont<=100);
    }
}
