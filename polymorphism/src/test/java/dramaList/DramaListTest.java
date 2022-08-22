package dramaList;

import collection.Collection;
import drama.Television;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DramaListTest {

    private DramaList fullList;
    private Collection watchList;
    private Collection watchedList;

    @BeforeEach
    public void setUp(){
        watchedList = new Collection("tv");
        watchList = new Collection("tv");
        fullList = new DramaList(watchList, watchList);
    }

    @Test
    public void canAddDramaToCollection(){
        Television poi = new Television("Person of Interest", "Jonathan Nolan","America");
        fullList.addDramaToCollection(poi, watchedList);
        int expected = 1;
        int actual = watchedList.countDramaCollection();
        assertEquals(actual,expected);
    }
}
