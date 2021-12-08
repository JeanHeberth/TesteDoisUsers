package Page;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TesteJh {
    private WebDriver driver;
    private DSL dsl;
    public WebDriverWait wait;

    @Before
    public void inicializa() {

        //Drive do google
        System.setProperty("webdriver.chrome.driver", "D:\\Documentos\\Desenvolvimentos TestesAutomatizados\\DriversTestes\\chromedriver.exe");
        driver = new ChromeDriver();

        //Drive do firefox
        System.setProperty("webdriver.gecko.driver", "D:\\Documentos\\Desenvolvimentos TestesAutomatizados\\DriversTestes\\geckodriver.exe");
        // driver = new FirefoxDriver();

        // Link para abertura da página
        driver.get("http://automationpractice.com/index.php");

        // Comando para maximar a tela do navegador.
        driver.manage().window().maximize();

        // Inicializando a DSL
        dsl = new DSL(driver);

        // Inicializando page
        // page = new TesteUserPage(driver);
    }
    @Test
    public void clicarAddCart(){
        driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]")).click();

    }

    @Test
    public void TestAdicionaApenasUmProdutoNoCarrinho() {
        List<WebElement> produtos = driver.findElements(By.cssSelector("#homefeatured li h5 a"));
        for (int i = 0; i < produtos.size(); i++) {
            String nomes = produtos.get(i).getText();
            System.out.println(nomes);
            if (nomes.contains("Faded Short Sleeve T-shirts")) {
                driver.findElements(By.cssSelector("#homefeatured li a.ajax_add_to_cart_button span")).get(i).click();
                break;
            }
        }

    }

    @Test
    public void TestAdicionaVariosProdutosNoCarrinho() {
        String[] produtosParaAdicionar = {"Faded Short Sleeve T-shirts", "Blouse"};
        List<WebElement> produtos = driver.findElements(By.cssSelector("#homefeatured li h5 a"));
        for (int i = 0; i < produtos.size(); i++) {
            String nomes = produtos.get(i).getText();
            List produtosParaAdicionarListar = Arrays.asList(produtosParaAdicionar);
            if (produtosParaAdicionarListar.contains(nomes)) {
                driver.findElements(By.cssSelector("#homefeatured li a.ajax_add_to_cart_button span")).get(i).click();
                wait = new WebDriverWait(driver, 20);
                WebElement btnContinuarComprando = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span"));
                wait.until(ExpectedConditions.visibilityOf(btnContinuarComprando));
                btnContinuarComprando.click();
            }
        }
    }
}
