package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageInicio extends BasePage{

	public PageInicio(String URL) {
		super(URL);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(this.driver, this);
	}
	/*
	public PageInicio() {
		
	}
*/
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement spanMensaje;
	
	public String leerMensajeBienvenida() {
		
		return spanMensaje.getText();
	}
	//obtener url actual
	public String getURL() {
		return this.driver.getCurrentUrl();
	}
	

}
