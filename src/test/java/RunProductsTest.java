import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/products.feature", glue="steps")
public class RunProductsTest extends AbstractTestNGCucumberTests {

}
