
public class Mitarbeiter {

	private String name;
	private String surname;
	private int personalnumber;
	private int salary;
	
	public Mitarbeiter() {
		
	}
	
	public Mitarbeiter(String name, String surname, int personalnumber, int salary) {
		this.name = name;
		this.surname = surname;
		this.personalnumber = personalnumber;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getPersonalnumber() {
		return personalnumber;
	}
	
	public void setPersonalnumber(int personalnumber) {
		this.personalnumber = personalnumber;
	} 
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	} 
	
	public void salaryIncrease(int prozent) {
		salary = salary + salary * prozent / 100;
	}
	
}
