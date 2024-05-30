package co.com.choucair.certification.proyectStartSharp.runners;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/demo.feature",
        tags = "@tag1",
        glue = " co.com.choucair.certificacion.proyectobase.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE )

public class RunnerSP {
}
