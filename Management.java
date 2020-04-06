package programmingtask02;
//inheritance
public class Management extends Employee2 {
	
	 int s = 20; // wages for management
	int c;
	 
	 public Management(int n, int h) {
		 super(n,h);
	 }
	 public int salary() {
		 if(this.hours> 40) {
			c =  hours - 40;// difference between 40 and total hours
			 return (s*40 - 20*c);// calculates overtime
		 }
		 else {
			 return s*hours;
		 }

}
	public void Details() {
		System.out.println("\n");
			System.out.println("ID card number is: 12345678 ");
			System.out.println("Hours: "+ this.hours);
			System.out.println("Status: Management ");
			System.out.println("Salary:"+ salary());
			
			
			
		
	}
}
