#language: pt
#enconding: UTF-8

@BlogAgi
Funcionalidade: Pesquisa

  Cenario: Validar campo de Pesquisa
    Dado que estou na tela principal
    Quando clico no icone da lupa
    Entao devera ser exibida o campo de pesquisa


  Cenario: Realizar Pesquisa
    Dado que estou na tela principal
    Quando clico no icone da lupa
    E digito o valor "CDI"
    E clico em Pesquisar
    Entao devera ser exibida itens do assunto informado

