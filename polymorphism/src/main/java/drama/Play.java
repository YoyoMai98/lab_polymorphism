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
}
