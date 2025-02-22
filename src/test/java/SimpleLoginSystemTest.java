import com.test.rmit.UserService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleLoginSystemTest {

    @Test
    public void testValidLogin() {
        UserService userService = new UserService();
        assertTrue(userService.login("admin", "password123"));
    }

    @Test
    public void testInvalidPassword() {
        UserService userService = new UserService();
        assertFalse(userService.login("admin", "wrongpassword"));
    }

    @Test
    public void testInvalidUsername() {
        UserService userService = new UserService();
        assertFalse(userService.login("unknownUser", "password123"));
    }

    @Test
    public void testEmptyCredentials() {
        UserService userService = new UserService();
        assertFalse(userService.login("", ""));
    }
}
