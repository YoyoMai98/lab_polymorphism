package drama;

import interfaces.IVirtual;

public class Television extends Drama implements IVirtual {

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

    public String virtualMedia(){
        return String.format("%s could be watched online.", super.getTitle());
    }
}