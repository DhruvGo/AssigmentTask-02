package programmingtask02;
import java.util.Scanner;
public class Employee1 {

	public static void main(String[] args) {
		//user inputs ID card, status and hours
		Scanner input = new Scanner(System.in); ///user input
		System.out.println("How many Management workers? \n");
		int n = input.nextInt();
		int m ;
		if(n > 0) {// if value is 0, leaves the code and moves on to the next one
		Management[] staff = new Management [n];//array for Management // initializes of object staff
		
		
		for(int i = 0; i<staff.length; i++) { // for loop running
			System.out.println("ID: \n");
			n= input.nextInt(); // saves employee ID
			System.out.println("Hours: \n");
			m= input.nextInt();// saves Hours worked 
			
			staff[i] = new Management (n,m);
		}
		for (int i =0; i<staff.length; i++) {
			staff[i].Details(); // calls in method from class Management
		}
		}
		
	//code for kitchen
		System.out.println("How many kitchen worker? \n");
		n = input.nextInt();
		if(n<0) {// if the value is 0, leaves the code and moves on to the next one
		Kitchen[] kstaff = new Kitchen [n];
		for(int i = 0; i<kstaff.length; i++) {
			System.out.println("ID: \n");
			n= input.nextInt();// saves ID
			System.out.println("Hours: \n");
			m= input.nextInt();// Hours worked
			
			kstaff[i] = new Kitchen (n,m); // 
		}
		for (int i =0; i<kstaff.length; i++) {
			kstaff[i].Details(); // calls in the method from class Kitchen
	}
		}
		//code for waiter
		System.out.println("How many waiter worker? \n");
		n = input.nextInt();
		Waiter[] wstaff = new Waiter [n];
		for(int i = 0; i<wstaff.length; i++) {
			System.out.println("ID: \n");
			n= input.nextInt();
			System.out.println("Hours: \n");
			m= input.nextInt();
			
			wstaff[i] = new Waiter (n,m);
		}
		for (int i =0; i<wstaff.length; i++) {
			wstaff[i].Details(); // calls in the method from class Waiter
	
	
	

}
		}
	}



