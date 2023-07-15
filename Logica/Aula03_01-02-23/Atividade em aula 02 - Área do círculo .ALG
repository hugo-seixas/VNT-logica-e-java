Algoritmo "Atividade em aula 02 - Área do círculo"

Var
   area, raio : real

Inicio

      escreva("Informe o valor do raio: ")
      leia (raio)

      se ( raio > 0) entao
           area <- PI * raio^2
           escreval("A área do círculo é: ", area:2:2)
      senao
           escreval("O valor do raio deve ser positivo")
      fimse

Fimalgoritmo