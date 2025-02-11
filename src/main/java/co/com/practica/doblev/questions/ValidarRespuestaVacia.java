package co.com.practica.doblev.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class ValidarRespuestaVacia implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return SerenityRest.lastResponse().prettyPrint().isEmpty();
    }

    public static ValidarRespuestaVacia respuesta() {
        return new ValidarRespuestaVacia();
    }
}
