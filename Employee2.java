package programmingtask02;

public class Employee2 {

	 int status ;
	 int hours ;
	public int wages = 11;
	
	public Employee2(int s, int h) {//constructor
		this.status= s;
		this.hours= h;
			}
	//modifier, data type, method name, parameter
	public int salary() {// method for finding the salary
		return hours*wages;
}
}