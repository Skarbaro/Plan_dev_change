package infrastructure.config;

import infrastructure.config.utils.StringUtils;

public class TestApp {
	
	private int selv;
	
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
}

/*!
 * Convert a timestamp into a date
 * (c) 2019 Chris Ferdinandi, MIT License, https://gomakethings.com
 * @param   {String|Integer}  timestamp  The timestamp in unix of YYYY-MM-DD HH:MM:SS format
 * @returns {String}                     A formatted date
 */
var formatDate = function (timestamp) {

	// Create a date object from the timestamp
	var date = new Date(timestamp);

	// Create a list of names for the months
	var months = ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October',	'November', 'December'];

	// return a formatted date
	return months[date.getMonth()] + ' ' + date.getDate() + ', ' + date.getFullYear();

};