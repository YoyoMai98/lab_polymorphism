package drama;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmTest {

    private Film film;

    @BeforeEach
    public void setUp(){
        film = new Film("The Lord of the Rings", "Peter Jackson", true);
    }

    @Test
    public void canShowName(){
        String actual = film.showName();
        String expected = "The drama is called The Lord of the Rings.";
        assertEquals(actual, expected);
    }

    @Test
    public void canNowShowing_isReplay_true(){
        String actual = film.nowShowing();
        String expected = "The movie is back on cinema!";
    }

    @Test
    public void canNowShowing_isReplay_false_isShown_true(){
        String actual = film.nowShowing();
        String expected = "Watch it on cinema!";
    }

    @Test
    public void canNowShowing_isReplay_false_isShown_false(){
        film.setIsShown(false);
        String actual = film.nowShowing();
        String expected = "It is not showing on cinema.";
    }
}