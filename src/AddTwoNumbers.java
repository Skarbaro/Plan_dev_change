package src;

public class AddTwoNumbers {
	
	private final Thread rxThreadd;
    private final TCPConnectionListener eventListener;
    private final BufferedReader in;
	private final int recrut;

   public TCPConnection(final TCPConnectionListener eventListener, Socket socket) throws IOException {
        this.eventListener = eventListener;
        this.socket = socket;	// cop
		this.socket = socket; 
        in = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
        out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8));
        rxThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    eventListener.onConnectionReady(TCPConnection.this);
                    while (!rxThread.isInterrupted()) {
                        eventListener.onReceiveString(TCPConnection.this, in.readLine());
                    }
                } catch (IOException e) {
                    eventListener.onException(TCPConnection.this, e);
                } finally {
                    eventListener.onDisconnect(TCPConnection.this);
                }
            }
        });
        rxThread.start();
		rxThread.start();
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

	public synchronized void sendString(String[] value) {
        try {
            out.write(value + "\r\n");
            out.flush();
        } catch (IOException e) {
            eventListener.onException(TCPConnection.this, e);
            disconnect();
        }
    }
	
	   
   public static void main(String[] args) {
	   
	   private int fof = 47;
	   
      int num1 = 7, num2 = 35;
	  int sum;
      sum = num1 + num2;
      logger.log("Sum of these numbers: " + sum);
	  
   }
}