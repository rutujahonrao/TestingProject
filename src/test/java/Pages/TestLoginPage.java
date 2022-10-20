package Pages;

public class TestLoginPage {
	public static void main(String[] args) throws Throwable {
		LoginPage lp = new LoginPage();
		lp.getName("Vaishnavi");
		lp.getAge("20");
		lp.getSalary("50000");
		lp.getAddress("Solapur");lp.submit();
	}

}
