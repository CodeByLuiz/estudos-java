package br.com.codebyluiz.estudos.fundamentos;

public class operadores {
    public static void main(String[] args) {

// Aritmeticos : (+ - / *)

        int numeroum = 10;
        double numerodois = 5.5;
        double resultado = numerodois * numeroum;

        System.out.println("Valor " + ( numerodois + numeroum) + " reais");
        System.out.println((int)resultado);//força a ser um int

//relacionais : % resto

int resto = numeroum%2;

System.out.println("o resto é" + resto);

//logicos < > <= >= == != retorna valor boleano
boolean isMaior = numerodois > numeroum ;
boolean isIgual = numerodois == numeroum;
boolean isMenor = numerodois < numeroum;
boolean isDiferente = numerodois != numeroum;

        System.out.println(isMaior);
        System.out.println(isIgual);
        System.out.println(isDiferente);
        System.out.println(isMenor);

        // && (and) || (our)
        int idade = 60;
        boolean saudavel = true;
        boolean isVelhoSaudavel = idade >= 60 && saudavel== true;

        System.out.println("esse idoso é saudavel? " + isVelhoSaudavel);

        boolean isSujo = true;
        boolean isFedido = false;
        boolean isTomarBanho = isSujo || isFedido;

        System.out.println("precisa tomar banho? " + isTomarBanho);

        // atribuição = += -= *= /= %=
        // (--) tira um (++)coloca um

int numeroteste = 5;
        System.out.println(numeroteste);
      numeroteste -= 1;
        System.out.println(numeroteste);
        numeroteste += 5;
        System.out.println(numeroteste);
        numeroteste *= 2;
        System.out.println(numeroteste);
        numeroteste /= 2;
        System.out.println(numeroteste);
        numeroteste %= 9;
        System.out.println(numeroteste);
    }
}
