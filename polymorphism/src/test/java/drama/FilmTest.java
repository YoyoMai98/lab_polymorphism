package drama;

import org.junit.jupiter.api.BeforeEach;

public class FilmTest {

    private Film film;

    @BeforeEach
    public void setUp(){
        film = new Film("The Lord of the Rings", "Peter Jackson", true);
    }
}
