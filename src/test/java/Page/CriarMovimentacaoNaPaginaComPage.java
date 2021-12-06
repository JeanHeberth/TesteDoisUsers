package Page;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CriarMovimentacaoNaPaginaComPage {

    private WebDriver driver;
    private DSL dsl;
    private TesteUserPage page;

    @Before
    public void inicializa() {

        //Drive do google
        System.setProperty("webdriver.chrome.driver", "D:\\Documentos\\Desenvolvimentos TestesAutomatizados\\DriversTestes\\chromedriver.exe");
        driver = new ChromeDriver();

        //Drive do firefox
        System.setProperty("webdriver.gecko.driver", "D:\\Documentos\\Desenvolvimentos TestesAutomatizados\\DriversTestes\\geckodriver.exe");
        // driver = new FirefoxDriver();

        // Link para abertura da página
        driver.get("https://seubarriga.wcaquino.me/logout");

        // Comando para maximar a tela do navegador.
        driver.manage().window().maximize();

        // Inicializando a DSL
        dsl = new DSL(driver);

        // Inicializando page
        page = new TesteUserPage(driver);

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
        page.setTipoConta("Teste Com Page");
        page.setSituacao();
        page.ClicarBotaoSalvarMovimentacao();


    }

    @After
    public void finallize() {
        driver.quit();
    }
}
