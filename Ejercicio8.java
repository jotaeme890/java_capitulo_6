/**
 * 8 Modifica el programa anterior para que la probabilidad de que salga un 1 sea
 * de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
 * 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 * 
 * @author jotaeme
 */



public class Ejercicio8 {
    public static void main(String[] args) {
        int fila = 15;
        int numeroquiniela = 0;
        int columna = 3;

        for(int i = 1; i <= fila; i++){
                System.out.printf(" %5d  |", i);
            if(i==15){
                columna = 1;
            }

            for(int b = 1 ; b <= columna ; b++){
                numeroquiniela = (int)(Math.random()*6+1);
                switch (numeroquiniela) {
                    case 1:
                    case 2:
                    case 3:
                        System.out.print(" 1 |");
                    break;
                    case 4:
                    case 5:
                        System.out.print(" x |");
                    break;
                    case 6:
                        System.out.print(" 2 |");
                    break;
                }
            }

            System.out.println("");
        }
    }
}
