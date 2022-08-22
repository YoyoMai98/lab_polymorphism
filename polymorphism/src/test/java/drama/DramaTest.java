package drama;

import org.junit.jupiter.api.BeforeEach;

public class DramaTest {

    private Drama drama;

    @BeforeEach
    public void setUp(){
        drama = new Drama("Bullet Train", "David Leitch");
    }
}
