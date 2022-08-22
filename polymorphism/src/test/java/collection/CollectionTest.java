package collection;

import drama.Drama;
import drama.Television;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CollectionTest {

    private Drama poi;
    private Drama cm;
    private Collection collection;

    @BeforeEach
    public void setUp(){
        poi = new Television("Person of Interest", "Jonathan Nolan","America");
        cm = new Television("Criminal Minds", "Glenn Kershaw", "America");
        collection = new Collection("tv");
    }
}
