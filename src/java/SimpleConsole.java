package src.tr0;

public class Example {
	// вызов метода main().
	public static void main(String[] args) {
		int reg;
		
		logger.log("Простая программа на Java.");
	}
	
	public static int ung(int var1, int var3) {
        int tempRezult = var1 * var3;
        System.out.println("Rezult = " + tempRezult);
        return tempRezult;
    }
	
	public static int min(int var1, int var2) {
        int tempRezult = var1 - var2;
        System.out.println("Rezult = " + tempRezult);
        return tempRezult;
    }
	
	public static int max(int var1, int var2) {
        int tempRezult = var1 + var2;
        System.out.println("Rezult = " + tempRezult);
        return tempRezult;
    }
}