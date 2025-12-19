package conteudo.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        //estruturas de repetição

        int number1 = 10;
        int number2 = 15;
        int number = number2;
        if(number%2 == 0){
System.out.println("o numero "+number+" é par");

        }else{
            System.out.println("o numero "+number+" não é par");
        }


        if(number1%2 == 0){
            System.out.println("o numero "+number1+" é par");

        }else if(number2%2 != 0){
            System.out.println("o numero "+number2+" não é par");
            // esse só funciona se o de cima nao for verdade
        }else{
//else nao tem condição se tudo der errado ele funciona
            System.out.println("isso só aparece se os de cima forrem false");
        }


        //ternarios
        // tal coisa = (condição) ? se for verdade : se não for;    <-- esse e o jeito de usar ternario
        String par = "é par";
        String impar ="é impar";
        String resultado = (number%2==0) ? par : impar;
System.out.println(resultado);


//tabela da verdade se vc usar && como condição tanto uma condição quanro a outra tem que ser verdade para o if ser true
        //se usar || ou uma condição ou outra precissa ser verdade nao precisa ser as duas



        //switch evita estruturas gigantes de if e else
        int dia = 3;
        switch (dia){
        case 1:
                 System.out.println("é segunda");
                 break;
            case 2:
                System.out.println("é terça");
                 break;
            case 3:
                System.out.println("é quarta");
                break;

        }

        int diaUtil = 5;
        if(diaUtil >= 1 || diaUtil <= 7){
            System.out.println("é dia util");
        }else{
            System.out.println("fim de semana");
        }

    }
}
