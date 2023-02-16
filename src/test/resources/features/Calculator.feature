#language:pt
Funcionalidade: Calcular operações na calculadora

  Esquema do Cenário: Realizar uma soma
    Dado Que o usuário abra a aplicação
    Quando O usuário fecha a diálogo de mensagem inicial
    Quando O usuário clica no dígito "<Primeiro Número>"
    Quando O usuário clica no botão somar
    Quando O usuário clica no dígito "<Segundo Número>"
    E O usuário clica no botão igual
    Entao A aplicação deve mostrar o resultado da operação "<Resultado>"

    Exemplos:
      | Primeiro Número | Segundo Número | Resultado |
      | 1               | 2              | 3         |

  Esquema do Cenário: Realizar uma subtração
    Dado Que o usuário abra a aplicação
    Quando O usuário fecha a diálogo de mensagem inicial
    Quando O usuário clica no dígito "<Primeiro Número>"
    Quando O usuário clica no botão subtrair
    Quando O usuário clica no dígito "<Segundo Número>"
    E O usuário clica no botão igual
    Entao A aplicação deve mostrar o resultado da operação "<Resultado>"

    Exemplos:
      | Primeiro Número | Segundo Número | Resultado |
      | 9               | 9              | 0         |

  Esquema do Cenário: Realizar uma multiplicação
    Dado Que o usuário abra a aplicação
    Quando O usuário fecha a diálogo de mensagem inicial
    Quando O usuário clica no dígito "<Primeiro Número>"
    Quando O usuário clica no dígito "<Segundo Número>"
    Quando O usuário clica no botão multiplicar
    Quando O usuário clica no dígito "<Terceiro Número>"
    E O usuário clica no botão igual
    Entao A aplicação deve mostrar o resultado da operação "<Resultado>"

    Exemplos:
      | Primeiro Número | Segundo Número | Terceiro Número | Resultado |
      | 1               | 0              | 3               | 30        |

  Esquema do Cenário: Realizar uma divisão
    Dado Que o usuário abra a aplicação
    Quando O usuário fecha a diálogo de mensagem inicial
    Quando O usuário clica no dígito "<Primeiro Número>"
    Quando O usuário clica no dígito "<Segundo Número>"
    Quando O usuário clica no botão dividir
    Quando O usuário clica no dígito "<Terceiro Número>"
    Quando O usuário clica no dígito "<Quarto Número>"
    E O usuário clica no botão igual
    Entao A aplicação deve mostrar o resultado da operação "<Resultado>"

    Exemplos:
      | Primeiro Número | Segundo Número | Terceiro Número | Quarto Número | Resultado |
      | 8               | 1              | 2               | 5             | 3.24      |