package serverPackage1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server1_1 {

    public static void main(String[] args) throws IOException {
        ServerSocket soketserveur1_1  = new ServerSocket(1234);

        System.out.print("Je suis un serveur en attente la connexion d'un client ");

        Socket socket  = soketserveur1_1.accept();
        System.out.print("\n un client est connecté");

        socket.close();
        soketserveur1_1.close();

    }
}
