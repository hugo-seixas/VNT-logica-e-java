Algoritmo "Pratica 07 - Calculadora"

Var
   opcao : inteiro
   n1, n2 : real


Inicio

      escreva("Digite o primeiro n�mero: ")
      leia(n1)
      escreva("Digite o segundo n�mero: ")
      leia(n2)
      
      escreval("*****************************")
      escreval("Escolha a opera��o matem�tica:")
      escreval("*****************************")
      escreval("Digite 1 para soma")
      escreval("Digite 2 para subtra��o")
      escreval("Digite 3 para multiplica��o")
      escreval("Digite 4 para divis�o")
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
             escreval("Op��o inv�lida")
        fimescolha


Fimalgoritmo