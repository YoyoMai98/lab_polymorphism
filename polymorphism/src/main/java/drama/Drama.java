package drama;

public abstract class Drama {

    private String title;
    private String director;
    private boolean isShown;

    public Drama(String title, String director){
        this.title = title;
        this.director = director;
        this.isShown = true;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getDirector(){
        return director;
    }

    public void setDirector(String director){
        this.director = director;
    }

    public boolean getIsShown(){
        return isShown;
    }

    public void setIsShown(boolean isShown){
        this.isShown = isShown;
    }

    public String showName(){
        return String.format("The drama is called %s.", this.title);
    }

    public String nowShowing(){
        if(isShown == true){
            return "It is showing now!";
        }else{
            return "Oh no, it closed.";
        }
    }

}
