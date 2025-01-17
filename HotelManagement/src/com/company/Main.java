package com.company;

public class Main {

    public static void main(String[] args) {

        //1. Hotel setup
        //2. Add Rooms in hotel
        //3. Add one Customer in hotel
        //4. Customer request for booking..means find operation (from date, end date, no of guest)
        //5. System checks and display available rooms for provided dates along with total price
        //6. Create a logic to select available room from 5th step. and confirm the booking

        //1. Hotel setup
        //2. Add Rooms in hotel
        //3. Add two Customer (C1 and C2) in hotel
        //4. C1 Customer request for booking..means find operation (from date, end date, no of guest)
        //5. System checks and display available rooms for provided dates along with total price
        //6. Create a logic to select available room from 5th step. and confirm the booking
        //7. C2 request for booking for same date which c1 has booked
        //8. System checks and display available rooms for provided dates along with total price
        //9. Create a logic to select available room from 5th step. and confirm the booking

        //1. Hotel setup
        //2. Add Rooms in hotel
        //3. Add two Customer (C1 and C2) in hotel
        //4. C1 Customer request for booking..means find operation (from date, end date, no of guest)
        //5. System checks and display available rooms for provided dates along with total price
        //6. Create a logic to select available room from 5th step. and confirm the booking
        //7. C2 request for booking for any date
        //8. System checks and display available rooms for provided dates along with total price
        //9. Create a logic to select available room from 5th step. and confirm the booking


        Hotel myHotel = new Hotel("Taj Hotel");
        myHotel.setHotelAddress("278/A/2, lal darwaja, station road Surat. Gujarat 395003");
        myHotel.setFeatures("Free Cancellation" + "\n\t" +"Book without advance payment" +"\n\t" +"Breakfast available at extra charges" +
                "\n\t" +"Property with stylish rooms ");


        System.out.println("---------------------------------");
        System.out.println("Hotel name : "+myHotel.getHotelName());
        System.out.println("Address : "+myHotel.getHotelAddress());
        System.out.println("");
        System.out.println("Features : "+myHotel.getFeatures());
        System.out.println("");


        //Room creation
        Rooms room1 = new SingleBed("A101", 2500, 2, 400,true,"SingleBed");
        Rooms room2 = new DoubleBed("A102", 5000, 5, 700,false,"DoubleBed");
        Rooms room3 = new SuiteRoom("A102", 5000, 5, 700,true,"Suite");
        Rooms room4 = new DoubleBed("A102", 5000, 5, 700,false,"DoubleBed");
        Rooms room5 = new SingleBed("A102", 5000, 5, 700,true,"SingleBed");

        //Customer objects
        Customer c1 = new Customer(101,"c1","c1@gmail.com",120120120,"User","Male");
        Customer c2 = new Customer(102,"c2","c2@gmail.com",121212,"User","Female");
        Customer c3 = new Customer(102,"c2","c2@gmail.com",121212,"User","Female");

        //Rooms added to hotel
        myHotel.addRoom(room1);
        myHotel.addRoom(room2);
      //  myHotel.addRoom(room1);           //duplicate room will not be added because of set interface

        //add customer to the hotel
        myHotel.addCustomer(c1);
        myHotel.addCustomer(c2);
        myHotel.addCustomer(c3);
        System.out.println("");

        System.out.println("--------------Bookings------------------");
        Booking booking1 = new Booking(c1,myHotel);
        booking1.displayAvailableRooms();
        System.out.println("");
        booking1.arr();


        //list of all rooms
        System.out.println("-----------Rooms Details-------------");
        myHotel.allRooms();
        System.out.println("");

        //list of all customers
        System.out.println("-----------Customer Details-------------");
        myHotel.customerDetails();
        System.out.println("");
    }
}
