Algoritmo "Pratica 07 - Calculadora"

Var
   opcao : inteiro
   n1, n2 : real


Inicio

      escreva("Digite o primeiro número: ")
      leia(n1)
      escreva("Digite o segundo número: ")
      leia(n2)
      
      escreval("*****************************")
      escreval("Escolha a operação matemática:")
      escreval("*****************************")
      escreval("Digite 1 para soma")
      escreval("Digite 2 para subtração")
      escreval("Digite 3 para multiplicação")
      escreval("Digite 4 para divisão")
      escreval("*****************************")
      leia(opcao)



      escolha(opcao)
        caso 1
             escreval("O resultado de ", n1, " + ", n2, " = ", n1+n2)
        caso 2
             escreval("O resultado de ", n1, " - ", n2, " = ", n1-n2)
        caso 3
             escreval("O resultado de ", n1, " * ", n2, " = ", n1*n2)
        caso 4
             escreval("O resultado de ", n1, " / ", n2, " = ", n1/n2)
        outrocaso
             escreval("Opção inválida")
        fimescolha


Fimalgoritmo