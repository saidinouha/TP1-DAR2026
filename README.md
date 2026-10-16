# TP1 activité 1.1 ; connection client serveur

**nom & prenom : saidi nouha**
**class : LSI3 3.2**

## TP 1 ACTIVTE 1
### serveur:

![le code du serverPackage](screenshots/serveur.png)


la classe *serveur* se trouve dans le package "serverPackage1"
on a crée une "socketserveur" sur le port 1234
la methode *accept()* pour attendre la connextion d'un client, c'est une methode bloquante. le serveur est en ecoute pour le port 1234.
le serveur affiche un message "Je suis un serveur en attente la connexion d'un client" on attendat la connexion d'un client.
### le client
![le code du ClientPackage](screenshots/client.png)
la classe *Client* se trouve dans le package "clientPackage"
on a crée un objet Socket avec l'adresse du serveur 'localhost' zt le meme port  1234 que le serveur 
en executant le code on afiiche :
"Je suis un client pas encore connecté…" avant la creation du Socket, puis il affiche "je suis un client connecté" une fois la connexion est accepte pa r le serveur 

![le code du serverPackage apres la connexion](screenshots/serveur2.png)

### le serveur aprés la connexion 
une fois le client est connecté  la méthoode accecpt() se debloque et il affiche " un client est connecté"



![le Changement du nom du localhost par une adresse IP](screenshots/clientavecip.png)

###  test apres le Changement du nom du localhost par une adresse IP.
Le meme résultat  `localhost` est un nom qui est traduit en la LOOPBACK `127.0.0.1` : le client
contacte donc la même machine, mais en utilisant directement l'adresse.


on ferme la socket a la fin.

## TP 1 ACTIVTE 2 : Service de calculatrice

code serveur:
![code serveur](screenshots/act2-server.png)
code client:
![code client avec nb>0](screenshots/act2-client.png)
<br>
<br>
<p>resultat avec nb  negatif</p>

![nb négatif](screenshots/act2nbnegative.png)

<br>
<br>
<p>resultat avec nb=0</p>

![nb zéro](screenshots/act2nbzero.png)

Le client envoie un nombre nb , le serveur calcule nb*5 et le
renvoie. Pour x = 5 le résultat est 25, pour x = -8 il est -40 (le signe
est conservé grâce à <code> DataOutputStream.writeInt </code> qui envoie les 4 octets de
l'entier), et pour x = 0 le résultat est 0.

### version 2 : boucle
coté client 
![client boucle](screenshots/act2clientboucle.png)

coté serveur
![seveur boucle](screenshots/act2seveurboucle.png)


le client peut envoyer pleusieur entiers et receoi le resultat
le 0 se comporte comme un signal d'arret puisque le serveur sort du la boucle. puis le serveur et le client fermant les sockets.



## TP 1 ACTIVTE 3 : Amélioration sur le service de calculatrice

exercice 1

code serveur :





