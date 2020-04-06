package programmingtask02;
//inheritance
	public class Kitchen extends Employee2{
		
		 int s = 11; // wages for kitchen
		
		 public Kitchen(int s, int h) {
			 super(s,h);
			 }
		public int salary() {
			//overtime is 50
			
			return (s*this.hours);
		}
		
		public void Details() {
			System.out.println("\n");
			System.out.println("ID card number is: 12345678");
			System.out.println("Status: Kitchen ");
			System.out.println("Hours:"+ this.hours);
			System.out.println("Salary:"+ salary());
			
			
			
		}

		 }
	