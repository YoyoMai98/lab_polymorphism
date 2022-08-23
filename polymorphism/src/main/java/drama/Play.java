package drama;

public class Play extends Drama{

    private String theatre;

    public Play(String title, String director, String theatre){
        super(title, director);
        this.theatre = theatre;
    }

    public String showTheatre(){
        return String.format("It is played at %s", this.theatre);
    }

    public String nowShowing(){
        if(super.getIsShown() == true){
            return "It is showing now!";
        }else{
            return "Oh no, it closed.";
        }
    }
}
