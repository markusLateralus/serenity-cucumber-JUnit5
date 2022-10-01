package pageFactory;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageBuscar extends BasePage{
	

	public PageBuscar(String URL) {
	super(URL);
		PageFactory.initElements(this.driver, this);
	}
	

	@FindBy(id="sp-cc-accept")
	WebElement botonCookie;
	//By selectorAceptarCookie=By.id("sp-cc-accept");

	@FindBy(css="#twotabsearchtextbox")
	WebElement buscador;
	//By selectorBuscador=By.cssSelector("#twotabsearchtextbox");
	
	@FindBy(id="nav-search-submit-button")
	WebElement botonBuscar;
	//By selectorBotonBuscar=By.id("nav-search-submit-button");
	
	@FindBy(xpath="//img[@class=\"s-image\"][1]")
	WebElement primerElementoBuscado;
	//By selectorPrimerResultadoBusqueda=By.xpath("(//a[@class=\"a-link-normal s-no-outline\"])[1]");
	
	@FindBy(xpath="//span[@class=\"a-offscreen\"][1]")
	WebElement precioProducto;
	//By selectorPrecioProducto=By.xpath("(//span[@class=\"a-offscreen\"])[1]");
	
@FindBy(xpath="(//span[@class=\"a-size-base\"])[15]")
WebElement marca;
	 
	 public void aceptarCookies() {
		// driver.findElement(selectorAceptarCookie).click();
		 botonCookie.click();
	 }
	 public void escribirEnElBuscador(String string) {
		// WebElement buscador=driver.findElement(selectorBuscador); 
		 buscador.sendKeys(string);
	 }
	 public void hacerClickEnElBuscador() {
		// driver.findElement(selectorBotonBuscar).click();
		 botonBuscar.click();
	 }
	 public void hacerClickPrimerObjetoDeLaLista() {
		//	driver.findElement(selectorPrimerResultadoBusqueda).click();
		 primerElementoBuscado.click();
	 }
	 public WebElement seleccionarObjeto() {
		// WebElement elementoPrecio=driver.findElement(selectorPrecioProducto);
		 
		 return precioProducto;
	 }
	 
	 public boolean verificarPrecio(Double valorDesado) {
			WebElement elementoPrecio=this.seleccionarObjeto();
			String span=elementoPrecio.getAttribute("innerHTML");
			span=span.substring(0,span.length()-1);
			String span3=span.replace(",",".");
			System.out.println(span3);
			Double valorEsperado=Double.parseDouble(span3);
			//Double span2=(double)span1;
			System.out.println("pasado: " + valorEsperado);
			boolean esMenor=false;
			if(valorDesado<valorEsperado) {
				System.out.println("el precio es muy caro");
				esMenor=false;
			}else {
				System.out.println("precio recomendado");
				esMenor=true;
			}
			return esMenor;
	 }
	public boolean comprobarMarca(String string) {
		String marc=marca.getText();
		boolean igual=false;
		if(marc.equals(string)) {
			igual=true;
			return igual;
		}else {
			return igual;
		}
		//return false;
	}
}
