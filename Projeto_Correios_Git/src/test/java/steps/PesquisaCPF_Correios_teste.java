package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import navegadores.Navegadores;
import pageObjects.HomePage_Correios;

public class PesquisaCPF_Correios_teste {

	Metodos metodo = new Metodos();
	HomePage_Correios home = new HomePage_Correios();

	@Given("que estou na tela principal do site dos correios")
	public void queEstouNaTelaPrincipalDoSiteDosCorreios() {

		Navegadores.abrirNavegador("https://www.correios.com.br/");

	}

	@Given("digito o endereco no campo busca Busca CEP ou Endereco {string}")
	public void digitoOEnderecoNoCampoBuscaBuscaCEPOuEndereco(String string) {

		metodo.digitar(home.campoBuscarCEP, string);

	}

	@When("clicar no icone buscar")
	public void clicarNoIconeBuscar() {

		metodo.submit(home.campoBuscarCEP);

	}

	@Then("sistema abre nova pagina com dados do endereco pesquisado com o title {string}")
	public void sistemaAbreNovaPaginaComDadosDoEnderecoPesquisadoComOTitle(String title) {

		home.validarTitleCEPPage(title);

	}

	@Then("valido CEP do endereco pesquisado {string}")
	public void validoCEPDoEnderecoPesquisado(String cep) {

		home.validarCEP(cep);
		Navegadores.fecharNavegador();

	}

}
