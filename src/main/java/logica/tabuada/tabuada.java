package logica.tabuada;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("quer a tabuada de que numero?");
        short n = scanner.nextShort();

        for (short i = 0;i<11;i++){
            int resultado = n * i;
            System.out.println(resultado);

        };
    }
}
