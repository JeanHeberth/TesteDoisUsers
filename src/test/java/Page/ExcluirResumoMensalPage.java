package Page;

import Core.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Core.DriveFactory.getDriver;


public class ExcluirResumoMensalPage extends BaseTest {


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
    public void excluirResumoMensal() {

        page.ClicarBotaoResumoMensal();
        page.setMes("Janeiro");
        page.ClicarBotaoBuscarMes();
        List<WebElement> excluirConta = (List<WebElement>) getDriver().findElements(By.xpath("//*[@id=\"tabelaExtrato\"]/tbody/tr/td/span"));
        for (int i = 0; i < excluirConta.size(); i++) {

            if (excluirConta.equals("Pendente")) {
                page.ClicarBotaoExcluirResumoMensal();
            } else {
                System.err.println("Falhou");
            }
        }
    }




}

