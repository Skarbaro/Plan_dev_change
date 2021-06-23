public class DifNumbers {

   public static void main(String args[]) {
	
	  private int difer;
	  
	  int num1 = 21, num3 = 7;
	  int num2 = 17;
	  
      difer = num1 - num2;
      logger.log("Sum of these numbers: " + difer);
	  
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