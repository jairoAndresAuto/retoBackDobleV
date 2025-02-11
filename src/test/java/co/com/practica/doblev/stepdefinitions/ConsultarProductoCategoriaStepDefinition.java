package co.com.practica.doblev.stepdefinitions;

import co.com.practica.doblev.questions.ValidarCodigo;
import co.com.practica.doblev.tasks.ObtenerProductoCategoria;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.com.practica.doblev.util.Constantes.URI;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultarProductoCategoriaStepDefinition {

    @Dado("Procede a realizar el llamado del servicio de productos")
    public void procedeARealizarElLlamadoDelServicioDeProductos() {
        theActorInTheSpotlight().can(CallAnApi.at(URI));
    }

    @Cuando("Se procede a consultar la categoria {string}")
    public void seProcedeAConsultarLaCategoria(String categoria) {
        theActorInTheSpotlight().attemptsTo(ObtenerProductoCategoria.con(categoria));
    }

    @Entonces("Podemos observar el codigo {int}")
    public void podemosObservarElCodigo(Integer codigo) {
        theActorInTheSpotlight().should(seeThat(ValidarCodigo.delServicio(codigo)));
    }

    @Entonces("Podemos observar el codigo {int} y adicional el json vacio")
    public void podemosObservarElCodigoYAdicionalElJsonVacio(int codigo) {
        theActorInTheSpotlight().should(
                seeThat(ValidarCodigo.delServicio(codigo)));
    }

}
