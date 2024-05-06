package ru.otus.homework4;

public class User {
    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurName() {
        return surName;
    }

    public User setSurName(String surName) {
        this.surName = surName;
        return this;
    }

    public String getFatherName() {
        return fatherName;
    }

    public User setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public int getBirthday() {
        return birthday;
    }

    public User setBirthday(int birthday) {
        this.birthday = birthday;
        return this;
    }

    public String getMail() {
        return mail;
    }

    public User setMail(String mail) {
        this.mail = mail;
        return this;
    }

    private String name;
    private String surName;
    private String fatherName;
    private int birthday;
    private String mail;

    public User(String name, String surName, String fatherName, int birthday, String mail) {
        this.name = name;
        this.surName = surName;
        this.fatherName = fatherName;
        this.birthday = birthday;
        this.mail = mail;
    }

    public void userInfo(){
        System.out.println("ФИО: " + surName + " " + name + " " + fatherName);
        System.out.println("Год рождения: " + birthday);
        System.out.println("e-mail: " + mail);
    }
}
