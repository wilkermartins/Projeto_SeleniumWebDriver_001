package pages;

import core.BasePage;

public class CompraPage extends BasePage {

	public void setNome(String nome) {
		texto("name", nome);

	}

	public void setCredencial(String credencial) {
		texto("credentialName", credencial);

	}

	public void setNumeroIdentidade(String identidade) {
		escreverPorSpan("Número de identidade", identidade);
	}

	public void setNomeCracha(String nome) {
		texto("text", nome);
	}

	public void setEmail(String email) {
		texto("email", email);
	}

	public void setTelefone(String telefone) {
		texto("phone", telefone);
	}

	public void setArea(String area) {
		clicarBotaoPorContains("Tecnologia");
	}

	public void setAreaV(String area) {
		clicarBotaoPorContains("Vendas");
	}

	public void setCPF(String cpf) {
		texto("cpf", cpf);
	}

	public void setCpfCnpj(String CpfCnpj) {
		escreverCpFCnpj(CpfCnpj);
	}

	public void setIdetidade(String identidade) {
		escreverIdentidade(identidade);
	}

	public void setEmailP(String email) {
		escreverEmail(email);
	}

	public void setBoletoBancario() {
		clicarBotaoPorContains("Boleto bancário");
	}

	public void setContinuarCompra() {
		clicarBotaoPorSpan("Continuar");
	}

	public void setVoltar() {
		clicarBotaoPorContains("Voltar para o site");
	}

	public void setCep(String cep) {
		texto("postalCode", cep);
	}

	public void setCidade(String cidade) {
		texto("city", cidade);
	}

	public void setEstado(String estado) {
		texto("state", estado);
	}

	public void setPais(String id, String pais) {
		selecionarCombo("countryCode", "Estados Unidos");
	}

	public void setNumero(String numero) {
		texto("number", numero);
	}

	public void setComplemento(String complementoE) {
		texto("line1", complementoE);
	}

	public void setComplementoN(String complementoN) {
		texto("line2", complementoN);
	}

	public void setCartaoCredito(String cardnumber) {
		texto("cardnumber", cardnumber);
	}

	public void setCodigoVerificador(String cvc) {
		texto("cvc", cvc);
	}

	public void setDataValidade(String date) {
		texto("exp-date", date);
	}

	public void setNomeImpresso(String nomeImpresso) {
		texto("ccname", nomeImpresso);
	}

	public void setFinalizarCompra() {
		clicarBotaoPorSpan("Finalizar compra");
	}

	public String obterMensagemSucesso_001() {
		return obterTextoValidacao("//span[contains(text(),'Seus ingressos estão garantidos')]");

		// *[@id='root']/div/span/div/div[2]/section/div/h3/span
	}

	public String obterMensagemSucesso_002() {
		return obterTextoValidacao("//span[contains(text(),'Seus ingressos estão reservados até o pagamento')]");
		// *[@id=\"root\"]/div/span/div/div[2]/section/div/h3/span
	}

	public String obterMensagemSucesso_003() {
		return obterTextoValidacao("//span[contains(text(),'Pagamento não realizado')]");
		// *[@id="root"]/div/span/div/div[2]/section/div/form/div[2]/p/span

		// *[@id=\"root\"]/div/span/div/div[2]/section/div/form/div[2]/p/span

	}

}
