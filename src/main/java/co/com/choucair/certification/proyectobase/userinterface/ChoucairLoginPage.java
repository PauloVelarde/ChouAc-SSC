package co.com.choucair.certification.proyectobase.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ChoucairLoginPage  {

    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.id("yui_3_17_2_1_1627138216997_27"));
    public static final Target INPUT_USER = Target.the("write usarname").located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("write password ").located(By.id("password"));
    public static final Target ENTER_BUTTON= Target.the("button to confirm login").located(By.id("yui_3_17_2_1_1627138216997_26"));
}
