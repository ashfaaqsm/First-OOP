import java.util.Scanner;

/**
 * 
 */

/**
 * @author User
 *
 */
public class TestPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			/*create a first person object*/
		Scanner keyboard = new Scanner(System.in);
		double inputweight; 
		double inputheight;
		
		System.out.println("No of person in register is: "+ Person.getCounter());
		
		System.out.println("Plaese enter weight");
		inputweight=keyboard.nextDouble();
				
		System.out.println("Plaese enter height");
		inputheight=keyboard.nextDouble();
		
		System.out.println("Your BMI is: "+ Person.calculateBmi(inputheight, inputweight));
				
		
		Person p1 = new Person(); //using default constructor
		
		System.out.println(p1.toString()); //display the string representation of person p1
		
		p1.setfirstName("John"); //change the name of Person p1
		
		System.out.println(p1.toString()); //display the string representation of person p1
		
		p1.setheight(170.50); //change the height of person p1

		//get name and height of person p1
		
		System.out.println("Height of " +p1.getfirstName()+ " is: " +p1.getHeight());
		
		System.out.println("No of person in register is: "+ Person.getCounter());
		/*********************************************************************************************************/
		
		
		
		/*creating another object of type person*/
		
		Person p2 = new Person ("16/08/19",2.5); //using overloaded 2 args constructor
		p2.setfirstName("Sara");
		p2.setheight(35.2);
		
		System.out.println("Height of "+ p2.getfirstName()+" is: "+p2.getHeight());
		
		System.out.println("No of person in register is: "+ Person.getCounter());
	/*************************************************************************************************************/
		
		
		Person p3 = new Person ("301028200700778","James","Bond","01/02/82",'m',190.70,85.4);
		
		System.out.println(p3.toString());
		
		
		/* update first and last name*/
		
		p3.setfirstName("Jay");
		p3.setlastName("Kumar");
		
		System.out.println(p3.toString());
		
		
		p3.calculateBmi(p3.getHeight(),p3.getWeight());
		
		System.out.println("Bmi of"+ p3.getfirstName()+" "+ p3.getlastName()+" was "+p3.calculateBmi(p3.getHeight(),p3.getWeight()));
		
		/*now Jay Kumar is over weight*/
		
		p3.setWeight(105.2);
		p3.calculateBmi(p3.getHeight(),p3.getWeight());
		System.out.println(p3.toString());
		
		System.out.println("Bmi of"+ p3.getfirstName()+" "+ p3.getlastName()+" now is "+p3.calculateBmi(p3.getHeight(),p3.getWeight()));
	
		p1.setNid("S1203981025135");
		
		p2.setNid("D2154789632545");
		
		System.out.println("No of person in register is: "+ Person.getCounter());
		
		
		if(p1.equals(p2)) {
			System.out.println("Same person");
			
		}
		else {
			System.out.println("Different person");
		}
	
		int size = 0;
		
		
		 
		String nid = null;
		String firstName=null;
		String lastName=null;
		String dob=null;
		char gender='.';
		double height=0.0;
		double weight=0.0;
		
		
		
		
		System.out.println("Enter number of persons: ");
		size = keyboard.nextInt();
			
		Person[] dbaStudents = new Person[size];
			
		for( int i = 0; i <dbaStudents.length; i++) {
			
			System.out.println("Enter nid of student"+(i+1)+": ");
			 nid = keyboard.next();
			
			 System.out.println("Enter First name of student "+(i+1)+": ");
			 firstName = keyboard.next();
			 
			 System.out.println("Enter Last name of student "+(i+1)+": ");
			 lastName=keyboard.next();
			 
			 System.out.println("Enter date of birth of student "+(i+1)+": ");
			 dob = keyboard.next();
			 
			 System.out.println("Enter gender of student "+(i+1)+": ");
			 gender = keyboard.next().charAt(0);
			 
			 System.out.println("Enter height of student "+(i+1)+": ");
			 height = keyboard.nextDouble();
			 
			 System.out.println("Enter weight of student"+(i+1)+": ");
			 weight= keyboard.nextDouble();
		
		
			 dbaStudents[i]=new Person(nid,firstName,lastName,dob,gender,height,weight);
			 
		
		}
			for (int i = 0; i < dbaStudents.length; i++) {
			dbaStudents[i].calculateBmi();
			System.out.println("Bmi of student is"+dbaStudents[i].calculateBmi());
			
			
			}
}

}
