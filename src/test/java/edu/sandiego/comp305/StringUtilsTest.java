package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StringUtilsTest {
    @Test
    void testReverseString() {
        assertEquals("cba", StringUtils.reverseString("abc"));
        assertEquals("", StringUtils.reverseString(""));
        assertNull(StringUtils.reverseString(null));
    }
}

