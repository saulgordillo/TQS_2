import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/placeOrder.feature", glue="steps")
public class RunPlaceOrderTest extends AbstractTestNGCucumberTests {

}
