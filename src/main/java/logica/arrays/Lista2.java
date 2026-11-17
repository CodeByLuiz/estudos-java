package logica.arrays;

import java.util.Scanner;

public class Lista2 {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        Scanner scanner = new Scanner(System.in);

        for (int i= 0;i<=4;i++){
            System.out.println("escreva um nome para ser armazenado");
            nomes[i]=scanner.toString();

            if (i==4){
                for (int e = 0;i<=4;i++){
                    System.out.println("Esses foram os nomes armazenados:");
                    System.out.println(nomes[e]);
                }//nao acabei ainda isso
            }

        };

    }
}
