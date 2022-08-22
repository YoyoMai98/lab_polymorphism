package dramaList;

import collection.Collection;
import org.junit.jupiter.api.BeforeEach;

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
}
