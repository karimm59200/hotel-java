package org.example.hotel;

import org.example.hotel.enums.Statut;

import java.math.BigDecimal;

public class Chambre {

    private int idRoom;
    private Statut statut;
    private double price;
    private int capacity;

    public Chambre(int idRoom,  double price, int capacity){
        this.idRoom= idRoom;
        this.statut= Statut.LIBRE;
        this.price=price;
        this.capacity=capacity;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public Statut getStatut() {
        return statut;
    }

    public double getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void liberer() {
        statut = Statut.LIBRE;
    }
    @Override
    public String toString() {
        return "Chambre{" +
                "idRoom=" + idRoom +
                ", statut=" + statut +
                ", price=" + price +
                ", capacity=" + capacity +
                '}';
    }


}
