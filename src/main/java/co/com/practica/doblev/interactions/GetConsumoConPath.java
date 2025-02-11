package co.com.practica.doblev.interactions;

import io.restassured.specification.RequestSpecification;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.RestInteraction;



@AllArgsConstructor
public class GetConsumoConPath extends RestInteraction {

    private String path;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(path)
                .with(RequestSpecification::relaxedHTTPSValidation));
    }

    public static GetConsumoConPath servicio(String path) {
        return new GetConsumoConPath(path);
    }
}
