package co.com.practica.doblev.stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.io.IOException;

public class Hook {

    @Before
    public static void setTheStage() throws IOException {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("Calidad");
    }

}
