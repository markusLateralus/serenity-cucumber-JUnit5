package steps;



import static org.junit.jupiter.api.Assertions.*;
import herramientas.CapturarPantalla;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.PageIniciarSesion;

public class RealizarLoginStep {
	
	//String password="Tanin01081982";
	//String correo="marcoslateralus@gmail.com";
	String URL="https://amazon.es";
	PageIniciarSesion pageIniciarSesion=new PageIniciarSesion(URL);


	
	@Given("yo como usuario quiero ingresar un correo electrónio válido en el campo {string}")
public void yo_como_usuario_quiero_ingresar_un_correo_electrónio_válido_en_el_campo(String string) {
		 CapturarPantalla.hacerCapturaPantalla(pageIniciarSesion.driver, "ir a logarse");
		pageIniciarSesion.irLogarse();
		   CapturarPantalla.hacerCapturaPantalla(pageIniciarSesion.driver, "rellenar campo email");
		pageIniciarSesion.escribirCorreoElectronico(string);
		
}
@Given("quiero ingresar un password válido en el campo {string}")
public void quiero_ingresar_un_password_válido_en_el_campo(String string) {
	  CapturarPantalla.hacerCapturaPantalla(pageIniciarSesion.driver, "rellenar campo password");
	pageIniciarSesion.escribirPassword(string);
}
@When("se hace click en el boton {string}")
public void se_hace_click_en_el_boton(String string) {
	pageIniciarSesion.iniciarSesion();
	
}

@Then("debe aparecer el mensaje {string}")
public void debe_aparecer_el_mensaje(String string) {
	//Assertions.assertEquals(valorDeseado, valorEsperado);
	  CapturarPantalla.hacerCapturaPantalla(pageIniciarSesion.driver, "leer mensaje Logado correctamente");
	assertEquals(string, pageIniciarSesion.leerMensajeBienvenida());
}
@After()
public void closeBrowser() {

	pageIniciarSesion.salir();
	
}
/*ITestResult resultado
 * 	if(resultado.FAILURE==resultado.getStatus()) {
		 CapturarPantalla.capturaError(pageIniciarSesion.driver, "error");
	}
  */
}

