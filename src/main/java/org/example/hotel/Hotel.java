package org.example.hotel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Hotel {

    private String name;
    private List<Chambre> listechambres;
    private List<Reservation> listereservations;
    private List<Client> listeclients;




    public Hotel(){

    }




    public Hotel(String name){

        this.name= name;
        this.listechambres = new ArrayList<>();
        this.listereservations = new ArrayList<>();
        this.listeclients = new ArrayList<>();


        Random rdm = new Random();
        for (int i = 0; i <=20 ; i++) {
            double price = 50.0 + 50.0 * rdm.nextFloat();
            int capacity = 1 + rdm.nextInt(3);
            listechambres.add(new Chambre(i, price,capacity));

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Chambre> getListechambres() {
        return listechambres;
    }

    public void setListechambres(List<Chambre> listechambres) {
        this.listechambres = listechambres;
    }

    public List<Reservation> getListereservations() {
        return listereservations;
    }

    public void setListereservations(List<Reservation> listereservations) {
        this.listereservations = listereservations;
    }

    public List<Client> getListeclients() {
        return listeclients;
    }

    public void setListeclients(List<Client> listeclients) {
        this.listeclients = listeclients;
    }


    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", listechambres=" + listechambres +
                ", listereservations=" + listereservations +
                ", listeclients=" + listeclients +
                '}';
    }

    public void addClient(String prenom, String nom, String tel) {
        this.listeclients.add(new Client( prenom, nom, tel));
    }


    public void displayListClients() {
        if(listeclients.size() == 0 ){
            System.out.println(" pas de client enregistré ! ");
        } else {
            System.out.println(" Liste des clients: ");
            for ( Client client: listeclients) {
                client.displayDetails();
            }
        }
    }


    public void displayReservationClient(String tel) {
        Client client = searchClient(tel);
        if(client == null){
            System.out.println("Aucun client trouvé à partir de son numéro téléphone : " + tel);
        } else {
            client.displayDetails();
        }
    }

    private Client searchClient(String tel) {
        for ( Client client: listeclients) {
            if ( client.getTel().equals(tel)){
                return client;
            }
        }
        return null;
    }

    public void cancelReservation(int numReservation) {
        Reservation reservation = searchReservation(numReservation);
        if(reservation == null){
            System.out.println("Aucune réservation trouvée");
            return;
        }
        reservation.cancel();
        listereservations.remove(reservation);
        reservation.getClient().addBooking(reservation);
        System.out.println("la réservation a été annulé ! ");
    }

    private Reservation searchReservation(int numReservation) {
        for ( Reservation reservation: listereservations) {
            if(reservation.getNumReservation() == numReservation){
                return reservation;
            }
        }
        return null;
    }

    public void displayReservation() {
        if(listereservations.size() == 0){
            System.out.println("Aucune réservation enregistrée ! ");
        } else {
            for(Reservation reservation: listereservations){
                reservation.displayDetails();
            }
        }
    }


}
