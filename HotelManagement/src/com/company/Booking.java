package com.company;

import java.util.*;

public class Booking {

    private Customer customer;
    private Set<Rooms> room;
    private Hotel hotel;
    private Date from;
    private Date to;
    List<Rooms> availRoom;

    public Booking(Customer customer, Hotel hotel) {
        this.customer = customer;
        room = new HashSet<>();
        this.hotel = hotel;
        availRoom = new ArrayList<>();
    }

    public Date getFrom() {
        return from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

//    public Rooms dateForBooking(){
//        for (Rooms r : room){
//            if(r.isRoomStatus() == false){
//                return r;
//            }
//            else{
//                System.out.println("No rooms available");
//            }
//        }
//        return null;
//    }

    public void displayAvailableRooms() {
        System.out.println("Available Rooms:");

        for (Rooms room : hotel.getRoom()) {
            if(room.getRoomStatus()){
                availRoom.add(room);
                System.out.println(room);
            }

        }
    }

    public void arr(){
        for (Rooms r : availRoom){
            System.out.println(r);
        }
    }

//    public void bookRoom(Rooms room,Date from,Date to){
//
//    }



}
