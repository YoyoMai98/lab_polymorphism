package collection;

import drama.Drama;
import drama.Television;
import interfaces.IVirtual;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionTest {

    private Television poi;
    private Television cm;
    private Collection collection;

    @BeforeEach
    public void setUp(){
        poi = new Television("Person of Interest", "Jonathan Nolan","America");
        cm = new Television("Criminal Minds", "Glenn Kershaw", "America");
        collection = new Collection("tv");
    }

    @Test
    public void canAddDramaToList(){
        collection.addDramaToList(poi);
        int actual = collection.countDramaCollection();
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void canRemoveDramaToList(){
        collection.addDramaToList(cm);
        collection.removeDramaToList(cm);
        int actual = collection.countDramaCollection();
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void canAddDramaToVirtualCollection(){
        collection.addDramaToVirtualCollection(cm);
        collection.addDramaToVirtualCollection(poi);
        int actual = collection.countVirtualCollection();
        int expected = 2;
        assertEquals(expected, actual);
    }
}
