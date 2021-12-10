package Page;

import Core.BaseTest;
import org.junit.Before;
import org.junit.Test;

import static Core.DriveFactory.getDriver;

public class RealizarLoginPage extends BaseTest {

    private TesteUserPage page;

    @Before
    public void inicializa() {

        // Link para abertura da página
        getDriver().get("https://seubarriga.wcaquino.me/logout");

        // Inicializando page
        page = new TesteUserPage();

    }


    @Test
    public void RealizarLoginNaPaginaComPage() {

        page.setEmail("jeanheberth19@gmail.com");
        page.setSenha("JeanHeberth");
        page.ClicarBotaoEntrar();
    }


}
