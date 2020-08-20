# Consumindo api dos correios utilizando SOAP
Passos para utilização

1 - Clonar o projeto

2 - Executar o comando mvn clean install.

3 - Executar a aplicação.


O serviço irá subir pela url http://localhost:8080

O único serviço implementado é o baseado no serviço http://ws.correios.com.br/calculador/CalcPrecoPrazo.asmx?op=CalcPrazo.
A implementação foi feita utilizando o HTTP GET e pode ser acessada através de http://localhost:8080/calcPrazo?nCdService=<nCdService>&nCepOrigem=<nCepOrigem>&nCepDestino=<nCepDestino>

Para facilitar encontrar os serviços e testes na api foi adicionar o swagger que pode ser acessado através da url http://localhost:8080/swagger-ui.html