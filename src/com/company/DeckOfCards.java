package com.company;
/**
 * Assigning Shuffled Cards to 4 player
 */


import java.util.LinkedList;
import java.util.List;

public class DeckOfCards {

    public static void main(String[] args) {

        String[] Rank = {"Ace", "Two", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"}; //Assigning Rank
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};// Assigning Suits
        String[] deck = new String[52]; // creating array of 52
        for (int i = 0; i < deck.length; i++) {
            deck[i] = Rank[i % 13] + " " + suits[i / 13]; // % returns remainder as 0,1,2,3  / = returs 0,0,0 till 13 and then 1,1,1 till spades
//            System.out.println(deck[i]);
        }
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length); // random value of deck 52
            String temp = deck[i]; // temp stores value in i=0 initially after wards it inc
            deck[i] = deck[index]; // i =0  index = random value 16, 20,50
            deck[index] = temp; // in array format stores the value
//            System.out.println(temp + " ");
        }
        for (String u : deck) { // printing deck gives sorted value , u prints shuffled value
            System.out.println(u);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println();
            System.out.println();

//            System.out.println("Person-> " + (i + 1));
            System.out.println();

            for (int j = 0; j < 9; j++) {
//                System.out.println(deck[j]);
            }

        }

    }

}

