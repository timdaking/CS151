/**
   A product with a price and description.
*/
public class Product implements LineItem
{
   private int size;
/**
      Constructs a product.
      @param description the description
      @param price the price
   */
   public Product(String description, double price)
   {
      this.description = description;
      this.price = price;
   }
   public Product(int size)
   {
	   this.size = size;
   }
   public double getPrice() { return price; }
   public String toString() { return description; }
   public int getSize() {return size;}
   private String description;
   private double price;
}
