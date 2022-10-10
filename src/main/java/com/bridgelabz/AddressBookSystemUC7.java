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

            names.add("Aaron");
            Address.add("California");

            names.add("Fred");
            Address.add("Arizona");
            names.add("Jonas");
            Address.add("NewYork");


            for (int i = 0; i < names.size(); i++) {
                System.out.println("Name   : "+names.get(i));
                System.out.println("Address: "+Address.get(i));
            }
        }
    }
