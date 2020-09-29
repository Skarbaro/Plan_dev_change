package src;

public class AddTwoNumbers {
	
	private final Thread rxThreadd;
    private final TCPConnectionListener eventListener;
	private int code1;
	
	public static void main(String args[]) {
	   
      int num1 = 7, num2 = 35;
	  int sum;
      sum = num1 + num2;
      logger.log("Sum of these numbers: " + sum);
	  
   }
   
   public synchronized void sendString(String value[]) {
        try {
            out.write(value + "\r\n");
            out.flush();
        } catch (IOException e) {
            eventListener.onException(TCPConnection.this, e);
            disconnect();
        }
    }

	public synchronized void sendString(String[] value) {
        try {
            out.write(value + "\r\n");
            out.flush();
        } catch (IOException e) {
            eventListener.onException(TCPConnection.this, e);
            disconnect();
        }
    }
	
	   
   
}