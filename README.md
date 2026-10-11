# Exercício 1073 – Quadrado de Pares | Java

## 📌 Descrição

Este projeto resolve o exercício **1073 – Quadrado de Pares**, da plataforma [Beecrowd](https://judge.beecrowd.com/pt/problems/view/1073).

O programa recebe um número inteiro positivo `N` e apresenta o quadrado de todos os números pares entre 1 e `N`, incluindo o próprio `N`, caso seja par.

## 🛠️ Tecnologias utilizadas

- Java
- Scanner para entrada de dados
- Estrutura de repetição `while`
- Estrutura condicional `if`
- Operador módulo `%`
- Operadores aritméticos

## 💻 Código-fonte

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 1, n, par;

        n = scanner.nextInt();

        while (i <= n) {
            if (i % 2 == 0) {
                par = i * i;
                System.out.println(i + "^2 = " + par);
            }
            i++;
        }
    }
}
```

## 🧠 Lógica do programa

1. O programa recebe um número inteiro `n`.
2. Inicializa a variável `i` com o valor 1.
3. Utiliza um `while` para percorrer os números de 1 até `n`.
4. A condição `i % 2 == 0` verifica se o número é par.
5. Quando encontra um número par, calcula seu quadrado utilizando `i * i`.
6. Exibe o número e seu respectivo quadrado.
7. Incrementa `i` até finalizar a repetição.

## 📥 Exemplo de entrada

```text
6
```

## 📤 Exemplo de saída

```text
2^2 = 4
4^2 = 16
6^2 = 36
```

## 🔎 Explicação do exemplo

| Número | É par? | Quadrado |
|---|---|---|
| 1 | Não | — |
| 2 | Sim | 4 |
| 3 | Não | — |
| 4 | Sim | 16 |
| 5 | Não | — |
| 6 | Sim | 36 |

O programa apresenta apenas os números pares e seus respectivos quadrados.

## 📚 Conceitos praticados

- Entrada de dados utilizando `Scanner`
- Estrutura de repetição `while`
- Estrutura condicional `if`
- Verificação de números pares com `%`
- Cálculos aritméticos
- Incremento de variáveis
- Formatação de saída com `System.out.println()`

## 🎯 Objetivo

Praticar estruturas de repetição e condições em Java, identificando números pares dentro de um intervalo e realizando cálculos matemáticos com eles.

---

**Plataforma:** Beecrowd  
**Problema:** 1073 – Quadrado de Pares  
**Linguagem:** Java
