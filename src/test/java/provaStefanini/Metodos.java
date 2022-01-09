package provaStefanini;

import org.openqa.selenium.By;

public class Metodos extends Browser {

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("erro ao clicar" + e.getMessage());
			System.err.println("causa do erro" + e.getCause());

		}
	}

	public void escrever(By elemento, String text) {
		try {
			driver.findElement(elemento).sendKeys(text);
		} catch (Exception e) {
			System.err.println("erro ao escrever" + e.getMessage());
			System.err.println("causa do erro" + e.getCause());

		}
	}
}