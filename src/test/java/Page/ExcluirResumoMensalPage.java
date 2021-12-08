package Page;


import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class ExcluirResumoMensalPage {


    private WebDriver driver;
    private WebDriverWait wait;
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
    public void excluirResumoMensal() {

        page.ClicarBotaoResumoMensal();
        page.setMes("Janeiro");
        page.ClicarBotaoBuscarMes();
        List<WebElement> excluirConta = (List<WebElement>) driver.findElements(By.xpath("//*[@id=\"tabelaExtrato\"]/tbody/tr/td/span"));
        for (int i = 0; i < excluirConta.size(); i++) {

            if (excluirConta.equals("Pendente")) {
                page.ClicarBotaoExcluirResumoMensal();
            } else {
                System.err.println("Falhou");
            }
        }
    }

    @After
    public void finallize() {
        //  driver.quit();
    }
}

