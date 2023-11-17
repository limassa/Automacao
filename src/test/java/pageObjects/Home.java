package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import java.awt.List;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.google.common.base.Converter;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import io.cucumber.java.pt.Quando;
import net.bytebuddy.asm.Advice.This;	
	
import org.openqa.selenium.support.ui.Wait;
import sun.reflect.misc.FieldUtil;

import javax.xml.xpath.XPath;
import java.io.File;
import java.io.IOException;


public class Home {

	@FindBy(id = "search-open")
	private WebElement botaolupa;

	@FindBy(className = "search-field" )
	private WebElement campoPesquisar;

	public void acionarBotaoLupa(){
		botaolupa.click();
	}

	public void acionarBotaoPesquisar(){
		campoPesquisar.click();
	}

	public void validarCampoPesquisar() {
		String textoCampoPesquisa = driver.findElement(By.className("search-field")).getText();
	}

	public void inputCampoPesquisa(String pesquisa) {
		campoPesquisar.sendKeys(pesquisa);
	}

	public void validarItensPesquisa(){
		String textoRetornoPesquisa = driver.findElement(By.xpath("//*[@id='primary']/header/h1")).getText();
		assertEquals("Resultados da busca por:", textoRetornoPesquisa);
	}
}
