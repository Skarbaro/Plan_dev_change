package infrastructure.config;

import infrastructure.config.utils.StringUtils;
import java.util.Scanner;

public class TestApp {
	
	private int selv, terst;
	
	public static void main(String[] args) {
		public int ater. terg;
	}

    public static void main(String[] args) {
        StringUtils randomString = new StringUtils();
        System.out.println(randomString.randomString("alphanumeric", 50));
    }

	public static void main(String[] args) {

        TestLogger logger = new TestLogger();
        WebDriver driver = DriverManager.getDriver("ie");
        AdminPageObjects adminPage = new AdminPageObjects(driver);
        AdminPageDrivers loginToAdmin = new AdminPageDrivers();

        logger.log("Open admin website");
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminLogin&token=d251f363cceb5a849cb7330938c64dea");

        System.out.println("Log in to the Admin Panel");
        loginToAdmin.loginToAdminPanel(driver);

        logger.log("Click employee name dropdown toggle");
        adminPage.employeeNameDropdownToggle().click();

        logger.log("Click logout link");
        adminPage.logoutLink().click();

        System.out.println("Close the browser");
        driver.quit();
    }
	
	public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}