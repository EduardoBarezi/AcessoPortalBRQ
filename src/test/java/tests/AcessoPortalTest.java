package tests;

import static org.junit.Assert.*;

import com.sun.prism.impl.BufferUtil;
import jdk.nashorn.internal.objects.ArrayBufferView;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AcessoPortalTest {
        @Test
        public void testAcessarOPortalBRQ(){

            // Abrindo o navegador Chrome
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\eduardobarezi\\IdeaProjects\\chromedriver.exe");
            WebDriver navegador = new ChromeDriver();
            navegador.manage().window().maximize();
            
            // Navegando para a pagina do Portal BRQ
            navegador.get("https://portal.brq.com/");

            // Clicar no campo de imput Usuario
            //navegador.findElement(By.id("txtUsuario")).click();
            
            // Digitar no campo de Usuario "eduardobarezi"
            navegador.findElement(By.id("txtUsuario")).sendKeys("eduardobarezi");

            // Digitar no campo Senha "Duuh@2407"
            navegador.findElement(By.id("txtSenha")).sendKeys("Duuh@2407");

            // Clicar no botão "Entrar"
            navegador.findElement(By.id("btnEntrar")).click();


        }


}
