package co.com.practica.doblev.interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Post;

@AllArgsConstructor
public class PostConsumirServicioSinPath implements Interaction {

    private String json;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to("")
                .with(request -> request
                        .relaxedHTTPSValidation()
                        .header("ETIQUETA_APPLICATIONJSON", "APPLICATIONJSON")
                        .body(json)));
    }

    public static PostConsumirServicioSinPath servicio(String json) {
        return new PostConsumirServicioSinPath(json);
    }

}
