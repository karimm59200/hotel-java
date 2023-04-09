package org.example.hotel;


import java.util.Scanner;

public class IHM {

    private Hotel hotel;

    private boolean continuer;

    public IHM(Hotel hotel) {
        this.hotel = hotel;
        this.continuer = true;
    }

    Scanner s = new Scanner(System.in);

    public void displayMenu() {

        System.out.println("*********** bienvenue*************");
        System.out.println("1-- Ajouter la liste des clients");
        System.out.println("2-- Afficher la liste des clients");
        System.out.println("3-- Afficher les réservations d'un client");
        System.out.println("4-- Ajouter une réservation");
        System.out.println("5-- Annuler une réservation");
        System.out.println("6-- Afficher la liste des réservations");
        System.out.println(" entrez 0 pour quitter");

    }

    private void addClient() {
        System.out.println("*************Ajouter un client*************");
        System.out.println();
        System.out.println("Merci de saisir le prénom: ");
        s.nextLine();
        String prenom = s.nextLine();
        System.out.println("le nom : ");
        s.nextLine();
        String nom = s.nextLine();
        System.out.println("Merci d'indiquer le numéro de téléphone: ");
        String tel = s.nextLine();
        hotel.addClient(prenom, nom, tel);
        System.out.println("Client ajouté");

    }

    private void listeClient() {
        System.out.println("********Afficher la liste des clients*********");
        hotel.displayListClients();
    }

    private void addReservationClient() {
        System.out.println("************ Afficher les réservations d'un client************");
        System.out.println();
        System.out.println("Merci de saisir le numéro de téléphone du client: ");
        s.nextLine();
        String tel = s.nextLine();
        hotel.displayReservationClient(tel);
    }

    private void cancelBooking() {
        System.out.println("**********Annuler une réservation*******");
        System.out.println();
        System.out.println("Merci de saisir le numéro de réservation : ");
        int numReservation = s.nextInt();
        hotel.cancelReservation(numReservation);
    }

    private void displayBooking() {
        System.out.println("*********Afficher la liste des réservations********");
        hotel.displayReservation();
    }

    private void displayReservationClient() {
        System.out.println("==== Afficher les réservations d'un client ====");
        System.out.println();
        System.out.println("Merci de saisir le numéro de téléphone du client : ");
        s.nextLine();
        String tel= s.nextLine();
        hotel.displayReservationClient(tel);
    }


    public void start() {
        System.out.println("============== hotel ***** la nuit ===========");
        while (continuer) {
            displayMenu();
            int choix = s.nextInt();

            switch (choix) {
                case 0:
                    continuer = false;
                    break;
                case 1: addClient();
                    break;
                case 2: listeClient();
                    break;
                case 3: displayReservationClient();
                    break;
                case 4: addReservationClient();
                    break;
                case 5:cancelBooking();
                    break;
                case 6:displayBooking();
                    break;
                default :
                    System.out.println("Choix incorrecte ! ");
            }
        }

    }


}


