package com.second.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Owner")
public class OwnerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ownerId")
    int id;
    @Column(name = "fname")
    String fname;
    @Column(name = "lname")
    String lname;
    @Column(name = "email")
    String email;
    @Column(name = "password")
    String password;
    @Column(name = "phnumber")
    int phnumber;

    @OneToMany(mappedBy = "ownerEntity",cascade = CascadeType.ALL)
    List<HotelEntity> hotelEntities;

    public List<HotelEntity> getHotelEntities() {
        return hotelEntities;
    }

    public void setHotelEntities(List<HotelEntity> hotelEntities) {
        this.hotelEntities = hotelEntities;
    }

    public OwnerEntity() {
    }

    public OwnerEntity(String fname, String lname, String email, String password, int phnumber) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.password = password;
        this.phnumber = phnumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhnumber() {
        return phnumber;
    }

    public void setPhnumber(int phnumber) {
        this.phnumber = phnumber;
    }

    @Override
    public String toString() {
        return "OwnerEntity{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phnumber=" + phnumber +
                '}';
    }

    public void add(HotelEntity temperentity){
        if(hotelEntities==null){
            hotelEntities=new ArrayList<>();
        }
        hotelEntities.add(temperentity);
        temperentity.setOwnerEntity(this);
    }
}
