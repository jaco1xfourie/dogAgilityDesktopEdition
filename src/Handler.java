/*
Created by Dev - Monday, April 13, 2020
Class initial setup - April 13, 2020

Update - April 15, 2020
    created constructors
 */

public class Handler {

    //Instance variables for Handler Class
    private String name;
    private String surname;
    private String emailAddress;
    private String dateOfBirth;
    private String address;
    private String province;
    private String registeredClubs;

    private char gender;

    private int age;
    private int contact_number;
    private int kusaMemberNumber;

    private boolean isJudge;

    public Handler() {
        // Default values if empty constructor is called
        this("undefined","undefined","undefined","undefined","undefined",
                "undefined","undefined",'u',0,0000000000,
                00000,false);
    }
    public Handler(String name, String surname, String emailAddress, String dateOfBirth, String address,
                   String province, String registeredClubs, char gender, int age, int contact_number,
                   int kusaMemberNumber, boolean isJudge){
        this.name = name;
        this.surname = surname;
        this.emailAddress = emailAddress;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.province = province;
        this.registeredClubs = registeredClubs;
        this.gender = gender;
        this.age = age;
        this.contact_number = contact_number;
        this.kusaMemberNumber = kusaMemberNumber;
        this.isJudge = isJudge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getRegisteredClubs() {
        return registeredClubs;
    }

    public void setRegisteredClubs(String registeredClubs) {
        this.registeredClubs = registeredClubs;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getContact_number() {
        return contact_number;
    }

    public void setContact_number(int contact_number) {
        this.contact_number = contact_number;
    }

    public int getKusaMemberNumber() {
        return kusaMemberNumber;
    }

    public void setKusaMemberNumber(int kusaMemberNumber) {
        this.kusaMemberNumber = kusaMemberNumber;
    }

    public boolean isJudge() {
        return isJudge;
    }

    public void setJudge(boolean judge) {
        isJudge = judge;
    }

    //nothing to see
}
