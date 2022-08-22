package drama;

public class Film extends Drama {

    private boolean isReplay;

    public Film(String title, String director, boolean isReplay){
        super(title, director);
        this.isReplay = isReplay;
    }
}
