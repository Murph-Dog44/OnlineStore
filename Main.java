import java.util.ArrayList;

public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args)
     {
        
      ArrayList<Author> authors = new ArrayList<Author>();
      authors.add(new Author("Jane Austen","1775-12-16"));
      Store s = new Store();
      Book b = new Book("Pride and Prejudice", authors, "2025-10-06", "Penguin", 20);
      Movie m = new Movie("Sense and Sensibility", authors, "2025-10-06", 120, 15);
      // Add items to store
      s.addItem(b);
      s.addItem(m);
      // Show items
      System.out.println("Items in store:");
      for (ItemForSale item : s.showItems()) {
         System.out.println("- " + item.getName() + ", $" + item.getPrice());
      }
      // Test creator method
      System.out.println("Creators of 'Pride and Prejudice':");
      for (Author a : s.creator(b)) {
         System.out.println(a.getName() + ", born " + a.getBirthDate());
      }
      // Sell a book
      s.sellItem(b);
      System.out.println("After selling 'Pride and Prejudice', items in store:");
      for (ItemForSale item : s.showItems()) {
         System.out.println("- " + item.getName());
      }
      // Check instanceof
      System.out.println("b instanceof ItemForSale: " + (b instanceof ItemForSale));
      System.out.println("m instanceof ItemForSale: " + (m instanceof ItemForSale));


     }
}
