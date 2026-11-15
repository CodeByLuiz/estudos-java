package logica.parouimpar;

import java.util.Scanner;

public class Parouimpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero para saber se ele é par ou impar:");
        int numero = scanner.nextInt();
        int resto = numero%2;

        if (resto == 0){
            System.out.print("Par");
        }else{
            System.out.print("impar");
        }
    }
}
