package br.com.codebyluiz.estudos.fundamentos;

public class repetição {
    public static void main(String[] args) {

        //  while
        int contadorWhile = 1;
        while (contadorWhile <= 5) {
            System.out.println("while: " + contadorWhile);
            contadorWhile++;
        }

        //  do-while
        int contadorDoWhile = 1;
        do {
            System.out.println("do-while: " + contadorDoWhile);
            contadorDoWhile++;
        } while (contadorDoWhile <= 5);

        //  for
        for (int i = 0; i <= 5; i++) {

            if(i > 3) {
                break; // assim que chegar no 3 ele sai do loop
            }
            System.out.println("for: " + i);



            //desafio : descobrir em quantas vezes posso parcelar algo mas a parcela tem que ser mais de 1000
            int valor = 50000;


            int resultadoParcela = 0 ;
            for ( i = 2; i <= valor; i++){

                resultadoParcela = valor/i;
                if (resultadoParcela >= 1000) {
                    System.out.println("numero de parcelas " + i + " valor das parcelas: " + resultadoParcela);
                }else if(resultadoParcela < 1000){break;}

            };

        }

    }
}
