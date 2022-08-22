package drama;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayTest {

    private Play play;

    @BeforeEach
    public void setUp(){
        play = new Play("Harry Potter and the Cursed Child", "John Tiffany", "The Palace Theatre");
    }

    @Test
    public void canShowName(){
        String expected = "The drama is called Harry Potter and the Cursed Child.";
        String actual = play.showName();
        assertEquals(actual, expected);
    }

    @Test
    public void canNowShowing_true(){
        String actual = play.nowShowing();
        String expected = "It is showing now!";
        assertEquals(actual, expected);
    }

    @Test
    public void canNowShowing_false(){
        play.setIsShown(false);
        String actual = play.nowShowing();
        String expected = "Oh no, it closed.";
        assertEquals(actual, expected);
    }

    @Test
    public void canShowTheatre(){
        String actual = play.showTheatre();
        String expected = "It is played at The Palace Theatre";
        assertEquals(actual, expected);
    }
}
