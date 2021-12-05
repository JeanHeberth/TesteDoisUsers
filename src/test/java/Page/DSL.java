package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {

    private WebDriver driver;

    public DSL(WebDriver driver) {
        this.driver = driver;
    }

    public void escreve(String id_campo, String texto) {
        driver.findElement(By.id(id_campo)).sendKeys(texto);

    }

    public void clicarElementosUtilizandoXpath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();

    }

    public void clicarElementosUtilizandoLinkText(String linkText) {
        driver.findElement(By.linkText(linkText)).click();

    }


    public void campoSelecionarDropDown(String id_campoSelecionar, String valor) {
        WebElement dropdown = driver.findElement(By.id(id_campoSelecionar));
        Select combo = new Select(dropdown);
        combo.selectByVisibleText(valor);
    }

    public void campoSelecionar(String id_campoSelecionar) {
        driver.findElement(By.id(id_campoSelecionar)).click();
    }


}
