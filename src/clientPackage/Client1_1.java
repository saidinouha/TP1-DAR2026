package clientPackage;

import java.io.IOException;
import java.net.Socket;

public class Client1_1 {

    public static void main(String[] args) throws IOException {
         System.out.print("Je suis un client pas encore connecté");


         Socket socket  = new Socket("127.0.0.1",1234);

         System.out.print("\n je suis un client connecté");


         //Fermer socket
        socket.close();



    }
}
