package com.bridgelabz;

import java.util.ArrayList;

public class AddressBookSystemUC7 {


        public static void main(String[] args) {

            // UC-7 Ability to ensure there is no Duplicate
            //Entry of the same Person in a particular
            //Address Book - Duplicate Check is done on Person Name
            ArrayList<String> names = new ArrayList<>();

            //UC-8 Ability to search Person in a City or State across
            //the  AddressBook - Search Result can show

            ArrayList<String> Address=new ArrayList<>();

            //UC-9 Ability to view Persons by City or State -
            // Maintain Dictionary of City and Zipcode
            ArrayList<String> zipCode=new ArrayList<>();

            //UC-10 Ability to get number of contact persons i.e.
            //count by City or State
            ArrayList<String> ContactNumber = new ArrayList<>();

            System.out.println("---------Welcome to the Address BooK---------");

            names.add("Aaron");
            Address.add("California");
            zipCode.add("678997");
            ContactNumber.add("0845 50 50 50");
            names.add("Fred");
            Address.add("Arizona");
            zipCode.add("746506");
            ContactNumber.add("00 49 12345");
            names.add("Jonas");
            Address.add("NewYork");
            zipCode.add("994567");
            ContactNumber.add("890 67 56 666");



            for (int i = 0; i < names.size(); i++) {
                System.out.println("Name   : "+names.get(i));
                System.out.println("Address: "+Address.get(i));
                System.out.println("zipcode: "+zipCode.get(i));
                System.out.println("Number: " + ContactNumber.get(i));
            }
        }
    }
