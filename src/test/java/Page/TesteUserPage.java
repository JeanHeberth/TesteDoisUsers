package Page;

import org.openqa.selenium.WebDriver;

public class TesteUserPage {

    private DSL dsl;

    public TesteUserPage(WebDriver driver) {
        this.dsl = new DSL(driver);
    }

    public TesteUserPage() {
    }

    public void setEmail(String email) {
        dsl.escreve("email", email);
    }

    public void setSenha(String senha) {
        dsl.escreve("senha", senha);
    }

    public void ClicarBotaoEntrar() {
        dsl.clicarElementosUtilizandoXpath("//button[@type='submit']");
    }

    public void ClicarBotaoContas() {
        dsl.clicarElementosUtilizandoLinkText("Contas");
    }

    public void ClicarBotaoCriarMovimentacao() {
        dsl.clicarElementosUtilizandoLinkText("Criar Movimentação");
    }

    public void ClicarBotaoAdicionar() {
        dsl.clicarElementosUtilizandoLinkText("Adicionar");
    }

    public void ClicarBotaoListar() {
        dsl.clicarElementosUtilizandoLinkText("Listar");
    }

    public void setDigitaNomeConta(String nomeConta) {
        dsl.escreve("nome", nomeConta);
    }

    public void ClicarBotaoSalvar() {
        dsl.clicarElementosUtilizandoXpath("//button[@type='submit']");
    }

    public void ClicarBotaoSalvarMovimentacao() {
        dsl.clicarElementosUtilizandoXpath("/html/body/div[2]/form/div[4]/button");
    }

    public void ClicarBotaoResumoMensal() {
        dsl.clicarElementosUtilizandoLinkText("Resumo Mensal");
    }


    public void ClicarBotaoExcluirConta() {
        dsl.clicarElementosUtilizandoXpath("//*[@id='tabelaContas']/tbody/tr/td[2]/a[2]/span");
    }

    public void ClicarBotaoExcluirResumoMensal() {
        dsl.clicarElementosUtilizandoXpath("//*[@id='tabelaExtrato']/tbody/tr[1]/td[6]/a/span");
    }

    public void setTipoMovimentacao(String... escolherMovimentacoes) {
        for (String escolherMovimentacao : escolherMovimentacoes)
            dsl.campoSelecionarDropDown("tipo", escolherMovimentacao);

    }

    public void setMes(String... escolherMeses) {
        for (String escolherMes : escolherMeses)
            dsl.campoSelecionarDropDown("mes", escolherMes);

    }

    public void setTipoConta(String... escolherContas) {
        for (String escolherConta : escolherContas)
            dsl.campoSelecionarDropDown("conta", escolherConta);
    }

    public void setData(String id_campo) {
        dsl.escreve("data_transacao", id_campo);
    }

    public void setDataPagamento(String id_campo) {
        dsl.escreve("data_pagamento", id_campo);

    }

    public void setDescricao(String id_campo) {
        dsl.escreve("descricao", id_campo);

    }

    public void setInteressado(String id_campo) {
        dsl.escreve("interessado", id_campo);

    }

    public void setValor(String id_campo) {
        dsl.escreve("valor", id_campo);

    }

    public void setSituacao() {
        dsl.campoSelecionar("status_pago");
    }


    public void ClicarBotaoBuscarMes() {
        dsl.clicarElementosUtilizandoXpath("/html/body/div[2]/form/input");
    }
}
