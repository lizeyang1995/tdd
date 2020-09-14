import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MommifierTest {

    @Test
    void should_return_exception_when_convert_given_a_null() {
        Mommifier mommifier = new Mommifier();
        assertThrows(IllegalArgumentException.class, () -> mommifier.convert(null));
    }

    @Test
    void should_return_original_string_when_vowel_characters_in_the_given_string_are_less_than_or_equal_to_percent_30() {
        Mommifier mommifier = new Mommifier();
        String result = mommifier.convert("try");
        assertEquals("try", result);
    }
}
