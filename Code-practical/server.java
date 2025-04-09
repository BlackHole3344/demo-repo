

import java.io.IOException ;
import java.net.ServerSocket ; 
import java.net.Socket; 

public class server {
     
    public void run() {
        int port = 4000 ; 

        try (ServerSocket socket = new ServerSocket(port)) { 

            socket.setSoTimeout(10000); 
            while(true) {
                try {
    
                    System.out.println("Server is listening on port : " + port ); 
                    Socket acceptedConnections = socket.accept(); 

                    System.out.println("connected address" + acceptedConnections.getRemoteSocketAddress()); 
                    
                    
                } catch (Exception e) {
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        
        



        
    }

    

    public static void main(String[] args) {
        
    }
    
}
