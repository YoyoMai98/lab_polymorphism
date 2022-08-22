package drama;

import org.junit.jupiter.api.BeforeEach;

public class PlayTest {

    private Play play;

    @BeforeEach
    public void setUp(){
        play = new Play("Harry Potter and the Cursed Child", "John Tiffany", "The Palace Theatre");
    }
}
