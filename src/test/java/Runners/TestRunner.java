package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


        features = { 
        		 "src/test/java/feature/CheckBox.feature",
       		     "src/test/java/feature/AddElements.feature",

//       		     "src/test/java/feature/BrokenImage.feature",
        		 "src/test/java/feature/DragAndDrop.feature",
        		 "src/test/java/feature/ContextMenu.feature",
        		 "src/test/java/feature/DynamicContent.feature",
        		  "src/test/java/feature/DisappearElement.feature",
        		"src/test/java/feature/Dropdown.feature",
        		"src/test/java/feature/DynamicLoading.feature"

        		},

        glue = {"StepDef"},
        plugin = {
                "pretty",
                "html:target/cucumber-html-report.html" ,
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        //adding comments
        monochrome = true
)

public class TestRunner {
}
