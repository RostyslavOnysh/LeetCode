package modArrayList;

public class Toy {
   private String name;
   private long price;

   public Toy(String name, long price) {
      this.name = name;
      this.price = price;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public long getPrice() {
      return price;
   }

   public void setPrice(long price) {
      this.price = price;
   }

   @Override
   public String toString() {
      return "Toy{" +
              "name='" + name + '\'' +
              ", price=" + price +
              '}';
   }
}