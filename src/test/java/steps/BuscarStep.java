package steps;

import static org.junit.jupiter.api.Assertions.*;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.PageBuscador;

//import org.junit.jupiter.api.Assertions.*;






//import org.junit.Test;    // para JUnit4
//import static org.junit.Assert.*;


public class BuscarStep{
	
	/*
	 * enum
	 * public enum Estado {A,B,C}
	 * @Given("yo soy (.*)
	 * public void yosoy(Estado estado){}
	 * */
	
	
	/* paso pendiente:
	 *   throw new PendingException("Aún no ha terminado");
	 * */

	String URL="https://www.amazon.es";
	//PageBuscador pageBuscador;
	PageBuscador pageBuscador=new PageBuscador(URL);
/*	
	@Before
	public void setup() {
      pageBuscador=new PageBuscador(URL);
	}*/



	////////////////////////
	@Given("yo como usuario de Amazon")
	public void yo_como_usuario_de_amazon() {
	    // Write code here that turns the phrase above into concrete actions
		 pageBuscador.aceptarCookies();
	}
	@When("realizo una búsqueda de {string}")
	public void realizo_una_búsqueda_de(String string) {
	    // Write code here that turns the phrase above into concrete actions
		pageBuscador.escribirEnElBuscador(string);
		pageBuscador.hacerClickEnElBuscador();
	}
	@When("elijo el primer objeto")
	public void elijo_el_primer_objeto() {
	    // Write code here that turns the phrase above into concrete actions
		pageBuscador.hacerClickPrimerObjetoDeLaLista();
	}
	@Then("compruebo que el marca sea {string}")
	public void compruebo_que_el_marca_sea(String string) {
	    // Write code here that turns the phrase above into concrete actions
		  boolean resultado=pageBuscador.comprobarMarca(string);
			 assertTrue(resultado, "deben coincidir las marcas");
	}
	
	  @After()
	   public void closeBrowser() {
	      // CapturarPantalla.hacerCapturaPantalla(driver, "error");
	    //  driver.quit();
		  pageBuscador.salir();
		 
	   }

	}
	


