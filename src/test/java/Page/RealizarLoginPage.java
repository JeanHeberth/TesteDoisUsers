package Page;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RealizarLoginPage {

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


    }


    @Test
    public void RealizarLoginNaPaginaComPage() {

        page.setEmail("jeanheberth19@gmail.com");
        page.setSenha("JeanHeberth");
        page.ClicarBotaoEntrar();
    }

    @After
    public void finallize() {
        //driver.quit();
    }
}
