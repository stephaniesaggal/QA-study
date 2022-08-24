package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao() {
        driver.get("https://www.qazando.com.br/curso.html");
        Assert.assertEquals("não acessou a aplicação", true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed())
    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor jss = (JavascriptExecutor) driver;
        jss.executorScript("window.scrollTo(0, 10000)");
        //para dar uma pausa de 2s
        Thread.sleep(2000);
    }

    public void preencheEmail() {
        driver.findElement(By.id("email")).sendKeys("teste@test.com.br");
    }

    public void cliqueGanharDesconto() {
        driver.findElement(By.id("button")).click();
    }

    public void verificarCupomDesconto() {
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText()
        Assert.assertEquals("QAZANDO15OFF", texto_cupom)
    }
}
