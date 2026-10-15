package serverPackage1;

import java.io.IOException;
import java.io.*;
import java.net.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server1_2boucle {

    public static void main(String[] args) throws IOException {
        ServerSocket soketserveur1_1  = new ServerSocket(1234);

        System.out.print("Je suis un serveur en attente la connexion d'un client ");

        Socket socket  = soketserveur1_1.accept();
        System.out.print("\n un client est connecté");


        DataInputStream is= new DataInputStream(socket.getInputStream());
        DataOutputStream os = new DataOutputStream(socket.getOutputStream());

        while(true){

            int nb =is.readInt();
            if (nb == 0){
                System.out.println("\n b=0 la communication client serveur s'arret");
                break;
            }

            //traitement
            int resultat= nb*5;

            os.writeInt(resultat);
        }

        is.close();
        os.close();
        socket.close();
        soketserveur1_1.close();

    }
}
