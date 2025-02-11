package co.com.practica.doblev.stepdefinitions;

import co.com.practica.doblev.tasks.CrearProducto;
import io.cucumber.java.es.Cuando;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearProductoStepDefinition {


    @Cuando("Se procede a crear el producto")
    public void seProcedeACrearElProducto(List<Map<String, String>> precio) {
        theActorInTheSpotlight().attemptsTo(CrearProducto.nuevoCon(precio.get(0).get("precio")));
    }

}
