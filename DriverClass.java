import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {

		Employee emp = new Employee("Harshit", "Choudhary");
		CredentialService credentialService = new CredentialService();
		String emailGenerated;
		char[] passwordGenerated;

		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();

		if (option == 1) {
			emailGenerated = credentialService.generateEmailAddress(emp.getFirstName().toLowerCase(),
					emp.getLastName().toLowerCase(), "tech");
			passwordGenerated = credentialService.generatePassword();
			credentialService.showCredentials(emp, emailGenerated, passwordGenerated);
		}

		else if (option == 2) {
			emailGenerated = credentialService.generateEmailAddress(emp.getFirstName().toLowerCase(),
					emp.getLastName().toLowerCase(), "adm");
			passwordGenerated = credentialService.generatePassword();
			credentialService.showCredentials(emp, emailGenerated, passwordGenerated);
		}

		else if (option == 3) {
			emailGenerated = credentialService.generateEmailAddress(emp.getFirstName().toLowerCase(),
					emp.getLastName().toLowerCase(), "hr");
			passwordGenerated = credentialService.generatePassword();
			credentialService.showCredentials(emp, emailGenerated, passwordGenerated);
		}

		else if (option == 4) {
			emailGenerated = credentialService.generateEmailAddress(emp.getFirstName().toLowerCase(),
					emp.getLastName().toLowerCase(), "lg");
			passwordGenerated = credentialService.generatePassword();
			credentialService.showCredentials(emp, emailGenerated, passwordGenerated);
		}

		else {
			System.out.println("Enter a valid option");
		}

		scanner.close();
	}
}
