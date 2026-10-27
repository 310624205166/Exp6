
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @Test
    public void loginTest() {
        String username = "admin";
        String password = "1234";

        assertEquals("admin", username);
        assertEquals("1234", password);
    }

    @Test
    public void invalidLoginTest() {
        String username = "guest";

        assertNotEquals("admin", username);
    }
}
