package cit591_vercion_control_ex922;

public class ItemToPurchase {
	String itemName;
	int itemPrice;
	int itemQuantity;
	
	String getName() {
		return itemName;
	}
	
	int getPrice() {
		return itemPrice;
	}
	
	int getQuantity() {
		return itemQuantity;
	}
	
	public void setName(String name) {
		this.itemName = name;
	}
	
	public void setPrice(int price) {
		this.itemPrice = price;
	}
	
	public void setQuantity(int quantity) {
		this.itemQuantity = quantity;
	}
}
