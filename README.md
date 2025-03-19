# Lista de exercícios utilizando recursividade.

- O método a seguir, executa o cálculo do MDC (máximo divisor comum) de dois inteiros positivos m e n. Escreva um método recursivo equivalente.
```java
public static int CalculaMDC(int m, int n){
  int r;
  do {
    r = m%n;
    m = n;
    n = r;
  } while (r != 0);
  return m;
}
```

- Desenvolva um programa em java que calcule o fatorial de um número x.

- Escreva em java um método recursivo que receba um número inteiro na base decimal e realize a conversão deste número para base binária.

  
- Faça um programa em java fazendo uso da recursividade que solicite para o
usuário digitar um número, em seguida, faça a soma de todos os algarismos do
número. Exemplos:

  1981 = 1 + 9 + 8 + 1

  2020 = 2 + 0 + 2 + 0
  
- Escreva uma função recursiva que imprima todos os números inteiros de 1
até n, onde n é um número inteiro positivo fornecido como entrada.

- Escreva uma função recursiva que imprima uma contagem regressiva a
partir de um número inteiro positivo fornecido como entrada.

- Escreva uma função recursiva que determine se uma string é um
palíndromo. A função deve ignorar espaços e diferenças entre maiúsculas e
minúsculas.

- Crie uma função recursiva que calcule a soma dos primeiros N números
naturais.

- Escreva um método recursivo que calcule a potência de um número, ou seja, dado dois números inteiros base e expoente, retorne base^expoente sem usar operadores de multiplicação direta.

- Desenvolva um método recursivo para calcular o número de Fibonacci de índice N.

- Escreva um método recursivo que inverta uma string.

- Crie uma função recursiva que calcule a soma dos elementos de um array de inteiros.

- Escreva um método recursivo que determine quantas vezes um determinado caractere aparece em uma string.

- Implemente uma função recursiva que encontre o maior elemento dentro de um array de inteiros.

- Escreva um método recursivo para calcular o mínimo múltiplo comum (MMC) de dois números inteiros positivos.

## Desafio

Torre De Hanoi

Objetivo: consiste em deslocar todos os discos da haste onde se encontram para uma haste diferente, respeitando as seguintes regras:

1. deslocar um disco de cada vez, o qual deverá ser o do topo de uma das três hastes;

2. cada disco nunca poderá ser colocado sobre outro de diâmetro mais pequeno.

Para nosso desafio, são dados um conjunto de n discos com diferentes tamanhos e três bases A, B e C.

O problema consiste em imprimir os passos necessários para transferir os discos da base A para a base C, usando a base B como auxiliar, nunca colocando discos maiores sobre menores.

Segue os passos para solução

  1º passo: Mover de A para C.
  
  2º passo: Mover de A para B.
  
  3º passo: Mover de C para B.
  
  4º passo: Mover de A para C.
  
  5º passo: Mover de B para A.
  
  6º passo: Mover de B para C.
  
  7º passo: Mover de A para C.
