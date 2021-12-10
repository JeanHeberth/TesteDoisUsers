package Core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Core.DriveFactory.getDriver;

public class DSL {


    public void escreve(String id_campo, String texto) {
        getDriver().findElement(By.id(id_campo)).sendKeys(texto);

    }

    public void clicarElementosUtilizandoXpath(String xpath) {
        getDriver().findElement(By.xpath(xpath)).click();

    }

    public void clicarElementosUtilizandoLinkText(String linkText) {
        getDriver().findElement(By.linkText(linkText)).click();

    }


    public void campoSelecionarDropDown(String id_campoSelecionar, String valor) {
        WebElement dropdown = getDriver().findElement(By.id(id_campoSelecionar));
        Select combo = new Select(dropdown);
        combo.selectByVisibleText(valor);
    }

    public void campoSelecionar(String id_campoSelecionar) {
        getDriver().findElement(By.id(id_campoSelecionar)).click();
    }


}
