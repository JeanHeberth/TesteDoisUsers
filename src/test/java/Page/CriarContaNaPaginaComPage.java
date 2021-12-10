package Page;

import Core.BaseTest;
import org.junit.Before;
import org.junit.Test;

import static Core.DriveFactory.getDriver;

public class CriarContaNaPaginaComPage extends BaseTest {

    private TesteUserPage page;

    @Before
    public void inicializa() {
        // Link para abertura da página
        getDriver().get("https://seubarriga.wcaquino.me/logout");

        // Inicializando page
        page = new TesteUserPage();

    }


    @Test
    public void CriarContaNaPaginaComPage() {

        page.setEmail("jeanheberth19@gmail.com");
        page.setSenha("JeanHeberth");
        page.ClicarBotaoEntrar();
        page.ClicarBotaoContas();
        page.ClicarBotaoAdicionar();
        page.setDigitaNomeConta("Teste Com Page");
        page.ClicarBotaoSalvar();
        page.ClicarBotaoExcluirConta();


    }
}
