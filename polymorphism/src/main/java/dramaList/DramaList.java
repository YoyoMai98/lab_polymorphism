package dramaList;

import collection.Collection;
import drama.Drama;

public class DramaList {

    private Collection watchList;
    private Collection watchedList;
    private Collection watchOnlineList;

    public DramaList(Collection watchList, Collection watchedList, Collection watchOnlineList){
        this.watchList = watchList;
        this.watchedList = watchedList;
        this.watchOnlineList = watchOnlineList;
    }

    public Collection getWatchedList() {
        return watchedList;
    }

    public Collection getWatchList() {
        return watchList;
    }

    public void setWatchedList(Collection watchedList) {
        this.watchedList = watchedList;
    }

    public void setWatchList(Collection watchList) {
        this.watchList = watchList;
    }

    public void addDramaToCollection(Drama drama, Collection collection){
        collection.addDramaToList(drama);
    }

    public void removeDramaFromCollection(Drama drama, Collection collection){
        collection.removeDramaToList(drama);
    }
}
