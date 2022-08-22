package drama;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DramaTest {

    private Drama drama;

    @BeforeEach
    public void setUp(){
        drama = new Drama("Bullet Train", "David Leitch");
    }

    @Test
    public void canShowName(){
        String actual = drama.showName();
        String expected = "The drama is called Bullet Train.";
        assertEquals(actual, expected);
    }
}
