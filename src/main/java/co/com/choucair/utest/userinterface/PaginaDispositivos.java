package co.com.choucair.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDispositivos {

    public static final Target CONTENEDOR_COMPUTADOR = Target.the("Contenedor para computador")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div"));
    public static final Target COMPUTADOR = Target.the("Campos para computador")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/input[1]"));
    public static final Target CONTENEDOR_VERSION = Target.the("Contenedor para version del computador")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div"));
    public static final Target VERSION = Target.the("Campos para version del computador")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/input[1]"));
    public static final Target CONTENEDOR_LENGUAJE = Target.the("Contenedor para lenguaje del computador")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div"));
    public static final Target LENGUAJE = Target.the("Campos para el lenguaje del computador")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/input[1]"));
    public static final Target CONTENEDOR_DISPOSITIVO_MOVIL = Target.the("Contenedor para dispositivo movil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div"));
    public static final Target DISPOSITIVO_MOVIL = Target.the("Campos para dispositivo movil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));
    public static final Target CONTENEDOR_MODELO_DISPOSITIVO_MOVIL = Target.the("Contenedor para modelo de dispositivo movil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div"));
    public static final Target MODELO_DISPOSITIVO_MOVIL = Target.the("Campos para modelo de dispositivo movil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));
    public static final Target CONTENEDOR_SO_DISPOSITIVO_MOVIL = Target.the("Contenedor para sistema de dispositivo movil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div"));
    public static final Target SO_DISPOSITIVO_MOVIL = Target.the("Campos para sistema operativo dispositivo movil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));

    public static final Target BOTON_PASO_FINAL = Target.the("Boton para ir a seccion final")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
