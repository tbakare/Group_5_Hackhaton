package com.example.demo.Visit;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.demo.Partner.Partner;
import com.example.demo.User.User;

@Entity
public class Visit {
    private int id;
    private String reason;
    private String symptoms;
    private String gender;
    private boolean hivStatus;
    private boolean syphillisStatus;
    private String date;
    private User user;
    //private Partner exPartner;
    //private Set<Partner> exPartner = new HashSet<>();

    


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public String getSymptoms() {
        return symptoms;
    }
    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public boolean isHivStatus() {
        return hivStatus;
    }
    public void setHivStatus(boolean hivStatus) {
        this.hivStatus = hivStatus;
    }
    public boolean isSyphillisStatus() {
        return syphillisStatus;
    }
    public void setSyphillisStatus(boolean syphillisStatus) {
        this.syphillisStatus = syphillisStatus;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    @ManyToOne
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    // public Partner getExPartner() {
    //     return exPartner;
    // }
    // public void setExPartner(Partner exPartner) {
    //     this.exPartner = exPartner;
    // }


    



}
