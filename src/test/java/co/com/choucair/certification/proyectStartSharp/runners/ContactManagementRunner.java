package co.com.choucair.certification.proyectStartSharp.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/contact_management.feature",
        //tags = "@Stories1",
        glue = "co.com.choucair.certification.proyectStartSharp.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE )

public class ContactManagementRunner {}
