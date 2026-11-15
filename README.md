# Java —  Consulta para tirar duvidas

## 1. Tipos de variáveis

| Tipo | Para que serve | Exemplo |
|---|---|---|
| `int` | Números inteiros | `int idade = 19;` |
| `double` | Números decimais | `double preco = 10.50;` |
| `float` | Números decimais | `float nota = 8.5f;` |
| `long` | Números inteiros grandes | `long numero = 100000L;` |
| `short` | Números inteiros menores | `short numero = 100;` |
| `byte` | Números inteiros pequenos | `byte numero = 10;` |
| `char` | Um caractere | `char letra = 'A';` |
| `boolean` | Verdadeiro ou falso | `boolean ativo = true;` |
| `String` | Textos | `String nome = "Luiz";` |

**Estrutura de uma variável:**

```java
tipo nomeDaVariavel = valor;
```

## 2. Operadores

### Matemáticos

| Operador | Função |
|---|---|
| `+` | Adição |
| `-` | Subtração |
| `*` | Multiplicação |
| `/` | Divisão |
| `%` | Resto da divisão |
| `++` | Incrementa 1 |
| `--` | Decrementa 1 |

### Comparação

| Operador | Significado |
|---|---|
| `==` | Igual a |
| `!=` | Diferente de |
| `>` | Maior que |
| `<` | Menor que |
| `>=` | Maior ou igual |
| `<=` | Menor ou igual |

### Lógicos

| Operador | Significado |
|---|---|
| `&&` | E: todas as condições precisam ser verdadeiras |
| `\|\|` | OU: pelo menos uma condição verdadeira |
| `!` | NÃO: inverte o resultado |

## 3. Condicionais

### if / else

**Quando usar:** para executar códigos dependendo de uma condição.

**Estrutura:**

```java
if (condicao) {

    // Executa se for verdadeiro

} else {

    // Executa se for falso

}
```

**Exemplo:**

```java
int idade = 19;

if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

### else if

**Quando usar:** quando existem várias condições diferentes para verificar.

**Estrutura:**

```java
if (condicao1) {

    // Código

} else if (condicao2) {

    // Código

} else if (condicao3) {

    // Código

} else {

    // Caso nenhuma condição seja verdadeira

}
```

**Exemplo:**

```java
int nota = 8;

if (nota >= 9) {
    System.out.println("Excelente");
} else if (nota >= 7) {
    System.out.println("Aprovado");
} else if (nota >= 5) {
    System.out.println("Recuperação");
} else {
    System.out.println("Reprovado");
}
```

### switch / case

**Quando usar:** quando uma variável pode assumir diferentes opções ou valores específicos.

**Estrutura:**

```java
switch (variavel) {

    case valor1:
        // Código
        break;

    case valor2:
        // Código
        break;

    case valor3:
        // Código
        break;

    default:
        // Caso nenhum valor corresponda
        break;
}
```

**Exemplo:**

```java
int opcao = 2;

switch (opcao) {

    case 1:
        System.out.println("Cadastrar");
        break;

    case 2:
        System.out.println("Consultar");
        break;

    case 3:
        System.out.println("Excluir");
        break;

    default:
        System.out.println("Opção inválida");
        break;
}
```

`break` encerra o switch. Sem ele, a execução pode continuar nos próximos cases.

## 4. Loops (repetições)

### for

**Quando usar:** quando você sabe quantas vezes deseja repetir algo ou consegue definir um limite.

**Ordem obrigatória:**

```java
for (inicialização; condição; incremento) {

    // Código que será repetido

}
```

| Posição | Função | Exemplo |
|---|---|---|
| 1ª | Inicialização | `int i = 0` |
| 2ª | Condição | `i < 10` |
| 3ª | Incremento | `i++` |

**Exemplo:**

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

Resultado: números de 0 até 9.

**Outros exemplos:**

Contar de 1 até 10:

```java
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

Contar de 10 até 1:

```java
for (int i = 10; i >= 1; i--) {
    System.out.println(i);
}
```

Contar de 0 até 20, pulando de 2 em 2:

```java
for (int i = 0; i <= 20; i += 2) {
    System.out.println(i);
}
```

### while

**Quando usar:** quando deseja repetir enquanto uma condição for verdadeira, sem necessariamente saber quantas repetições serão necessárias.

**Estrutura:**

```java
while (condicao) {

    // Código que será repetido

}
```

**Exemplo:**

```java
int i = 0;

while (i < 5) {
    System.out.println(i);
    i++;
}
```

A variável precisa ser atualizada para que a condição eventualmente se torne falsa, quando esse for o objetivo.

### do while

**Quando usar:** quando precisa executar o código pelo menos uma vez antes de verificar a condição.

**Estrutura:**

```java
do {

    // Código que será executado

} while (condicao);
```

**Exemplo:**

```java
int numero = 0;

do {
    System.out.println(numero);
    numero++;
} while (numero < 5);
```

**Diferença:**

| Estrutura | Quando verifica a condição? |
|---|---|
| `for` | Antes de cada repetição |
| `while` | Antes de cada repetição |
| `do while` | Depois da primeira execução |

### for-each

**Quando usar:** para percorrer todos os elementos de um array ou coleção sem controlar manualmente o índice.

**Estrutura:**

```java
for (tipo elemento : array) {

    // Código

}
```

