import java.util.InputMismatchException;

import java.util.*;
public class Shop {
	
	public static double totalAmount = 0.0;
	public static int userInput=9;
	public  static boolean isShopOpen = true;

	static Product[] inventory = {new Product("Business Ritual Women’s Long Sleeve Top",65.39,"Apparel",4,'L',"Blue"),
			new Product("The Art of Computer Programming",190.54,"Books",9,"Donald E. Knuth"),
	        new Product("Men’s Business Casual Shirt",57.10,"Apparel",2,'M',"Teal"),
	        new Product("Organic Turmeric Soap",11.25,"Bath & Beauty",1),
	        new Product("Head First Design Pattern",37.35,"Books",3,"Eric Freeman")};
	

	public static void main(String[] args) {
		Date date = new Date();
		if(date.getHours() >21) 
			isShopOpen = false;
		else 
			isShopOpen = true;
		
		Scanner scanner = new Scanner(System.in);		
		if(!isShopOpen)
			System.out.println("Shop is close !!");
		 //ifisOpen is false
		
		else {
		while(true){
			System.out.println("Enter the product index (0 to 4) you want to buy. To exit the shopping cart, enter any number other than 0 to 4");
		
			for(int i =0;i<inventory.length;i++){
			System.out.println(i + " : " + inventory[i].getName()); 
			}
			
			try{
				userInput = scanner.nextInt();
				
				if(inventory[userInput].buy()){
					System.out.println("Your purchase was succesful");
				    totalAmount += inventory[userInput].getPrice();
				}
		
		        else {
			          System.out.println("The item is out of stock"); 
						System.out.println("Thank you for shopping with us! The total amount is "  +  totalAmount + "\n");

				      break;
		              }
			}catch(ArrayIndexOutOfBoundsException e){
					System.out.println( "Array index out of bound, exiting the shopping cart! Your total amount is " + totalAmount + "\n");
					break;
					}
			catch(InputMismatchException e) {
				System.out.println("invalid input !!");
				System.out.println("Thank you for shopping with us! The total amount is "  +  totalAmount + "\n");
				break;
			                                  
				} }
		scanner.close();
		}
		//Extra Credit   Use for-each loop to print the products inside inventory. 
		for(Product product: inventory){
			System.out.println(product);
		
				}	}		
}		