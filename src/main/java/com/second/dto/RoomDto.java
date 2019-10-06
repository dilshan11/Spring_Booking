package com.second.dto;

public class RoomDto {

    int roomid;
    String rtype;
    int sleppers;
    float price;
    String facts;
    int room_amount;

    public RoomDto() {
    }

    public RoomDto(String rtype, int sleppers, float price, String facts, int room_amount) {
        this.rtype = rtype;
        this.sleppers = sleppers;
        this.price = price;
        this.facts = facts;
        this.room_amount = room_amount;
    }

    public RoomDto(int roomid, String rtype, int sleppers, float price, String facts, int room_amount) {
        this.roomid = roomid;
        this.rtype = rtype;
        this.sleppers = sleppers;
        this.price = price;
        this.facts = facts;
        this.room_amount = room_amount;
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
        return "RoomDto{" +
                "roomid=" + roomid +
                ", rtype='" + rtype + '\'' +
                ", sleppers=" + sleppers +
                ", price=" + price +
                ", facts='" + facts + '\'' +
                ", room_amount=" + room_amount +
                '}';
    }
}
