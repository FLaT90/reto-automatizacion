package co.com.choucair.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class PaginaUtest extends PageObject {

public static final Target BOTON_JOIN = Target.the("Boton para iniciar el registro de usuario")
        .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
