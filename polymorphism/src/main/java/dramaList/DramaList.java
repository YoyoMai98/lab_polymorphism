package dramaList;

import collection.Collection;
import drama.Drama;

public class DramaList {

    private Collection watchList;
    private Collection watchedList;

    public DramaList(Collection watchList, Collection watchedList){
        this.watchList = watchList;
        this.watchedList = watchedList;
    }

    public void addDramaToCollection(Drama drama, Collection collection){
        collection.addDramaToList(drama);
    }

    public void removeDramaFromCollection(Drama drama, Collection collection){
        collection.removeDramaToList(drama);
    }
}
