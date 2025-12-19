package conteudo.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        /*
        tipos de variavel
        int = numero grande
        float = numero decimal menos preciso
        double = numero decimal preciso
        byte = numeros de -128 a 127
        short = numeros de -32768 a -32767
        long = numero grande pra cacete
        boolean = verdadeiro ou falso
        char = um caractere só
        * */

        int dinheiro = 100;
        byte idade = 18;
        float salario = 799.99f;
        boolean verdade = true;
        char sexo = 'M'; // da pra usar o codigo do caracter tb

//println pula linha quando é escrito e print só vai juntando tudo e o printf usa quando for formatar pique filtrar para um numero decimal ter só duas casas decimais
        System.out.println("Seu dinheiro é: "+dinheiro+"reais");
        System.out.println("vc ganhou seu salario vai ser depositado "+salario+" de reais");
        System.out.println("Vc tem "+idade+ "anos");
        System.out.println("seu sexo é:"+sexo);
        System.out.println("tudo isso é "+verdade);

        String mensagem = "Bom dia"; // string armazena textos




    }
}
