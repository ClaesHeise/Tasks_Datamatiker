package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.*;
import java.util.*;


public class Main
{
    static Scanner scan;
    private static String[] text;

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        //System.out.println(text.length);

        //printWordsStartingWith("Ø");

        //printWordsOfLength(3);


        //test dine metoder ved at kalde dem her:
        System.out.println("\nTask 1 - the longest word in existence:");
        printLongestWord();

        System.out.println("\nTask 2 - only half of each word:");
        printFirstHalfOfEachWord();

        System.out.println("\n\nTask 3 - the most frequent letters, in order:");
        printMostFrequentLetters();

        System.out.println("\nTask 4 - the less frequent letters, in order:");
        printLessFrequentLetters();

    }

    private static void printWordsOfLength(int l)
    {
        boolean wordisvalid = true;

        for (String s : text)
        {
            if (s.length() == l)
            {
                if (s.contains(",") || s.contains("."))
                {
                    wordisvalid = false;
                }

                if (wordisvalid)
                {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern)
    {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase()))
            {
                System.out.println(s);
            }
        }
    }

    //skriv dine metoder herunder:
    private static void printLongestWord(){
        String longestWord = "";
        for (String s : text){
            if (s.length() > longestWord.length()){
                longestWord = s;
            }
        }
        System.out.println("Longest word being: "+longestWord);
    }

    private static void printFirstHalfOfEachWord(){
        int endIndex;
        for (String s : text){
            endIndex = (int) Math.floor(s.length()/2);
            System.out.printf(s.substring(0, endIndex)+", ");
        }
    }

    private static void printMostFrequentLetters(){
        ArrayList<ArrayList<Object>> chars = new ArrayList<>();
        ArrayList<Object> innerList = new ArrayList<>();
        int value;
        String alphabet = "abcdefghijklmnopqrstuvwxyzæøå";
        for(int i = 0; i < 29; i++) {
            innerList.add(alphabet.charAt(i));
            innerList.add(0);
            chars.add(innerList);
            innerList = new ArrayList<>();
        }
        for (String s : text){
            for(int i = 0; i < s.length(); i++){
                Character c = (s.toLowerCase()).charAt(i);
                for(int j = 0; j < chars.size(); j++){
                    if(c.equals(chars.get(j).get(0))){
                        value = (int) chars.get(j).get(1);
                        value += 1;
                        chars.get(j).set(1, value);
                    }
                }
            }
        }
        char frequentLetter = 'a';
        int letterAmount;
        int index = 0;
        for(int i = 0; i < 10; i++){
            letterAmount = 0;
            for(int j = 0; j < chars.size(); j++) {
                if ((int) chars.get(j).get(1) > letterAmount) {
                    letterAmount = (int) chars.get(j).get(1);
                    frequentLetter = (char) chars.get(j).get(0);
                    index = j;
                }
            }
            chars.remove(index);
            System.out.println("On seat "+(i+1)+". is: "+frequentLetter+", with "+letterAmount+" times written.");
        }
    }

    private static void printLessFrequentLetters(){
        ArrayList<ArrayList<Object>> chars = new ArrayList<>();
        ArrayList<Object> innerList = new ArrayList<>();
        int value;
        String alphabet = "abcdefghijklmnopqrstuvwxyzæøå";
        for(int i = 0; i < 29; i++) {
            innerList.add(alphabet.charAt(i));
            innerList.add(0);
            chars.add(innerList);
            innerList = new ArrayList<>();
        }
        for (String s : text){
            for(int i = 0; i < s.length(); i++){
                Character c = (s.toLowerCase()).charAt(i);
                for(int j = 0; j < chars.size(); j++){
                    if(c.equals(chars.get(j).get(0))){
                        value = (int) chars.get(j).get(1);
                        value += 1;
                        chars.get(j).set(1, value);
                    }
                }
            }
        }
        char frequentLetter = 'a';
        int letterAmount;
        int index = 0;
        for(int i = 0; i < 10; i++){
            letterAmount = (int) chars.get(0).get(1);
            for(int j = 0; j < chars.size(); j++) {
                if ((int) chars.get(j).get(1) < letterAmount) {
                    letterAmount = (int) chars.get(j).get(1);
                    frequentLetter = (char) chars.get(j).get(0);
                    index = j;
                }
            }
            chars.remove(index);
            System.out.println("On seat "+(i+1)+". is: "+frequentLetter+", with "+letterAmount+" times written.");
        }
    }

}

