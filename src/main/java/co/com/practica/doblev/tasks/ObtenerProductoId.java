package co.com.practica.doblev.tasks;

import co.com.practica.doblev.interactions.GetConsumoConPath;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

@AllArgsConstructor
public class ObtenerProductoId implements Task {

    private String id;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(GetConsumoConPath.servicio(id));
    }

    public static ObtenerProductoId con(String id) {
        return Tasks.instrumented(ObtenerProductoId.class,id);
    }
}
