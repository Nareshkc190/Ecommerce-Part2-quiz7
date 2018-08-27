public abstract class Product {

	protected String name;
	protected double price;
	protected int quantity;


	
	// Constructor for products that  are apparel and hence they will have name, price, category, quantity, size, color
    Product(String name, double price, int quantity){
		this.name = name;
		this.price= price;
		this.quantity=quantity;
	}
    
	public abstract void getDetails();

	
   

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
//	@Override
//	public String toString() {
//		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
//	}

	boolean buy(){
		if(quantity>0){
			quantity--;
			return true;
		}
			else 
				return false;
		}
	}
