package entities;

public class Product {

 public String name;
 public double price;
 public int quantity;
 
 public product(String name, double price, int quantity) {
	 this.name = name;
	 this.price = price;
	 this.quantity = quantity;
 }
 
 public product(String name, double price, int quantity) {
	 this.name = name;
	 this.price = price;
	 quantity = 0;
 }
 public double totalValueInStock() {
	 return price * quantity;
	 
 }
 
 public void addProducts (int quantity) {
	 this.quantity += quantity;
 }
 public void removeProducts (int quantity) {
	 this.quantity -= quantity;
	 
 }
 public String toString() {
	 return name
			 + ", $ "
			 + String.format("%.2f", price)
			 + ", "
			 + "units, Total : $ "
			 + totalValueInStock();
	 
 }           
 
             
}


