public class DifNumbers {

   public static void main(String args[]) {
	
	  private int dif;
	  int num1 = 18;
	  int num2 = 17;
      dif = num1 - num3;
      System.out.println("Sum of these numbers: " + dif);
	  
		String inputString = "This is simple that contains phone number +380505055050 That's great.";
        String pattern = "(\\d+)";

        Pattern ptrn = Pattern.compile(pattern);
        Matcher matcher = ptrn.matcher(inputString);

        if(matcher.find()){
            logger.log("Phone number: " + matcher.group(1));
        }else {
            System.out.println("PHONE NUMBER NOT FOUND");
        }
   }
   
}