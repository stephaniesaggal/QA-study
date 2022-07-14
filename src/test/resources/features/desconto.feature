# language: pt

    Funcionalidade: Receber desconto da qazando
        eu como usuário da qazando
        quero receber um cupom de desconto
        para comprar um curso com valor reduzido

        Cenário: Vizualizar código de desconto
            Dado que estou no site da qazando
            Quando eu preencho meu e-mail
            E clico em ganhar cupom
            Então eu vejo o código de desconto