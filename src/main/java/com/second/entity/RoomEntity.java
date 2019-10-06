package com.second.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Table(name = "rooms")
@Entity
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roomId")
    int roomid;

    @Column(name = "rtype")
    String rtype;

    @Column(name = "sleppers")
    int sleppers;

    @Column(name = "price")
    float price;

    @Column(name = "facts")
    String facts;

    @Column(name = "room_amount")
    int room_amount;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "room_Facility_Id")
    RoomFacilityEntity roomFacilityEntity;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hotelId")
    HotelEntity hotelEntity;

    public RoomEntity() {
    }

    public RoomEntity(String rtype, int sleppers, float price, String facts, int room_amount) {
        this.rtype = rtype;
        this.sleppers = sleppers;
        this.price = price;
        this.facts = facts;
        this.room_amount = room_amount;
    }

    public HotelEntity getHotelEntity() {
        return hotelEntity;
    }

    public void setHotelEntity(HotelEntity hotelEntity) {
        this.hotelEntity = hotelEntity;
    }

    public RoomFacilityEntity getRoomFacilityEntity() {
        return roomFacilityEntity;
    }

    public void setRoomFacilityEntity(RoomFacilityEntity roomFacilityEntity) {
        this.roomFacilityEntity = roomFacilityEntity;
    }

    public int getRoomid() {
        return roomid;
    }

    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }

    public String getRtype() {
        return rtype;
    }

    public void setRtype(String rtype) {
        this.rtype = rtype;
    }

    public int getSleppers() {
        return sleppers;
    }

    public void setSleppers(int sleppers) {
        this.sleppers = sleppers;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getFacts() {
        return facts;
    }

    public void setFacts(String facts) {
        this.facts = facts;
    }

    public int getRoom_amount() {
        return room_amount;
    }

    public void setRoom_amount(int room_amount) {
        this.room_amount = room_amount;
    }

    @Override
    public String toString() {
        return "RoomEntity{" +
                "roomid=" + roomid +
                ", rtype='" + rtype + '\'' +
                ", sleppers=" + sleppers +
                ", price=" + price +
                ", facts='" + facts + '\'' +
                ", room_amount=" + room_amount +
                '}';
    }
}
