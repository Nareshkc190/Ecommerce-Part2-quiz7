import java.util.*;
public class generateRandom {
	static String [] javaStudents = {"Son","Noel","Rojan","Hannah","Reeta","Caroline","Sasha","Naresh","Clarissa"};
	static String [] group1 = new String[3];
	static String [] group2 = new String[3];
	static String [] group3 = new String[3];
	static String [][] table =new  String [3][3];
	static int row;
	static int column;
	
	
	public void printSomething() {
	for(int i = 0;i<javaStudents.length;i++) {
		Random rnd = new Random();

		int row = rnd.nextInt(3);
		int column = rnd.nextInt(3);
		table[row][column] = javaStudents[i];
		System.out.println(table[row][column]);
	}}
		

	public static void main(String[] args) {
		generateRandom g = new generateRandom();
		g.printSomething();
		
	}

		
//			group2[i] = javaStudents[rnd.nextInt(9)];
//			group1[i] = javaStudents[rnd.nextInt(9)];
//			group3[i] = javaStudents[rnd.nextInt(9)];
		

			
		
//		for(String a :group1) {
//			System.out.println(a);}
//		System.out.println("\n");
//
//		for(String a :group2) {
//			System.out.println(a);}
//			System.out.println("\n");
//		
//		for(String a :group3) {
//			System.out.println(a);}
//			System.out.println("\n");
		
		
		
		
	
}
