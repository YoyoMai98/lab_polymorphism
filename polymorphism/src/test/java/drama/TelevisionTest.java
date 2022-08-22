package drama;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelevisionTest {

    private Television tv;

    @BeforeEach
    public void setUp(){
        tv = new Television("Person of Interest", "Jonathan Nolan","America");
    }

    @Test
    public void canShowName(){
        String expected = "The drama is called Person of Interest.";
        String actual = tv.showName();
        assertEquals(actual, expected);
    }
}
