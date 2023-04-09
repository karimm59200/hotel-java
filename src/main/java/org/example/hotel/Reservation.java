package org.example.hotel;

import org.example.hotel.enums.Statut;

public class Reservation {
     private int numReservation;
     private Statut statut;
     private Client client;
     private Chambre chambre;

     public Reservation( int numReservation,  Client client, Chambre chambre){
          this.numReservation = numReservation;
          this.statut = Statut.VALIDEE;
          this.client = client;
          this.chambre = chambre;
     }

     public int getNumReservation() {
          return numReservation;
     }

     public void setNumReservation(int numReservation) {
          this.numReservation = numReservation;
     }

     public Statut getStatut() {
          return statut;
     }

     public void setStatut(Statut statut) {
          this.statut = statut;
     }

     public Client getClient() {
          return client;
     }

     public void setClient(Client client) {
          this.client = client;
     }

     public Chambre getChambre() {
          return chambre;
     }

     public void setChambre(Chambre chambre) {
          this.chambre = chambre;
     }

     public void displayDetails() {
          System.out.println(" Résertation :  " + numReservation + " statut: "+statut  );
          System.out.println(" Client: " + client.getFirstName() +  " " + client.getLastName() + " " + client.getTel());
          System.out.println(" Chambre : " + chambre.getIdRoom()+ " "+ chambre.getCapacity() + " " + chambre.getPrice());
     }

     public void cancel(){
          statut = Statut.ANNULEE;
          chambre.liberer();
     }
}
