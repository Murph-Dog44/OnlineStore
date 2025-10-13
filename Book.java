// PreCondition: each book must have a publisher, along with all the other things that an ItemForSale has.
// PostCondition: creates a book with a name, publisher, placed date, creator(s), and price. 
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
