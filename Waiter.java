package programmingtask02;
//inheritance
public class Waiter extends Employee2 {

	 int s = 15; // wages for waiter
	 
	 public Waiter(int s, int h) {
		 super(s,h);
		 
	 }
			public int salary() {
				//overtime is 50
				
				return (s*this.hours);
}
			public void Details() {
			System.out.println("\n");
			System.out.println("ID card number is: 12345678");
			System.out.println("Status: Waiter ");
			System.out.println("Hours:"+ this.hours);
			System.out.println("Salary:"+ salary());
}
}
