import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Online {
	public static double totalAmount = 0.0;
	public static int userInput=9;
	public static boolean caught = false;
	static ArrayList<Product> items = new ArrayList<Product>();

	public static void main(String[] args) {
		
		items.add(new Apparel("Business Ritual Women’s Long Sleeve Top",65.39,4,'L',"Blue"));
		items.add(new Book("The Art of Computer Programming",190.54,9,"Donald E. Knuth","Education","9788-429-1266-48"));
		items.add(new Apparel("Men’s Business Casual Shirt" , 57.10,2,'M',"Teal"));
		items.add(new Bath("Organic Turmeric Soap",11.25,1));
		items.add(new Book("Head First Design Pattern",37.35,3, "Eric Freeman"));
		Scanner scanner = new Scanner(System.in);

		while(true){
			System.out.println("Enter the product index (0 to 4) you want to buy. To exit the shopping cart, enter any number other than 0 to 4");
			for(int i =0;i<items.size();i++)
			System.out.println(i + " : " + items.get(i).name); 
			
			try{
				userInput = scanner.nextInt();
				
				if(items.get(userInput).buy()){
					System.out.println("Your purchase was succesful");
				    totalAmount += items.get(userInput).getPrice();
				}
		
		        else {
			          System.out.println("The item is out of stock"); 
						System.out.println("Thank you for shopping with us! The total amount is "  +  totalAmount + "\n");
						break;
		              }
				
			}catch(IndexOutOfBoundsException e){
					System.out.println( "Array index out of bound, exiting the shopping cart! Your total amount is " + totalAmount + "\n");
					caught = true;
					break;
					}
			catch(InputMismatchException e) {
				System.out.println("invalid input !!");
				System.out.println("Thank you for shopping with us! The total amount is "  +  totalAmount + "\n");
				caught = true;
				break;
			   } 
		
		finally{
			if(caught)
			scanner.close();
		}
	}
	}}

/*• new Apparel object and the attributes would be name: Business Ritual Women’s Long
Sleeve Top , price: 65. 39, quantity: 4, size: L, color: Blue
• new Book object and the attributes name: The Art of Computer Programming , price: 190.
54, quantity: 9, author: Donald E. Knuth, genre : Education, isbn : "9788-429-1266-48"
• new Apparel object and the attributes name: Men’s Business Casual Shirt , price: 57. 10,
quantity: 2, size: M, color: Teal
• new Bath object and the attributes name: Organic Turmeric Soap , price: 11. 25, quantity:
1
• new Book object the attributes name: Head First Design Pattern, price: 37. 35, quantity: 3,
author: Eric Freeman*/
