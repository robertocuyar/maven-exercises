import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class MyFirstTest {
    List<String> languages = new ArrayList<>();
    List<String> moreLanguages = new ArrayList<>();

    @Test
    public void testIfStringEqual () {
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
    }
    @Test
    public void testIfListNotEqual (){
        assertNotSame(languages, moreLanguages);
    }
    @Test
    public void testArrays(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }
    @Test
    public void testTrueFalse(){
        String language= "PHP";
        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }
}
