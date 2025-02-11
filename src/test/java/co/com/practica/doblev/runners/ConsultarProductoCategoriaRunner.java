package co.com.practica.doblev.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/IntegracionBackEnd/obtener_producto_categoria.feature"
        , glue = "co.com.practica.doblev.stepdefinitions"
        , snippets = CAMELCASE)
public class ConsultarProductoCategoriaRunner {
}
