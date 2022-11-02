/**
 * 7 Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
 * para los 14 partidos y el pleno al quince (15 filas).
 * 
 * @author jotaeme
 */



public class Ejercicio7 {
    public static void main(String[] args) {
        int fila = 15;
        String quiniela = "";
        int numeroquiniela = 0;
        int columna = 3;

        for(int i = 1; i <= fila; i++){
                System.out.printf(" %5d  |", i);
            if(i==15){
                columna = 1;
            }

            for(int b = 1 ; b <= columna ; b++){
                numeroquiniela = (int)(Math.random()*3+1);
                switch (numeroquiniela) {
                    case 1:
                        System.out.print("1  |");
                    break;
                    case 2:
                    System.out.print("x  |");
                    break;
                    case 3:
                    System.out.print("2  |");
                    break;
                }
            }

            System.out.println("");
        }
    }
}
