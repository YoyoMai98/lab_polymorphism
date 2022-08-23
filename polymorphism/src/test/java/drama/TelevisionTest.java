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

    @Test
    public void canNowShowing_true(){
        String actual = tv.nowShowing();
        String expected = "It is showing now!";
        assertEquals(actual, expected);
    }

    @Test
    public void canNowShowing_false(){
        tv.setIsShown(false);
        String actual = tv.nowShowing();
        String expected = "Oh no, not shown in tv.";
        assertEquals(actual, expected);
    }

    @Test
    public void canShowCountry(){
        String expected = "This is America TV shows.";
        String actual = tv.showCountry();
        assertEquals(expected, actual);
    }

    @Test
    public void virtualMedia(){
        String expected = "Person of Interest could be watched online.";
        String actual = tv.virtualMedia();
        assertEquals(expected, actual);
    }
}
