package project;

public class Order {
	
	private int nbOfItems;
	private static int priceOfItem = 20;
	private static int nbOfitems = 400;
	private double totalPrice;
	private double basePrice;
	private double discount;
	
	public Order (int nbofitems) {
		if (nbofitems > 0 && nbofitems < nbOfitems) {
			this.nbOfItems = nbofitems ; 	
		}
		else 
			System.out.println("Out of stock !") ; 
	   }
	
	 public double calculateprice () {
		this.basePrice = nbOfItems*priceOfItem ; 
		 return this.basePrice;
		 
	 }
	
	 public double discount () { 
		 if (basePrice > 100) { 
	     this.totalPrice=basePrice-(this.basePrice*0.2); 
		 }
		 else 
			System.out.println("No discount !"); 
		 return totalPrice ; 
	 }
	 
	 private static double nbOfitemsInStock() {
		 return nbOfitemsInStock()-nbOfitems; 
	 }

	
	public String toString() {
		return "the number of items is : " +this.nbOfItems+
				"\nthe base price is : "+this.basePrice +
				"\nThe price after 20% of discount is : " + this.totalPrice ; 
	}
	 
	 
}