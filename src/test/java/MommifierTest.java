import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MommifierTest {

    @Test
    void should_return_exception_when_convert_given_a_null() {
        Mommifier mommifier = new Mommifier();
        assertThrows(IllegalArgumentException.class, () -> {mommifier.convert(null);});
    }
}
