$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("desconto.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Receber o cupom desconto da Qazando",
  "description": "Eu como usuário da Qazando\r\nquero receber um cupom de desconto\r\npara comprar um curso com valor reduzido",
  "id": "receber-o-cupom-desconto-da-qazando",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@desconto"
    }
  ]
});
formatter.scenario({
  "line": 10,
  "name": "Visualizar código de desconto",
  "description": "",
  "id": "receber-o-cupom-desconto-da-qazando;visualizar-código-de-desconto",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 9,
      "name": "@gerar_cupom"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "que estou no site da Qazando",
  "keyword": "Dado "
});
formatter.step({
  "line": 12,
  "name": "eu preencho no site da Qazando",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "clico em ganhar cupom",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "o eu vejo o código de desconto",
  "keyword": "Então "
});
formatter.match({
  "location": "DescontosStep.acessar_site_Qazando()"
});
formatter.result({
  "duration": 6608770500,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.eu_preencho_no_site_da_Qazando()"
});
formatter.result({
  "duration": 115770300,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.clico_em_ganhar_cupom()"
});
formatter.result({
  "duration": 23900,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});