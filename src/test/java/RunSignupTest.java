import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/signup.feature", glue="steps")
public class RunSignupTest extends AbstractTestNGCucumberTests {

}
