package co.com.practica.doblev.tasks;

import co.com.practica.doblev.interactions.PostConsumirServicioSinPath;
import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.Locale;

import static co.com.practica.doblev.util.Constantes.*;

@AllArgsConstructor
public class CrearProducto implements Task {

    private String precio;

    @Override
    public <T extends Actor> void performAs(T actor) {
        Faker faker = new Faker(new Locale(ESPANIOL));
        String titulo = faker.book().title();
        String descripcion = faker.company().name();
        String imagen = faker.animal().name();
        String categoria = faker.artist().name();
        String jsonSeteado = String.format(JSON, titulo, precio, descripcion, imagen, categoria);
        actor.attemptsTo(PostConsumirServicioSinPath.servicio(jsonSeteado));
    }

    public static CrearProducto nuevoCon(String precio) {
        return Tasks.instrumented(CrearProducto.class, precio);
    }
}
