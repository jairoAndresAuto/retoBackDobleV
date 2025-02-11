package co.com.practica.doblev.tasks;

import co.com.practica.doblev.interactions.GetConsumoConPath;
import lombok.AllArgsConstructor;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.practica.doblev.util.Constantes.PATH_CATEGORIA;

@AllArgsConstructor
public class ObtenerProductoCategoria implements Task {

    private String categoria;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String path = String.format(PATH_CATEGORIA, categoria);
        actor.attemptsTo(GetConsumoConPath.servicio(path));
    }

    public static ObtenerProductoCategoria con(String categoria) {
        return Tasks.instrumented(ObtenerProductoCategoria.class, categoria);
    }
}
