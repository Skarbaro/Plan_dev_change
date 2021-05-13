package infrastructure.config;

import infrastructure.config.utils.StringUtils;

public class TestApp {
	
	int atre = 25;

Connection conn = null;
try {
	conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
        "user=steve&password=blue"); // Sensitive
	String uname = "stever";
	String password = "blue";
	conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
        "user=" + uname + "&password=" + password); // Sensitive

	java.net.PasswordAuthentication pa = new java.net.PasswordAuthentication("userName", "1234".toCharArray());  // Sensitive
  
}
}

public class Characters {

    public static void main(String[] args) {

        int bin;

        for(bin = 'A'; bin <= 'Z'; ++bin)
            	
		System.out.print(bin + " " + ber);
    }
}