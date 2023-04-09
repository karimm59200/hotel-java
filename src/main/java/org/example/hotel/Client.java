package org.example.hotel;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private int id;
    private String firstName;
    private String lastName;
    private String tel;

    private List<Reservation> reservations;

    public Client( String firstName, String lastName, String tel){

        this.firstName=firstName;
        this.lastName=lastName;
        this.tel=tel;
        this.reservations = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTel() {
        return tel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void displayDetails(){
        System.out.println( firstName + " "+ lastName + " numéro de télephone:"+ tel);
        if( reservations.size() == 0 ){
            System.out.println("Pas de réservation");
        } else {
            System.out.println("Réservations :");
            for (Reservation res: reservations) {
                res.displayDetails();
            }
        }
    }

    public void addBooking(Reservation reservation){
        reservations.add(reservation);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", tel='" + tel + '\'' +
                ", reservations=" + reservations +
                '}';
    }
}
