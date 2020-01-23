public class ValidityCheck {

	public static boolean isValidSSNR(String number) {

		int sum = 0;
		int x = 0;
		for (int i = 0; i < 10; ++i) {

			int a = Character.digit(number.charAt(i), 10);

			if ((i % 2) == 0) {

				if (a * 2 > 10) {
					x = ((a * 2) - 9);
					System.out.println(x);
					

				} else {
					x = a * 2;
					System.out.println(x);
				

				}
			}
			else 
			{

				System.out.println(x);
				x = a * 1;
				
			}
			sum = sum + x;
		}
		 if (sum % 10 == 0)
		 {
		System.out.println(sum);
			return true;
		} else {
			return false;
		}
	}

	public static boolean Checklength(String personNumber) {

		personNumber.length();

		if (personNumber.length() == 10) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		String personNumber = "9308101295";

		if (Checklength(personNumber))
		{

		if (isValidSSNR(personNumber)) 
        	{
				System.out.println("Giltigt nummer.");
			}
		else
		{
			System.out.println("Ej ett giltigt nummer.");
		}
	    } 
		
		else 
		{
			System.out.println("Ej ett giltigt nummer.");
		}

	}
	}	


	


