package pageObjects;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;

import metodos.Metodos;

public class HomePage_Correios extends Metodos {

	// Elementos

	public By campoBuscarCEP = By.xpath("//input[@id='relaxation']");
	public By logradouro = By.xpath("//td[@data-th='Logradouro/Nome']");
	public By bairro = By.xpath("//td[@data-th='Bairro/Distrito']");
	public By uf = By.xpath("//td[@data-th='Localidade/UF']");
	public By cep = By.xpath("//td[@data-th='CEP']");

	// Metodos


	public void validarTitleCEPPage(String titleEsperado) {

		String janelaPrincipal = driver.getWindowHandle();
		Set<String> janelasAbertas = driver.getWindowHandles();

		for (String janela : janelasAbertas) {

			if (!janela.equals(janelaPrincipal)) {

				driver.switchTo().window(janela);

				String titleCapturado = driver.getTitle();
				assertEquals(titleEsperado, titleCapturado);

			}

		}

	}
	
	public void validarCEP(String cepEsperado) {

		String cepSite = driver.findElement(cep).getText();
		assertEquals(cepEsperado, cepSite);

		driver.close();

	}

}
