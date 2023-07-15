Algoritmo "Exercício em aula 01"


Var
   i, menor, maior: inteiro
   valorProduto: vetor[1..5] de inteiro

Inicio
      menor <- 1
      maior <- 1
      para i de 1 ate 5 faca
           escreva ("O valor do produto: ")
           leia(valorProduto[i])
           se valorProduto[i] > valorProduto[maior] entao
              maior <- i
           fimse
           se valorProduto[i] < valorProduto[menor] entao
              menor <- i
           fimse
      fimpara
      escreval("Produto mais caro: ", valorProduto[maior])
      escreval("Produto mais barato: ", valorProduto[menor])
     
     


Fimalgoritmo