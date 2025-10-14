// Taiyo Murphy 10/14/25
// creates a Movie with a name, duration, placed date, creator(s), and price, which extends the ItemForSale class.
import java.util.ArrayList;

public class Movie extends ItemForSale
{
    private int duration;

    public Movie(String name, ArrayList<Author> creators, String placedDate, int d, int price){
        super(name, creators, placedDate, price);
        duration = d;
    }

    public int getDuration(){
        return duration;
    }

    public void setDuration(int x){
        duration = x;
    }
}
