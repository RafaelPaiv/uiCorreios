#Author: rafaelaugustopaiva@gmail.com

@Positivos
Feature: Busca por Endereco ou CEP 
  Como usuario
  Quero pesquisar um endereco ou CEP no site
  Para varificar o CEP de um endereco 
  
  
  
 Background: Acessar pagina inicial do site dos Correios
 Given que estou na tela principal do site dos correios
  

  @CT01
  Scenario Outline: Buscar CEP
    And digito o endereco no campo busca Busca CEP ou Endereco <Endereco>
    When clicar no icone buscar
    Then sistema abre nova pagina com dados do endereco pesquisado com o title <Title>
    And valido CEP do endereco pesquisado <CEP>


    Examples: 
      |                         Endereco                       |          Title          |          CEP          | 
      |   "2ª Travessa Santo Antonio São Caetano Itabuna/BA"   |       "Busca CEP"       |      "45607-148"      |
		