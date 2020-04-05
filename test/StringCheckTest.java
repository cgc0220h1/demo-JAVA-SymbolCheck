import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCheckTest {
    StringCheck stringCheck;

    @DisplayName("Kiểm tra tính hợp lệ của dấu ngoặc đầy đủ TH1")
    @Test
    void testIsValidBracketCase1() {
        String stringToCheck = "s * (s – a) * (s – b) * (s – c)";
        stringCheck = new StringCheck(stringToCheck);
        assertTrue(stringCheck.isValidString());
    }

    @DisplayName("Kiểm tra tính hợp lệ của dấu ngoặc đầy đủ TH2")
    @Test
    void testIsValidBracketCase2() {
        String stringToCheck = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        stringCheck = new StringCheck(stringToCheck);
        assertTrue(stringCheck.isValidString());
    }

    @DisplayName("Kiểm tra tính hợp lệ của dấu ngoặc thiếu TH1")
    @Test
    void testIsNotValidBracketCase1() {
        String stringToCheck = "s * (s – a) * (s – b * (s – c)";
        stringCheck = new StringCheck(stringToCheck);
        assertFalse(stringCheck.isValidString());
    }

    @DisplayName("Kiểm tra tính hợp lệ của dấu ngoặc thiếu TH2")
    @Test
    void testIsNotValidBracketCase2() {
        String stringToCheck = "s * (s – a) * s – b) * (s – c)";
        stringCheck = new StringCheck(stringToCheck);
        assertFalse(stringCheck.isValidString());
    }

    @DisplayName("Kiểm tra tính hợp lệ của dấu ngoặc thiếu TH3")
    @Test
    void testIsNotValidBracketCase3() {
        String stringToCheck = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        stringCheck = new StringCheck(stringToCheck);
        assertTrue(stringCheck.isValidString());
    }
}