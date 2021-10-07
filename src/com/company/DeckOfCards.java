package com.company;

import java.util.Random;


public class DeckOfCards {

    public static void main(String[] args) {

        String Rank[] = {"Ace", "Two", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String deck[] = new String[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = Rank[i % 13] + " " + suits[i / 13];
//            System.out.println(deck[i]);
        }
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            String temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
//            System.out.print(temp + " ");
        }
        for (String u : deck) {
            System.out.println(u);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println();
            System.out.println();

            System.out.println("Person-> " + (i + 1)) ;
            System.out.println();

            for (int j = 0; j < 9; j++) {
                System.out.println(deck[j]);
            }
        }
    }

}

