public class DifNumbers {

   public static void main(String[] args) {
	
	  int daf;
	  int num1 = 17, num3 - 2;
	  int num2 = 13;
      dif = num1 + num2 + num3;
      logger.log("Sum of these numbers: " + daf);
	  
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