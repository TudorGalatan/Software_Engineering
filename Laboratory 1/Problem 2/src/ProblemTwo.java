import java.util.Vector;


class Person
{
	private String firstName;
	private String lastName;
	private int personalID;
	
	public Person ()
	{
	    super();
	}
	
	public Person (String firstName, String lastName, int personalID)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.personalID = personalID;
	}
	
	public String getFirstName ()
	{
		return firstName;
	}
	
	public String getLastName ()
	{
		return lastName;
	}
	
	public int getPersonalID ()
	{
		return personalID;
	}
}


class Doctor extends Person
{
	public String speciality;
	
	Vector <Patient> patients = new Vector <> ();
	
	public Doctor (String firstName, String lastName, int personalID, String speciality, Vector <Patient> patients)
	{
		super(firstName, lastName, personalID);
		this.speciality = speciality;
		this.patients = patients;
	}
	
	public String getSpeciality ()
	{
		return speciality;
	}
	
	void addPatient (Patient patient)
	{
		patients.add(patient);
	}
	
	Patient getPacient (int index)
	{
		return patients.elementAt(index);
	}
}


class Patient extends Person
{
	private String disease;
	
	public Patient (String firstName, String lastName, int personalID, String disease)
	{
		super(firstName, lastName, personalID);
		this.disease = disease;
	}
	
	public String getDisease ()
	{
		return disease;
	}
}


public class ProblemTwo
{
	public static void main (String args[])
	{
		Patient firstPatient = new Patient ("Mihai", "Ion", 100, "cancer");
		Patient secondPatient = new Patient ("John", "Popescu", 100, "COVID");
		Patient thirdPatient = new Patient ("George", "Ionescu", 100, "cancer");
		Patient fourthPatient = new Patient ("Elena", "Vladimir", 100, "COVID");
		Patient fifthPatient = new Patient ("Maria", "Georgescu", 100, "COVID");
		Patient sixthPatient = new Patient ("Ioana", "Constantinescu", 100, "COVID");
		
		Vector <Patient> firstPatients = new Vector <> ();
		Vector <Patient> secondPatients = new Vector <> ();
		
		firstPatients.add(firstPatient);
		firstPatients.add(secondPatient);
		firstPatients.add(thirdPatient);
		
		secondPatients.add(fourthPatient);
		secondPatients.add(fifthPatient);
		secondPatients.add(sixthPatient);
		
		Doctor firstDoctor = new Doctor("Vlad", "George", 100, "cardiology", firstPatients);
		Doctor secondDoctor = new Doctor("Mihai", "Andrei", 100, "dermatology", secondPatients);
		
		System.out.println("First Doctor:\n");
		System.out.println("Name: " + firstDoctor.getFirstName() + " " + firstDoctor.getLastName());
		System.out.println("Personal ID: " + firstDoctor.getPersonalID());
		System.out.println("Speciality: " + firstDoctor.getSpeciality());
		for (int index = 0; index < firstDoctor.patients.size(); index++)
			System.out.println("Patient " + (index + 1) + ": " + firstDoctor.getPacient(index).getFirstName() + " "
					+ firstDoctor.getPacient(index).getLastName() +
					", " + firstDoctor.getPacient(index).getDisease());
		
		System.out.println("\n");
		
		System.out.println("Second Doctor:\n");
		System.out.println("Name: " + secondDoctor.getFirstName() + " " + secondDoctor.getLastName());
		System.out.println("Personal ID: " + secondDoctor.getPersonalID());
		System.out.println("Speciality: " + secondDoctor.getSpeciality());
		for (int index = 0; index < secondDoctor.patients.size(); index++)
			System.out.println("Patient " + (index + 1) + ": " + secondDoctor.getPacient(index).getFirstName() + " "
					+ secondDoctor.getPacient(index).getLastName() +
					", " + secondDoctor.getPacient(index).getDisease());
	}
}