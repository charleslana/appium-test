#language:pt
Funcionalidade: Converter tipos na calculadora

  Esquema do Cenário: Converter hora em segundos
    Dado Que o usuário abra a aplicação
    Quando O usuário fecha a diálogo de mensagem inicial
    Quando O usuário clica no menu converter
    Quando O usuário clica no menu time
    Quando O usuário seleciona o primeiro tipo de tempo
    Quando O usuário seleciona o segundo tipo de tempo
    Quando O usuário clica no dígito "<Número>"
    Entao A aplicação deve mostrar no resultado da conversão "<Resultado>"

    Exemplos:
      | Número |  | Resultado |
      | 1      |  | 3,600     |