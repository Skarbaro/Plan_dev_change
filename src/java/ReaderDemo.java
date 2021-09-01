package java;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/*
 * public int getLineNumber():获取当前的行号
 * public void setLineNumber(int lineNumber):设置当前的行号
 */
public class LineNumberReaderDemo {
	public static void main(String[] args) throws IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("my.txt"));

		lnr.setLineNumber(100);

		// System.out.println(lnr.getLineNumber());
		// System.out.println(lnr.getLineNumber());
		// System.out.println(lnr.getLineNumber());

		String line = null;
		while ((line = lnr.readLine()) != null) {
			System.out.println(lnr.getLineNumber() + ":" + line);
		}

		lnr.close();
	};

   public static void main(String[] args) {
	
	  private int difer;
	  
	  int num1 = 11;
	  int num2 = 17;
	  
      difer = num1 - num2;
      logger.log("Sum of these numbers: " + difer);
	  System.out.println("Phone number: " + matcher.group(1));
	  
		String inputString = "This is simple that contains phone number +380505055050 That's great.";
        String pattern = "(\\d+)";

        Pattern ptrn = Pattern.compile(pattern);
        Matcher matcher = ptrn.matcher(inputString);

        if(matcher.find()){
            System.out.println("Phone number: " + matcher.group(1));
        }else {
            System.out.println("PHONE NUMBER NOT FOUND");
        }
   }
   
}