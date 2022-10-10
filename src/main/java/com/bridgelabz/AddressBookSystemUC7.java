package com.bridgelabz;

import java.util.ArrayList;

public class AddressBookSystemUC7 {


        public static void main(String[] args) {

            // UC-7 Ability to ensure there is no Duplicate
            //Entry of the same Person in a particular
            //Address Book - Duplicate Check is done on Person Name
            ArrayList<String> names = new ArrayList<>();

            names.add("Aaron");
            names.add("Fred");
            names.add("Jonas");


            for (int i = 0; i < names.size(); i++) {
                System.out.println("Name   : "+names.get(i));

            }
        }
    }
