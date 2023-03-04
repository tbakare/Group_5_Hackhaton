package com.example.demo.User;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.Partner.Partner;
import com.example.demo.Security.Authority;
import com.example.demo.Visit.Visit;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "users")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class User {
    private int userid;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String healthCareNumber;
    private String threatyNo;
    private String phoneNumber;
    private String address;
    private String email;
    
    // @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    // private Partner partner;
    
    // @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    // private Set<Visit> visits;

    

    public User() {
    }


    public User(int id, String username, String password, String firstName, String lastName, String healthCareNumber,
            String threatyNo, String phoneNumber, String address, String email) {
        this.userid = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.healthCareNumber = healthCareNumber;
        this.threatyNo = threatyNo;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
    }

    
    public User(String username, String password, String firstName, String lastName, String healthCareNumber,
            String threatyNo, String phoneNumber, String address, String email ) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.healthCareNumber = healthCareNumber;
        this.threatyNo = threatyNo;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
    }

    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    public int getUserid() {
        return userid;
    }
    public void setUserid(int id) {
        this.userid = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getHealthCareNumber() {
        return healthCareNumber;
    }
    public void setHealthCareNumber(String healthCareNumber) {
        this.healthCareNumber = healthCareNumber;
    }
    public String getThreatyNo() {
        return threatyNo;
    }
    public void setThreatyNo(String threatyNo) {
        this.threatyNo = threatyNo;
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

    // public Set<Visit> getVisits() {
    //     return visits;
    // }

    // // @OneToMany (cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy= "user")
    // public void setVisits(Set<Visit> visits) {
    //     this.visits = visits;
    // }


    //@OneToMany (cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy= "user")
    // public Partner getPartner() {
    //     return partner;
    // }
    // public void setPartner(Partner partner) {
    //     this.partner = partner;
    // }
}
