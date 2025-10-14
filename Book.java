// Taiyo Murphy 10/14/25
// creates a book with a name, publisher, placed date, creator(s), and price, which extends ItemForSale
import java.util.ArrayList;

public class Book extends ItemForSale
{

    private String publisher;

    public Book(String name, ArrayList<Author> creators, String placedDate, String pub, int price){
        super(name, creators, placedDate, price);
        publisher = pub;
    }

    public String getPublisher(){
        return publisher;
    }

    public void setPublisher(String x){
        publisher = x;
    }
}
