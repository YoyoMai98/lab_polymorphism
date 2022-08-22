package drama;

public class Film extends Drama {

    private boolean isReplay;

    public Film(String title, String director, boolean isReplay){
        super(title, director);
        this.isReplay = isReplay;
    }

    @Override
    public String nowShowing(){
        if(isReplay == true){
            return "The movie is back on cinema!";
        }else{
            return "Watch it at home.";
        }
    }
}
