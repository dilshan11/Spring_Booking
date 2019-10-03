package com.second.dto;

public class HotelDto {
    int hotelid;
    String ptype;
    String pname;
    String sadress;
    String village;
    String city;
    int ownerId;
    public HotelDto() {
    }

    public HotelDto(int hotelid, String ptype, String pname, String sadress, String village, String city, int ownerId) {
        this.hotelid = hotelid;
        this.ptype = ptype;
        this.pname = pname;
        this.sadress = sadress;
        this.village = village;
        this.city = city;
        this.ownerId = ownerId;
    }

    public HotelDto(String ptype, String pname, String sadress, String village, String city) {
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

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public String toString() {
        return "HotelDto{" +
                "hotelid=" + hotelid +
                ", ptype='" + ptype + '\'' +
                ", pname='" + pname + '\'' +
                ", sadress='" + sadress + '\'' +
                ", village='" + village + '\'' +
                ", city='" + city + '\'' +
                ", ownerId=" + ownerId +
                '}';
    }
}
