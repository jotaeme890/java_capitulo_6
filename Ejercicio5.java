/**
 * 5 Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números. 
 * 
 * @author jotaeme
 */



public class Ejercicio5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++){
            int numeros = (int)(Math.random()*100+100);
            System.out.println(numeros);
        }
    }
}