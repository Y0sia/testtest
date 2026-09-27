package org.example.reverse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseTest {
    private Reverse reverse = new Reverse();

    @Test
    public void reverse_shouldReverseString_ifContainsString() {
        String result = reverse.reverse("Hello");
        Assertions.assertEquals("olleH", result);
    }

    @Test
    public void reverse_shouldReturnEmptyString_ifContainsNull() {
        String result = reverse.reverse(null);
        Assertions.assertEquals("", result);
    }
}
