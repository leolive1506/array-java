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
