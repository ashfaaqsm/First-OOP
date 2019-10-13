/**
 * 
 */

/**
 * @author User
 *
 */
public class Person {
	
	/*static attribute*/
	
	private static int counter=0;
	
	
		/*attributes*/
	
	private String nid;
	private String firstName;
	private String lastName;
	private String dob;
	private char gender;
	private double height;
	private double weight;
	
	/*constructor*/
	
	/**
	 * Default constructor
	 */
	
	public Person () {
		this.nid = null;
		this.firstName = null;
		this.lastName = null;
		this.weight = 0.0;
		this.height = 0.0;
		this.dob = null;
		this.gender = '.';
		setCounter(getCounter()+1);//incrementing the count to track num of objects cerated
	}
	/**
	 * overloaded 2 parameter constructor
	 * @param dob of person
	 * @param weight of person
	 */
	public Person(String dob, double weight) {
		this.dob = dob;
		this.weight = weight;
		setCounter(getCounter()+1);//incrementing the count to track num of objects ceated
	}
	/**
	 * 
	 * @param nid of person
	 * @param firstName of person
	 * @param lastName of person
	 * @param dob of person
	 * @param gender of person
	 * @param height of person
	 * @param weight of person
	 */
	public Person(String nid,String firstName,String lastName, String dob, char gender,double height,double weight ) {
	
			this.nid = nid;
			this.firstName = firstName;
			this.lastName = lastName ;
			this.dob = dob ;
			this.gender = gender;
			this.height = height;
			this.weight =weight;
			setCounter(getCounter()+1);//incrementing the count to track num of objects created
}
			
			
	/*behaviour*/
	/**
	 * Method to return 1st name and last name of a person 
	 * @return full name of person
	 * @return
	 */
	public String getName() {
		return this.firstName + " " + this.lastName;
	}

	/**
	 * @param height
	 * @param weight
	 * @return
	 */
	public static double calculateBmi(double height, double weight) {
		
		//return( (weight)/height*height) )
		
		return (weight/ Math.pow(height/100, 2));
	}
	
	/**
	 * Auto generate value
	 * @return
	 */
	public double calculateBmi() {
		
		//return( (weight)/height*height) )
		
		return (this.weight/ Math.pow(this.height/100, 2));
	}

	
	/**
	 * @return gender of person
	 */
	public char getGender() {
		return this.gender;	
	}
	 /**
	  * 
	  * @return nid of person
	  */
	public String getNid() {
		return this.nid;
	}
	/**
	 * 
	 * @return first name of person
	 */
	public String getfirstName() {
		return this.firstName;
		
	}
	
	public double getWeight() {
	
	return this.weight;}

		/**
		 * 
		 * @return last name of person
		 */
	public String getlastName() {
		return this.lastName;
		
		
	}
	
	/**
	 * 
	 * @return height of person
	 */
	public double getHeight() {
		return this.height;
	}
	/***
	 * 
	 * @return date of birth
	 */
	
	private String getdob() {
		return this.dob;
	}
	
	/**
	 * 
	 * @param gender of person
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}
	 
	/**
	 * 
	 * @param weight of person
	 */
	
	public void setWeight(double weight) {
		this.weight=weight;
		
	}
	/**
	 * 
	 * @param first name of person
	 */
	
	public void setfirstName(String firstName) {
		this.firstName=firstName;
		
		
			
			
	}
	
	/**
	 * 
	 * @param lst name of person
	 */
	public void setlastName(String lastName) {
		this.lastName=lastName;
		
	}
	
	/**
	 * 
	 * @param date of birth if person
	 */
	
	public void setdob(String dob) {
		this.dob=dob;
		
	}
	
	/**
	 * 
	 * @param nid of person
	 */
	public void setNid(String nid) {
		this.nid=nid;

	
	}
	
	/**
	 * 
	 * @param height of person
	 */
	public void setheight(double height) {
		this.height=height;
	}
	@Override
	public String toString() {
		return "Person [nid=" + nid + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", gender=" + gender + ", height=" + height + ", weight=" + weight + "]";
	}
	
	/**
	 * a method to compare if two Person object are the same based on their NID
	 * @param p is the other Person with whom we are trying to campare
	 * @return true if they are the same
	 */
	public boolean equals(Person p) {
		if(this.nid.equalsIgnoreCase(p.nid)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * @return the counter
	 */
	public static int getCounter() {
		return counter;
	}
	/**
	 * @param counter the counter to set
	 */
	public static void setCounter(int counter) {
		Person.counter = counter;
	}

	
}
	