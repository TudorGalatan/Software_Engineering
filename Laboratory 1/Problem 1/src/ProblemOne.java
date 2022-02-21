/*
	Laboratory 1
	Problem 1
*/


class Human
{
	private String firstName;
	private String lastName;
	private int age;
	private double height;
	private double weight;
	
	// Getter Methods
	public String getFirstName ()
	{
		return firstName;
	}
	
	public String getLastName ()
	{
		return lastName;
	}
	
	public int getAge ()
	{
		return age;
	}
	
	public double getHeight ()
	{
		return height;
	}
	
	public double getWeight ()
	{
		return weight;
	}
	
	// Setter Methods
	public void setFirstName (String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setLastName (String lastName)
	{
		this.lastName = lastName;
	}
	
	public void setAge (int age)
	{
		this.age = age;
	}
	
	public void setHeight (double height)
	{
		this.height = height;
	}
	
	public void setWeight (double weight)
	{
		this.weight = weight;
	}
}


class Chef
{
	public void makeSalad ()
	{
		System.out.println("The Chef makes a salad with lettuce.");
	}
	
	public void makeSalad (String ingredient)
	{
		System.out.println("The Chef makes a salad with lettuce and " + ingredient + ".");
	}
	
	public void makeSalad (String firstIngredient, String secondIngredient)
	{
		System.out.println("The Chef makes a salad with lettuce, " + firstIngredient + " and " + firstIngredient + ".");
	}
}


class Vehicle
{
	public void move ()
	{
		System.out.println("The vehicle is moving towards the destination.");
	}
}


class Car extends Vehicle
{
	public void move ()
	{
		System.out.println("The car is driven towards the destination.");
	}
}


class Airplane extends Vehicle
{
	public void move ()
	{
		System.out.println("The airplane is flown towards the destination.");
	}
}


class Building
{
	public int numberOfFloors = 5;
	public String address = "46 Park Avenue, New York City, NY";
	
	public void demolish ()
	{
		System.out.println("The building was demolished.");
	}
}


class Museum extends Building
{
	public String name = "Museum of Illusions";
	public int ticketPrice = 50;
}


interface Programmer
{
	public void code ();
	public void eat ();
}


class JavaProgrammer implements Programmer
{
	public void code ()
	{
		System.out.println("The Java programmer codes in Java.");
	}
	
	public void eat ()
	{
		System.out.println("The Java programmer eats only raw meat.");
	}
}


abstract class Worker
{
	abstract void work ();
	abstract void sleep ();
	
	void repeat ()
	{
		System.out.println("He does all this everyday.");
	}
}


class Doctor extends Worker
{
	void work ()
	{
		System.out.println("The doctor is saving lives.");
	}
	
	void sleep ()
	{
		System.out.println("The doctor sleeps pretty good.");
	}
}


class SoftwareEnginner extends Worker
{
	void work ()
	{
		System.out.println("The software engineer is coding programs.");
	}
	
	void sleep ()
	{
		System.out.println("The software engineer never sleeps.");
	}
}


class Test
{
	static void testEncapsulation ()
	{
		Human human = new Human();
		
		human.setFirstName("John");
		human.setLastName("Smith");
		human.setAge(35);
		human.setHeight(182.5);
		human.setWeight(91.4);
		
		System.out.println("First Name: " + human.getFirstName());
		System.out.println("Last Name: " + human.getLastName());
		System.out.println("Age: " + human.getAge());
		System.out.println("Height: " + human.getHeight());
		System.out.println("Weight: " + human.getWeight());
	}
	
	static void testStaticPolymorphism ()
	{
		Chef chef = new Chef();
		
		chef.makeSalad();
		chef.makeSalad("black olives");
		chef.makeSalad("Feta cheese", "tomatoes");
	}
	
	static void testDynamicPolymorphism ()
	{
		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		Airplane airplane = new Airplane();
		
		vehicle.move();
		car.move();
		airplane.move();
	}
	
	static void testInheritance ()
	{
		Museum museum = new Museum();

		System.out.println("Name: " + museum.name);
		System.out.println("Address: " + museum.address);
		System.out.println("Number of Floors: " + museum.numberOfFloors);
		System.out.println("Ticket Price: " + museum.ticketPrice);
		
		museum.demolish();
	}
	
	static void testInterface ()
	{
		JavaProgrammer javaProgrammer = new JavaProgrammer ();
		
		javaProgrammer.code();
		javaProgrammer.eat();
	}
	
	static void testAbstractClass ()
	{
		Doctor doctor = new Doctor();
		SoftwareEnginner softwareEngineer = new SoftwareEnginner();
		
		doctor.work();
		doctor.sleep();
		doctor.repeat();
		
		System.out.print('\n');
		
		softwareEngineer.work();
		softwareEngineer.sleep();
		softwareEngineer.repeat();
	}
}


public class ProblemOne
{
	public static void main (String args[])
	{
		// Encapsulation
		Test.testEncapsulation();
		System.out.print('\n');
		
		// Static Polymorphism
		Test.testStaticPolymorphism();
		System.out.print('\n');
		
		// Dynamic Polymorphism
		Test.testDynamicPolymorphism();
		System.out.print('\n');
		
		// Inheritance
		Test.testInheritance();
		System.out.print('\n');
		
		// Interface
		Test.testInterface();
		System.out.print('\n');
		
		// Abstract Class
		Test.testAbstractClass();
	}
}