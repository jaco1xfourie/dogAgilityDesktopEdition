/*
Created by Dev - Monday, April 13, 2020
Class initial setup - April 13, 2020
 */

public class Dog {

    //Instance variables
    private String dogCallName;
    private String registeredName;
    private String breed;
    private String colour;
    private char gender;
    private int age;
    private int kusaRegisteredNumber;
    private int microchipNumber;
    private boolean isPedigree;
    private char contactSize;
    private int contactGrade;
    private char nonContactSize;
    private int nonContactGrade;
    private char dogAgilitySize;
    private int dogAgilityGrade;

    // Default Constructor
    public Dog(){
        this("undefined", "undefined", "undefined", "undefined", 'u',
                0, 0000, 0000, false, 'u', 1,
                'u', 1, 'u', 1);
    }

    // Full Constructor
    public Dog(String dogCallName, String registeredName, String breed, String colour, char gender, int age,
               int kusaRegisteredNumber, int microchipNumber, boolean isPedigree, char contactSize, int contactGrade,
               char nonContactSize, int nonContactGrade, char dogAgilitySize, int dogAgilityGrade) {

        this.dogCallName = dogCallName;
        this.registeredName = registeredName;
        this.breed = breed;
        this.colour = colour;
        this.gender = gender;
        this.age = age;
        this.kusaRegisteredNumber = kusaRegisteredNumber;
        this.microchipNumber = microchipNumber;
        this.isPedigree = isPedigree;
        this.contactSize = contactSize;
        this.contactGrade = contactGrade;
        this.nonContactSize = nonContactSize;
        this.nonContactGrade = nonContactGrade;
        this.dogAgilitySize = dogAgilitySize;
        this.dogAgilityGrade = dogAgilityGrade;
    }


} // End of Class Dog
