package stepsDefinitions;

import static org.junit.Assert.assertEquals;

import java.awt.peer.LabelPeer;
import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.pt.E;
import org.junit.rules.TestRule;
import org.junit.validator.PublicClassValidator;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.jv.Nalika;
import cucumber.runtime.Utils;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.en.Given;
import pageObjects.Home;
import static utils.Utils.*;

public class HomeSteps {
	
	Home lp = new Home();


	@Dado("que estou na tela principal")
	public void verificarTela(){
		acessarSistema();
	}

	@Quando("clico no icone da lupa")
	public void acionarLupa() {
		Na(Home.class).acionarBotaoLupa();
	}

	@Entao("devera ser exibida o campo de pesquisa")
	public void validarCampoPesquisa() {
		Na(Home.class).validarCampoPesquisar();
	}

	@E("digito o valor {string}")
	public void inputCampoPesquisar(String pesquisa){
		Na(Home.class).inputCampoPesquisa(pesquisa);
	}

	@E("clico em Pesquisar")
	public void acionarPesquisar(){
		Na(Home.class).acionarBotaoPesquisar();
	}

	@Entao("devera ser exibida itens do assunto informado")
	public void validarItensPesquisa(){
		Na(Home.class).validarItensPesquisa();
	}

}
