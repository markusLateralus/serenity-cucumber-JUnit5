package steps;


import static org.junit.jupiter.api.Assertions.assertTrue;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.PageBuscador;

//import org.junit.jupiter.api.Assertions.*;





//import org.junit.Test;    // para JUnit4
//import static org.junit.Assert.*;


public class BuscarPorPreciosStep{
	
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
	
	
	@Given("yo como usuario estoy logado correctamente")
	public void yo_como_usuario_estoy_logado_correctamente() {
	    // Write code here that turns the phrase above into concrete actions
		 pageBuscador.aceptarCookies();
	}
	@When("realizo una búsqueda de {string} en el buscador")
	public void realizo_una_búsqueda_de_en_el_buscador(String string) {
	    // Write code here that turns the phrase above into concrete actions
		pageBuscador.escribirEnElBuscador(string);
		pageBuscador.hacerClickEnElBuscador();
	}
	@When("elijo el primer objeto de la lista")
	public void elijo_el_primer_objeto_de_la_lista() {
	    // Write code here that turns the phrase above into concrete actions
		pageBuscador.hacerClickPrimerObjetoDeLaLista();
	}
	@Then("compruebo que el precio sea inferior de {double} euros.")
	public void compruebo_que_el_precio_sea_inferior_de_euros(Double double1) {
	    // Write code here that turns the phrase above into concrete actions
		boolean esMenor=pageBuscador.verificarPrecio(double1);
		//Assertions.assertEquals(valorDeseado, valorEsperado);
		assertTrue(esMenor, "debe ser menor");
	}

	

	  @After()
	   public void closeBrowser() {
	      // CapturarPantalla.hacerCapturaPantalla(driver, "error");
	    //  driver.quit();
		  pageBuscador.salir();
		 
	   }

	}
	


