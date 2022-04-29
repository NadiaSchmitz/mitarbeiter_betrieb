
public class Main {

	public static void main(String[] args) {

		Mitarbeiter pik = new Mitarbeiter("Pik", "Dok", 24965, 5000);
		Mitarbeiter lik = new Mitarbeiter("Lik", "Fler", 96745, 7000);
		
		System.out.printf(" %-10s %-10s %-10s %-10s", "Name", "Vorname", "PerNummer", "MonLohn, €");
		System.out.println();
		System.out.printf(" %-10s %-10s %-10s %-10s", pik.getName(), pik.getSurname(), pik.getPersonalnumber(), pik.getSalary());
		System.out.println();
		System.out.printf(" %-10s %-10s %-10s %-10s", lik.getName(), lik.getSurname(), lik.getPersonalnumber(), lik.getSalary());
		System.out.println();
		System.out.println();
		
		pik.salaryIncrease(50);
		lik.salaryIncrease(5);
		
		System.out.printf(" %-10s %-10s %-10s %-10s", "Name", "Vorname", "PerNummer", "MonLohn, €");
		System.out.println();
		System.out.printf(" %-10s %-10s %-10s %-10s", pik.getName(), pik.getSurname(), pik.getPersonalnumber(), pik.getSalary());
		System.out.println();
		System.out.printf(" %-10s %-10s %-10s %-10s", lik.getName(), lik.getSurname(), lik.getPersonalnumber(), lik.getSalary());
		System.out.println();
		
	}

}