**Exemplo:**

```java
int[] numeros = {10, 20, 30};

for (int numero : numeros) {
    System.out.println(numero);
}
```

## 5. Controle de loops

| Comando | Função |
|---|---|
| `break` | Interrompe o loop |
| `continue` | Pula a repetição atual |
| `return` | Encerra o método |

**Exemplo de break:**

```java
for (int i = 0; i < 10; i++) {

    if (i == 5) {
        break;
    }

    System.out.println(i);
}
```

## 6. Entrada e saída de dados

### Scanner

**Importação e criação:**

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
```

| Método | O que recebe |
|---|---|
| `nextInt()` | Número inteiro |
| `nextDouble()` | Número decimal |
| `nextFloat()` | Número decimal |
| `nextLong()` | Número inteiro grande |
| `nextBoolean()` | Booleano |
| `next()` | Uma palavra |
| `nextLine()` | Uma linha de texto |

**Exemplo:**

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Digite seu nome: ");
String nome = scanner.nextLine();

System.out.println("Olá, " + nome);

scanner.close();
```

### Exibição

| Comando | Função |
|---|---|
| `System.out.print()` | Exibe sem quebrar linha |
| `System.out.println()` | Exibe e quebra linha |
| `System.out.printf()` | Exibe com formatação |

## 7. Strings

| Método | Função |
|---|---|
| `.equals()` | Compara textos |
| `.equalsIgnoreCase()` | Compara ignorando maiúsculas |
| `.length()` | Retorna o tamanho |
| `.toUpperCase()` | Transforma em maiúsculas |
| `.toLowerCase()` | Transforma em minúsculas |
| `.contains()` | Verifica se contém um texto |
| `.trim()` | Remove espaços das extremidades |
| `.charAt()` | Acessa um caractere pela posição |
| `.substring()` | Extrai parte do texto |

**Exemplo de comparação:**

```java
String nome = "Luiz";

if (nome.equals("Luiz")) {
    System.out.println("Nome correto");
}
```

## 8. Arrays

**Declaração:**

```java
tipo[] nome = {valor1, valor2, valor3};
```

**Exemplo:**

```java
int[] numeros = {10, 20, 30};
```

| Estrutura | Função |
|---|---|
| `numeros[0]` | Acessa o primeiro elemento |
| `numeros[1]` | Acessa o segundo elemento |
| `numeros[0] = 50` | Altera o primeiro elemento |
| `numeros.length` | Retorna a quantidade de elementos |

**Percorrer com for:**

```java
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

## 9. Métodos

**Estrutura geral:**

```java
modificador tipoDeRetorno nomeDoMetodo(parametros) {

    // Código

    return valor;
}
```

Exemplo sem retorno:

```java
public static void saudacao() {
    System.out.println("Olá!");
}
```

Exemplo com retorno:

```java
public static int somar(int a, int b) {
    return a + b;
}
```

| Elemento | Função |
|---|---|
| `public` | Define acesso público |
| `static` | Permite chamar sem criar objeto |
| `void` | Não retorna valor |
| `int` | Define que retorna um inteiro |
| Parâmetros | Informações recebidas pelo método |
| `return` | Devolve um resultado |

## 10. Programação Orientada a Objetos

| Conceito | Função |
|---|---|
| `class` | Cria uma classe |
| `new` | Cria um objeto |
| Atributo | Característica de um objeto |
| Método | Comportamento de um objeto |
| Construtor | Inicializa um objeto |
| `this` | Referencia o objeto atual |
| `private` | Restringe acesso à classe |
| `public` | Permite acesso público |
| `extends` | Herança |
| `implements` | Implementação de interface |
| `interface` | Define um contrato |
| `abstract` | Define classe ou método abstrato |

**Estrutura de uma classe:**

```java
public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println(nome + " tem " + idade + " anos.");
    }

}
```

**Criando um objeto:**

```java
Pessoa pessoa = new Pessoa("Luiz", 19);

pessoa.apresentar();
```

## 11. Tratamento de erros

**Estrutura try / catch / finally:**

```java
try {

    // Código que pode gerar erro

} catch (Exception erro) {

    // Tratamento do erro

} finally {

    // Executa ao final

}
```

| Palavra | Função |
|---|---|
| `try` | Executa código que pode gerar exceção |
| `catch` | Captura e trata a exceção |
| `finally` | Executa ao final, mesmo se ocorrer exceção |
| `throw` | Lança uma exceção |
| `throws` | Declara exceções que um método pode propagar |

## 12. Resumo: qual estrutura usar?

| Situação | O que utilizar |
|---|---|
| Verificar uma condição | `if` |
| Verificar várias condições | `else if` |
| Escolher entre opções específicas | `switch` |
| Repetir uma quantidade definida de vezes | `for` |
| Repetir enquanto uma condição for verdadeira | `while` |
| Executar pelo menos uma vez | `do while` |
| Percorrer um array ou coleção | `for-each` |
| Interromper uma repetição | `break` |
| Pular uma repetição | `continue` |
| Criar uma operação reutilizável | Método |
| Armazenar vários valores | Array |
| Criar uma representação de algo | Classe |
| Tratar erros | `try` e `catch` |

---

**Observação:** os exemplos são modelos de estrutura. Adapte os nomes das variáveis, condições e valores conforme o problema que estiver resolvendo.
