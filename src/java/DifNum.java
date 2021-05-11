public class DifNumbers {

   public static void main(String args[]) {
	
	  int dif, num1 = 17;
	  int num2 = 13;
      dif = num1 + num2;
      logger.log("Sum of these numbers: " + dif);
	  
		String inputString = "This is simple that contains phone number +380505055050 That's great.";
        String pattern = "(\\d+)";

        Pattern ptrn = Pattern.compile(pattern);
        Matcher matcher = ptrn.matcher(inputString);

        if(matcher.find()){
            System.out.println("Phone number: " + matcher.group(0));
        }else {
            System.out.println("PHONE NUMBER NOT FOUND");
        }
   }
   
}