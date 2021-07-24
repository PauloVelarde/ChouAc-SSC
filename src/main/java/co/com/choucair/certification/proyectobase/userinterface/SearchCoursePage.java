package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_UC = Target.the("Select University Choucair").located(By.xpath("//div[@id='universidad'//strong]"));
    public static final Target INPUT_COURSE = Target.the("Search the course").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("click for the course").located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("click for the course").located(By.xpath("//h4[contains(text(),'Recursos Automatizacion Colombia')]"));

    public static final Target NAME_COURSE = Target.the("extract the course name").located(By.xpath("//h1[contains(text(),'Recursos de Automatizacion')]"));
}
