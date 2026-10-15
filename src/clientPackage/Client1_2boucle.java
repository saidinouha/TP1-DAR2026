package clientPackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client1_2boucle {

    public static void main(String[] args) throws IOException {
        System.out.print("Je suis un client pas encore connecté");


        Socket socket  = new Socket("127.0.0.1",1234);

        System.out.print("\n je suis un client connecté");

        DataOutputStream os = new DataOutputStream(socket.getOutputStream());
        DataInputStream is= new DataInputStream(socket.getInputStream());

        Scanner sc = new Scanner(System.in);
        int nb;
        do {

            System.out.print("entrer l'entier :  ");
            nb = sc.nextInt();
            os.writeInt(nb);
            if( nb!=0){
                int resultat = is.readInt();
                System.out.println("Résultat (" + nb + "*5) = :  " + resultat);
            }
        }while(nb != 0);
        System.out.println("la communication serveur client s'arrete ");



        sc.close();
        is.close();
        os.close();
        socket.close();

    }
}
