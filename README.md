## Projeto Automação de Testes -  SeleniumWebDriver

### Objetivo

O objetivo deste projeto é validar a compra de ingressos pela plataforma https://evento.moblee.com.br/ByKtijSZQ.

### Planejamento/Cenário dos testes

Para este projeto foram desenvolvidos cinco cenários de testes.

TST-001: Adquirir ingresso do tipo ingresso gratuito.
 - Cliente nacional.
 - Pagamento por boleto bancário.

TST-002: Adquirir ingresso do tipo pago nacional.
 - Cliente nacional.
 - Pagamento por boleto bancário.

TST-003: Adquirir ingresso do tipo pago estrangeiro.
 - Cliente estrangeiro.
 - Pagamento por cartão de crédito.

TST-004: Adquirir ingressos do tipo gratuito e pago.
 - Cliente nacional.
 - Pagamento por boleto bancário.

TST-005: Alterar o idioma da página e selecionar um ingresso do tipo gratuito.

Os cenários de testes estão disponíveis no repositório "1_planejamento".
Neste documento é possível realizar os testes seguindo o passo a passo e o resultado esperado.

### Execução dos testes manuais e report

Já no repositório "2_execucao" está disponível as evidência dos testes realizados manualmente.
Há a relação dos cenários de testes criados e seu status final.
Para verificar o report do testes, basta informar o status na tab "Cenário de testes" para que a tab "Report" seja atualizada.
Neste mesmo repositório há os vídeos que mostram a execução dos testes, como forma de evidência.

### Execução dos testes automatizados

Para a automação de testes utilizei o Selenium Webdriver na linguagem Java.

No repositório "3_automacao" está disponível o código fonte da automação. Foram validados os seguintes cenários de testes:

- TST-001: Adquirir ingresso do tipo ingresso gratuito.
- TST-002: Adquirir ingresso do tipo pago nacional.
- TST-003: Adquirir ingresso do tipo pago estrangeiro.

Para executar o projeto de automação é necessário configurar o ambiente seguindo os passos a seguir:

- Instalar o JDK. Para isso, acesse o link http://www.oracle.com/technetwork/java/javase/downloads/index.html e baixe o JDK;
- Instalar o Eclipse.Para isso, acesse http://www.eclipse.org/downloads/ e baixe o Eclipse para a versão compatível com sua máquina;

- Necessário que as dependências (Maven, Junit e SeleniumWebDriver) estejam disponíveis.

- Para o driver do Google Chrome executar no projeto, faz-se necessário criar a seguinte pasta: C:\Drivers (adicionar dentro desta pasta o driver do Google Chrome).

O Driver está disponível no diretório 3_automacao.
