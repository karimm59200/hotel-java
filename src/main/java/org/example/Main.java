package org.example;

import org.example.hotel.Hotel;
import org.example.hotel.IHM;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        Hotel hotel = new Hotel(" chez wam");
        IHM ihm = new IHM(hotel);
        ihm.start();
    }
}