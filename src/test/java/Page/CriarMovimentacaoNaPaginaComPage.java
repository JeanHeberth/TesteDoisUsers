package Page;

import Core.BaseTest;
import org.junit.Before;
import org.junit.Test;

import static Core.DriveFactory.getDriver;

public class CriarMovimentacaoNaPaginaComPage extends BaseTest {

    private TesteUserPage page;

    @Before
    public void inicializa() {


        // Link para abertura da página
        getDriver().get("https://seubarriga.wcaquino.me/logout");

        // Inicializando page
        page = new TesteUserPage();

        page.setEmail("jeanheberth19@gmail.com");
        page.setSenha("JeanHeberth");
        page.ClicarBotaoEntrar();
    }


    @Test
    public void CriarMovimentacaoNaPaginaComPage() {
        page.ClicarBotaoContas();
        page.ClicarBotaoAdicionar();
        page.setDigitaNomeConta("Teste Codsdssm Page");
        page.ClicarBotaoSalvar();
        page.ClicarBotaoCriarMovimentacao();
        page.setTipoMovimentacao("Receita");
        page.setData("03/01/2021");
        page.setDataPagamento("05/01/2021");
        page.setDescricao("Mes de Janeiro");
        page.setInteressado("Jean Heberth Souza Vieira");
        page.setValor("85000.00");
        page.setTipoConta("Teste Codsdssm Page");
        //page.setSituacao();
        page.ClicarBotaoSalvarMovimentacao();


    }

   }
