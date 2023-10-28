# Desalocação de memória
- garbage collector
  - automatiza o *gerenciamento* de memória (heap) de um programa em execução
  - monitora os objetos (heap), desalocando os que não estão sendo mais utilizados (não tem ninguem referenciando ele no stack)
- Desalocação por scopo
  - após sair do escopo, as variaveis são desalocadas deixando de existir

# Vetor
- arranjos (array) unidimensionais
- alocada de uma vez só em um bloco contíguo de memória

## Vantagens
- acesso imediato aos elementos pela sua posição

## Desvantagens
- tamanho fixo
- dificuldade para inserção e deleção

# Boxing
- conversão de um objeto tipo valor para objeto tipo referência compativel
```java
int x = 20;
Object obj = x;
```
# Unboxing
- conversão de um objeto tipo referência para objeto tipo valor compativel
- inverso boxing
```java
int x = 20;
Object obj = x;

int y = (int) obj;
```

# Wrapper classes
- classes equivalentes ao tipo primitivo
  - boolean -> Boolean
- indicado uso pois aceita valor nulo

# Listas
- inicia vazia e os elementos são alocados sob demanda (diferente do vetor)
- tipo (interface): List
- desvatangem
  - acesso sequencial aos elementos
    - isso pode ser otimizado
- não aceita passar tipos primitivos como parametro

# Matrizes
- vetores em linhas e colunas (x, y)
  - y são os items dentro da linha x
    - vetor de vetores

```java
[
  [],
  [],
  [],
]
```