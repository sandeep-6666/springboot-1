package com.sandeep.demo.store;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;

@Entity
public class Store {

    @Id
    @GeneratedValue

    int id;

    String Name;

    int age;
    @Email(message = "not valid")
    public String Email;

    int Phone;
    String catagery;


    public String getCatagery() {return catagery;}

    public void setCatagery(String catagery) {this.catagery = catagery;}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }
}