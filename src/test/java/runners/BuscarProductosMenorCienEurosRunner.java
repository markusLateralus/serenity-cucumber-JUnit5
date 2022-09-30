package runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		plugin = {"pretty"},
			features="src/test/resources/features/login/RealizarLogin.feature",
//features="src/test/resources/features/buscar_productos/BuscarProductosMenorCienEuros.feature",
glue= "steps"  )
public class BuscarProductosMenorCienEurosRunner {

}
