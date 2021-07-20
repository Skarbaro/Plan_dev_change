public class DifNumbers {

   public static void main(String[] args) {
	
	  private int difer;
	  
	  int num1 = 11, num2 = 10;
	  
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
            logger.log("PHONE NUMBER NOT FOUND");
        }
   }
   
}