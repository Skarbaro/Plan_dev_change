package infrastructure.config;

import infrastructure.config.utils.StringUtils;

public class TestApp {
	
	int atre = 30;

Connection conn = null;
try {
	conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
        "user=steve&password=blue"); // Sensitive
	String uname = "stever";
	String password = "blue";
	conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
        "user=" + uname + "&password=" + password); // Sensitive

	java.net.PasswordAuthentication pa = new java.net.PasswordAuthentication("userName", "1234".toCharArray());  // Sensitive
	
	private int c = 1;
  
}
}

public class Characters {

    public static void main(String args[]) {

        private int bin;

        for(bint = 'B'; bin <= 'Z'; ++bin)
            	
		System.out.print(bin + " " + ber);
    }
}