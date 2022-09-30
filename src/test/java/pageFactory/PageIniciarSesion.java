package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageIniciarSesion extends BasePage{

	public PageIniciarSesion(String URL) {
		super(URL);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(this.driver, this);
	}
	

	@FindBy(xpath="(//a[@class=\"nav-a nav-a-2   nav-progressive-attribute\"])[1]")
	WebElement enlaceIrLogarse;
	@FindBy(name="email")
	WebElement campoCorreoElectronico;
	
	@FindBy(id="continue")
	WebElement botonContinuar;
	
	@FindBy(name="password")
	WebElement campoPassword;
	
	@FindBy(id="signInSubmit")
	WebElement botonIniciarSesion;
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement spanMensaje;
	
	
public void irLogarse() {
	enlaceIrLogarse.click();
}
	public void escribirCorreoElectronico(String email) {
		campoCorreoElectronico.clear();
		campoCorreoElectronico.sendKeys(email);
		botonContinuar.click();
	}
	
	public void escribirPassword(String pass) {
		campoPassword.clear();
		campoPassword.sendKeys(pass);
		//botonIniciarSesion.click();
	}
	
	public void iniciarSesion() {
		botonIniciarSesion.click();
	}
	
public String leerMensajeBienvenida() {
		
		return spanMensaje.getText();
	}
}
