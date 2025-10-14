// Taiyo Murphy 10/14/25
// Creates a Store, which has itemsForSale, which can be added and sold, and a profit that is stored within class.

/*Implement the following functionality into the store:

  instance variables: 
    profit: how much money the store has made
    items:  instance variable (could be an array or LinkedList or ArrayList of one of the other classes)

  methods:
    showItems: displays all items available for sale
    addItem: adds an item for sale
    sellItem(itemName): removes the item from the store and adds its price to profit
    creator(itemName): displays who created the item in question

    You will need to include the following information to be stored in the inheritance heiarchy using the other classes:
      name of thing being sold
      price for things that are on sale
      names of creators of movies and books
      date of birth of book authors
      date that things are placed on sale
      duration of movies
      publisher of books

    Where these variables are stored and how to name them is up to you!
*/

import java.util.ArrayList;

public class Store
{
  private double profit;
  private ArrayList<ItemForSale> items;

  public Store(){
    profit = 0;
    items = new ArrayList<ItemForSale>();
  }

  public Store(double p, ArrayList<ItemForSale> i){
    profit = p;
    items = i;
  }

  // preCondition: the Store has items, otherwise items is null/empty.
  // postCondition: returns an arraylist of all Items for sale.
  public ArrayList<ItemForSale> showItems(){
    return items;
  }

  // preCondition: items is an arrayList, and item is a valid itemForSale.
  // postCondition: adds an ItemForSale to items.
  public void addItem(ItemForSale item){
    items.add(item);
  }

  // preCondition: items is an arrayList, and item is a valid itemForSale.
  // postCondition: sells an ItemForSale if the item is in items.
  public void sellItem(ItemForSale item){
    for (int i = 0; i< items.size(); i++){
      if (items.get(i).equals(item)){
        items.remove(i);
        profit += item.getPrice();
        return;
      }
    }
  }
  // preCondition: item is a valid itemForSale with a creator(s).
  // postCondition: returns a list of the creators of item.
  public ArrayList<Author> creator(ItemForSale item){
    return (item.getCreators());
  }

}
