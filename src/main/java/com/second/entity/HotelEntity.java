package com.second.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "Hotel")
@Entity
public class HotelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotelId")
    int hotelid;
    @Column(name = "property_type")
    String ptype;
    @Column(name = "proprty_name")
    String pname;
    @Column(name = "Street_adress")
    String sadress;
    @Column(name = "village")
    String village;
    @Column(name = "city")
    String city;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "facilityId")
    FacilityEntity facilityEntity;

     @OneToMany(mappedBy = "hotelEntity")
    List<RoomEntity> roomEntities;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ownerId")
    OwnerEntity ownerEntity;

    public List<RoomEntity> getRoomEntities() {
        return roomEntities;
    }

    public void setRoomEntities(List<RoomEntity> roomEntities) {
        this.roomEntities = roomEntities;
    }

    public FacilityEntity getFacilityEntity() {
        return facilityEntity;
    }

    public void setFacilityEntity(FacilityEntity facilityEntity) {
        this.facilityEntity = facilityEntity;
    }

    public OwnerEntity getOwnerEntity() {
        return ownerEntity;
    }

    public void setOwnerEntity(OwnerEntity ownerEntity) {
        this.ownerEntity = ownerEntity;
    }

    public HotelEntity() {
    }

    public HotelEntity(String ptype, String pname, String sadress, String village, String city) {
        this.ptype = ptype;
        this.pname = pname;
        this.sadress = sadress;
        this.village = village;
        this.city = city;
    }

    public int getHotelid() {
        return hotelid;
    }

    public void setHotelid(int hotelid) {
        this.hotelid = hotelid;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getSadress() {
        return sadress;
    }

    public void setSadress(String sadress) {
        this.sadress = sadress;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void add(RoomEntity roomEntity){
        if(roomEntities==null){
            roomEntities=new ArrayList<>();
        }
        roomEntities.add(roomEntity);
        roomEntity.setHotelEntity(this);
    }

    @Override
    public String toString() {
        return "HotelEntity{" +
                "hotelid=" + hotelid +
                ", ptype='" + ptype + '\'' +
                ", pname='" + pname + '\'' +
                ", sadress='" + sadress + '\'' +
                ", village='" + village + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
