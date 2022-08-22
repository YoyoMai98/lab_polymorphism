package collection;

import drama.Drama;
import drama.Television;
import org.junit.jupiter.api.BeforeEach;

public class CollectionTest {

    private Drama poi;
    private Drama cm;

    @BeforeEach
    public void setUp(){
        poi = new Television("Person of Interest", "Jonathan Nolan","America");
        cm = new Television("Criminal Minds", "Glenn Kershaw", "America");
    }
}
