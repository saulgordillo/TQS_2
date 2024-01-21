import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/addCart.feature", glue="steps")
public class RunAddCartTest extends AbstractTestNGCucumberTests {

}
