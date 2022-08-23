package collection;

import drama.Drama;
import interfaces.IVirtual;

import java.util.ArrayList;

public class Collection {

    private String type;
    private ArrayList<Drama> dramaCollection;
    private ArrayList<IVirtual> virtualCollection;

    public Collection(String type){
        this.type = type;
        dramaCollection = new ArrayList<>();
    }

    public void addDramaToList(Drama drama){
        dramaCollection.add(drama);
    }

    public void removeDramaToList(Drama drama){
        dramaCollection.remove(drama);
    }

    public int countDramaCollection(){
        return this.dramaCollection.size();
    }

    public void addDramaToVirtualCollection(IVirtual virtualDrama){
        virtualCollection.add(virtualDrama);
    }
}
