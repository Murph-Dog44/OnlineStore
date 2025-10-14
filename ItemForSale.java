// Taiyo Murphy 10/14/25
// creates an object with a name, placed date, creator(s), and price. The ItemForSale will be added and sold in the Store.
import java.util.ArrayList;

public class ItemForSale
{
    private String name;
    private ArrayList<Author> creators;
    private String placedDate;
    private int price;

    public ItemForSale(String n, ArrayList<Author> c, String p, int pr){
        name = n;
        creators = c;
        placedDate = p;
        price = pr;
    }

    public String getName(){
        return name;
    }

    public void setName(String x){
        name = x;
    }

    public ArrayList<Author> getCreators(){
        return creators;
    }

    public void setCreators(ArrayList<Author> x){
        creators = x;
    }

    public String getPlacedDate(){
        return placedDate;
    }

    public void setplacedDate(String x){
        placedDate = x;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int x){
        price = x;
    }
}
