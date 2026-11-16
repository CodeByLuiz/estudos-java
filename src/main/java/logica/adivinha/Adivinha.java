package logica.adivinha;

import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean certo = false;
        int escolha = random.nextInt(100);
        int palpite = 0;
        System.out.println("escolhi um numero tente adivinhar.");
        while (certo==false){
            System.out.println("qual seu palpite?");
            palpite = scanner.nextInt();

            if(palpite==escolha){
                System.out.println("acertou!!");
                certo = true;
            } else if (palpite > escolha) {
                System.out.println("o seu palpite é maior que o numero escolhido");
            }else {
                System.out.println("o palpite é menor que o numero escolhido");
            }
        }
    }
}
