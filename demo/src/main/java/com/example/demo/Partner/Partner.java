package com.example.demo.Partner;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.demo.User.User;

@Entity
public class Partner {
    private int id;
    private String name;
    private String dateOfBirth;
    private String phoneNumber;
    private String address;
    private String email;

    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name = "userid", nullable = false)
    //private User user;

    

    public Partner(int id, String name, String dateOfBirth, String phoneNumber, String address, String email,
            User user) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        //this.user = user;
    }

    
    public Partner(String name, String dateOfBirth, String phoneNumber, String address, String email, User user) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        //this.user = user;
    }


    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    // public User getUser() {
    //     return user;
    // }
    // public void setUser(User user) {
    //     this.user = user;
    // }

    

}
