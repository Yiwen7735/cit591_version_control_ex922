package cit591_vercion_control_ex922;
import java.util.*;
public class ShoppingCartPrinter {
    
    String name;

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int totalCost = 0;
		for (int i = 1; i < 3; i++) {
			System.out.println("Item " + i + ":");
			System.out.println("Enter the item name: ");
			String name = scnr.nextLine();
			System.out.println("Enter the item price($): ");
			int price = scnr.nextInt();
			System.out.println("Enter the item quantity: ");
			int quantity = scnr.nextInt();
			scnr.nextLine();
			ItemToPurchase item = new ItemToPurchase();
			item.setName(name);
			item.setPrice(price);
			item.setQuantity(quantity);
			totalCost += item.cost();
		}
		
		System.out.println("Total cost: $" + totalCost);
		scnr.close();
		
	}

}
