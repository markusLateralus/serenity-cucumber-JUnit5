package runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		plugin = {"pretty"},
		features="src/test/resources/features/login/RealizarLogin.feature", //ok
		//features="src/test/resources/features/login/borrar/Buscar.feature", // FALSE
		//	features="src/test/resources/features/mal/loginIncorrecto.feature",  FASLE
       // features="src/test/resources/features/buscar/buscarPorPrecios.feature",
		//	features="src/test/resources/features/buscar/BuscarProductosMenorCienEuros.feature",
glue= "steps"  )
public class RealizarLoginRunner {

}
