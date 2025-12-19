package conteudo.introducao;

public class Aula04OperadoresAritmeticos {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;

        int resultadosoma = numero1+numero2;
        int resultadomultiplicacao = numero1*numero2;

        System.out.println("o resultado da soma "+numero1+"+"+numero2+"é igual a "+resultadosoma);
        System.out.println("o resultado da multiplicação de "+numero1+"*"+numero2+" é igual a "+resultadomultiplicacao);
// o + apartir de uma string ele concatena antes de ter uma string ele soma


        //resto de divisão é %
        double resto = (double) numero2 / numero1; // aqui to forçando o numeros int virarem double
        System.out.println("o resto é "+resto);

        // maior e menor etc < > <= >= == =!
        boolean teste = 10>20;
        boolean teste2 = 10 == 10 && 10>2;
        boolean teste3 = teste || teste2; //teste e falso e teste 2 e true então teste 3 e real
        System.out.println(teste);
        System.out.println(teste2);
        System.out.println(teste3);



        //operadores de atribuição
        int number = 10;
        System.out.println(number);
        number += 10;
        System.out.println(number);
        number -= 5;
        System.out.println(number);
        number *= 10;
        System.out.println(number);
        number /= 2;
        System.out.println(number);
        number %=5;
        System.out.println(number);
        number++;
        System.out.println(number);
        number--;
        System.out.println(number);


    }
}
