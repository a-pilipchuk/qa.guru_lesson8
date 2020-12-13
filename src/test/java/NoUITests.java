import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("no_UI_tests")
public class NoUITests {
    static final String X = "abc";
    static final String Y = "def";
    @Test
    void positiveTest() {
        assertEquals("abcdef", X + Y, "X+Y should be 'abcdef'");
    }

    @Test
    void negativeTest() {
        assertEquals("defabc", X+Y, "Y+X should be 'defabc', not 'abcdef'");
    }
}
