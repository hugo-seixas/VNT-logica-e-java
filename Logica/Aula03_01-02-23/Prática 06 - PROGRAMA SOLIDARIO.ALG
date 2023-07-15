Algoritmo "Prática 06 - PROGRAMA SOLIDARIO"

Var

   opcao : inteiro
   valor : real

Inicio

    escreval("Digite 1 para doar R$ 10")
    escreval("Digite 2 para doar R$ 25")
    escreval("Digite 3 para doar R$ 50")
    escreval("Digite 4 para doar outros valores")
    escreval("Digite 5 para cancelar")
    leia (opcao)
    
    escolha opcao
       caso 1
            escreval("O valor doado foi de R$ 10. Obrigado!")
       caso 2
            escreval("O valor doado foi de R$ 25. Obrigado!")
       caso 3
            escreval("O valor doado foi de R$ 50. Obrigado!")
       caso 4
            escreva("Digite o valor a ser doado: ")
            leia(valor)
            escreval("O valor doado foi de R$ ",valor, ". Obrigado!")
       caso 5
            escreval("Cancelado")
       outrocaso
            escreval("Opção inválida")
    fimescolha


Fimalgoritmo