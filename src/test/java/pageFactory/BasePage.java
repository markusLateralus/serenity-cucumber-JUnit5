package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

public  WebDriver driver;

public BasePage(String URL) {
	this.driver=this.inicializarNavegador(URL);
}
public BasePage() {
	
}

public WebDriver inicializarNavegador(String string) {
	//OnStage.setTheStage(new OnlineCast());
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(string);
	return driver;
	

}
	
public void salir() {
	driver.quit();
}

	/*
	//creamos la instancia de Chrome
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		this.driver=new ChromeDriver();
		this.driver.manage().window().maximize();
		return this.driver;
	}
	
	//devuelve el elemento segun el objeto By localizador que le pongamos por parámetros
	public WebElement findElement(By localizador) {
		return this.driver.findElement(localizador);
	}
	
	
	//devuelve una LISTA de elementos
	public List <WebElement> findElements(By localizador){
	    List<WebElement> lista=this.driver.findElements(localizador);
	    return lista;
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
	
	public String getText(By localizador) {
		return this.driver.findElement(localizador).getText();
	}
	
	public void escribirInput(String texto, By localizador) {
		this.driver.findElement(localizador).sendKeys(texto);
		}
	
	public void click(By localizador) {
		this.driver.findElement(localizador).click();
	}
	
	//nos dice si el elemnto está diponible
	public boolean isDisplayed(By localizador) {
		try {
			return this.driver.findElement(localizador).isDisplayed();
		}catch(NoSuchElementException e) {
			return false;
		}
	}
	
	public String getTitle() {
		return this.driver.getTitle();
	}
	
	public void salir() {
		driver.quit();
	}
	*/
}
