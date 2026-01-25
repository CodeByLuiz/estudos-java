package br.com.codebyluiz.estudos.fundamentos;

public class variaveis {
    public static void main(String[] args) {

    int idade = 18;// 4 bytes
    double salarioDouble = 2000;// maior de todos --- 8 bytes
    float salarioFloat = 2500; // grande pra cacete só que menor que o double --- 4bytes
    byte idadeByte = 18; //de -128 a 127 --- 1 byte
    short idadeShort = 18; // de -32768 a 32767 --- 2 bytes
    boolean deMaior = true; // verdadeiro ou falso --- 1 bit
    char sexo = 'M'; //armazena um caractere só ---- 2 bytes  ---- por padrão é falso
    String nome = "Luiz";
    String mensagem = "meu nome é " + nome + "tenho " + idade + "anos, meu sexo é" + sexo + "e ganho isso de salario "+ salarioDouble;
    System.out.println(mensagem);




    }

}
