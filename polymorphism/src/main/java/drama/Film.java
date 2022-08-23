package drama;

import interfaces.IDirector;

public class Film extends Drama implements IDirector {

    private boolean isReplay;

    public Film(String title, String director, boolean isReplay){
        super(title, director);
        this.isReplay = isReplay;
    }

    @Override
    public String nowShowing(){
        if(isReplay){
            return "The movie is back on cinema!";
        }else if(super.getIsShown() == false){
            return "It is not showing on cinema.";
        }else{
            return "Watch it on cinema!";
        }
    }

    public String nowShowing(String cinema){
        return String.format("%s is showing at %s", super.getTitle(), cinema);
    }

    public String showDirector(){
        return String.format("%s was directed by %s", super.getTitle(), super.getDirector());
    }

    public boolean getIsReplay(){
        return this.isReplay;
    }

    public void setIsReplay(boolean IsReplay) {
        isReplay = IsReplay;
    }
}
