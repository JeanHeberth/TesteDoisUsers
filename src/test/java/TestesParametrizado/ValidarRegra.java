package TestesParametrizado;

import Core.BasePage;
import Page.TesteUserPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static Core.DriveFactory.getDriver;

public class ValidarRegra extends BasePage {

    private TesteUserPage page;
    private By tipoMovimentacoes;


    @Before
    public void inicializa() {
        // Link para abertura da página
        getDriver().get("https://seubarriga.wcaquino.me/logout");

        // Inicializando page
        page = new TesteUserPage();

        //
        tipoMovimentacoes = By.id("tipo");


    }


    @Test
    public void CriarMovimentacaoNaPaginaComPage() {


        page.ClicarBotaoContas();
        page.ClicarBotaoAdicionar();
        page.setDigitaNomeConta("Agora vai despesa");
        page.ClicarBotaoSalvar();
        page.ClicarBotaoCriarMovimentacao();
        page.setTipoMovimentacao("Despesa");
        page.setData("03/01/2021");
        page.setDataPagamento("05/01/2021");
        page.setDescricao("Despesa");
        page.setInteressado("Jean Heberth Souza Vieira");
        page.setValor("85000.00");
        page.setTipoConta("Agora vai despesa");
        if (tipoMovimentacoes.equals("Receita")) {
            page.setSituacao("status_pago");
        } else {
            page.setSituacao("status_pendente");
        }
        page.ClicarBotaoSalvarMovimentacao();


    }

}
