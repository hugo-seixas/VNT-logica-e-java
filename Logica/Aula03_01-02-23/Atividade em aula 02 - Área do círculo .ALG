Algoritmo "Atividade em aula 02 - �rea do c�rculo"

Var
   area, raio : real

Inicio

      escreva("Informe o valor do raio: ")
      leia (raio)

      se ( raio > 0) entao
           area <- PI * raio^2
           escreval("A �rea do c�rculo �: ", area:2:2)
      senao
           escreval("O valor do raio deve ser positivo")
      fimse

Fimalgoritmo