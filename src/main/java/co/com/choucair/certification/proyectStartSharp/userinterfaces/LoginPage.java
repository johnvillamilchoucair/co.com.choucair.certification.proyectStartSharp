package co.com.choucair.certification.proyectStartSharp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public LoginPage() {}

    public static final Target INPUT_USERNAME = Target.the("Input to enter the username").
            located(By.id("LoginPanel0_Username"));

    public static final Target INPUT_PASSWORD = Target.the("Input to enter the password").
            located(By.id("LoginPanel0_Password"));

    public static final Target BTN_SUBMIT = Target.the("Button to log in on the page").
            located(By.id("LoginPanel0_LoginButton"));
}
