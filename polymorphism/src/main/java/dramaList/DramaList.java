package dramaList;

import collection.Collection;

public class DramaList {

    private Collection watchList;
    private Collection watchedList;

    public DramaList(Collection watchList, Collection watchedList){
        this.watchList = watchList;
        this.watchedList = watchedList;
    }
}
