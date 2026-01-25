package br.com.codebyluiz.estudos.fundamentos;

public class condicionais {
    public static void main(String[] args) {

        int idade = 18;
        int nota = 7;
        int diaSemana = 3;

        //  if
        if (idade >= 18) { // se for acontece
            System.out.println("Você é maior de idade.");
        }

        //  if - else
        if (nota >= 6) { // se nao for um e outro
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        //  if - else if - else
        if (nota >= 9) {
            System.out.println("Excelente!"); // aqui é se o cara tira 9 ou 10
        } else if (nota >= 7) {
            System.out.println("Bom!"); // se nao for vem pra ca e assim por diante
        } else if (nota >= 6) {
            System.out.println("Regular.");
        } else {
            System.out.println("Insuficiente.");
        }

        //  switch
        switch (diaSemana) { // caso seja tal numero acontece tal coisa
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
        }
    }
}
