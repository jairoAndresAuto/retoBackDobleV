package co.com.practica.doblev.stepdefinitions;

import co.com.practica.doblev.questions.ValidarCodigo;
import co.com.practica.doblev.questions.ValidarRespuestaVacia;
import co.com.practica.doblev.tasks.ObtenerProductoId;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ConsultarProductoIdStepDefinition {

    @Cuando("Se procede a consultar por el id {int}")
    public void seProcedeAConsultarPorElId(int id) {
        theActorInTheSpotlight().attemptsTo(ObtenerProductoId.con(String.valueOf(id)));
    }

    @Entonces("Podemos observar el codigo {int} con respuesta vacia")
    public void podemosObservarElCodigoConRespuestaVacia(int codigo) {
        theActorInTheSpotlight().should(
                seeThat(ValidarCodigo.delServicio(codigo)),
                seeThat(ValidarRespuestaVacia.respuesta()));
    }
}
