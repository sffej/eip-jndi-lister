/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import com.js.jndi.BindLister;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        BindLister classUnderTest = new BindLister();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
