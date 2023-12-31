package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import drivers.Drivers;

public class Metodos extends Drivers {

	public void digitar(By elemento, String texto) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void clicar(By elemento) {

		driver.findElement(elemento).click();

	}

	public void validarTexto(By elemento, String textoEsperado) {

		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, textoCapturado);

	}

	public void validarTitle(String titleEsperado) {

		String titleCapturado = driver.getTitle();
		assertEquals(titleEsperado, titleCapturado);

	}

	public void submit(By elemento) {

		driver.findElement(elemento).submit();

	}

}
