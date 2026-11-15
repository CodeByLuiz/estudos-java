package logica.calculadora;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        float numeroum = 0;
        float numerodois = 0;
        short escolha = 0;
        float resultado = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Faça sua escolha pelo numero dela:" +
                "Soma - 1" +
                "Subtrair - 2" +
                "Multiplicar - 3" +
                "Divisão - 4");
        escolha = scanner.nextShort();

        if (escolha != 0){
            System.out.println("qual seu primeiro numero?");
            numeroum = scanner.nextFloat();
            System.out.println("qual seu segundo numero?");
            numerodois = scanner.nextFloat();
        }


        switch (escolha){
            case 1:
                resultado = numerodois+numeroum;
                System.out.println("o resultado é");
                System.out.println(resultado);
                break;
            case 2:
                resultado = numeroum - numerodois;
                System.out.println("o resultado é");
                System.out.println(resultado);
                break;
            case 3:
                resultado = numeroum + numerodois;
                System.out.println("o resultado é");
                System.out.print(resultado);
                break;
            case 4:
                resultado = numeroum - numerodois;
                System.out.println("o resultado é");
                System.out.print(resultado);
                break;
        }


}

}
