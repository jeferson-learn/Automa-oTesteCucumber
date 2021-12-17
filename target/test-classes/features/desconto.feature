# language: pt

  @desconto
  Funcionalidade: Receber o cupom desconto da Qazando
    Eu como usuário da Qazando
    quero receber um cupom de desconto
    para comprar um curso com valor reduzido

    @gerar_cupom
    Cenário: Visualizar código de desconto
      Dado que estou no site da Qazando
      Quando eu preencho no site da Qazando
      E clico em ganhar cupom
      Então o eu vejo o código de desconto

    @teste_falha
    Cenário: Teste com falha
      Dado que tenho cupom gerado
      Quando eu falho