package drama;

public class Television extends Drama{

    private String country;

    public Television(String title, String director, String country){
        super(title, director);
        this.country = country;
    }

    public String showCountry(){
        return String.format("This is %s TV shows.", this.country);
    }

    public String nowShowing(){
        if(super.getIsShown() == true){
            return "It is showing now!";
        }else{
            return "Oh no, not shown in tv.";
        }
    }
}
