package com.second.dto;

public class RoomFacilityDto {
    int roomfacilityId;
   String city_view;
   String free_wifi;
   String air_conditioning;
   String bathroom;
   String tv;
   String satalite_channel;
   String iron;
   String showers;
   String telephone;
   String dryer;
   String slipers;

    public RoomFacilityDto() {
    }

    public RoomFacilityDto(String city_view, String free_wifi, String air_conditioning, String bathroom, String tv, String satalite_channel, String iron, String showers, String telephone, String dryer, String slipers) {
        this.city_view = city_view;
        this.free_wifi = free_wifi;
        this.air_conditioning = air_conditioning;
        this.bathroom = bathroom;
        this.tv = tv;
        this.satalite_channel = satalite_channel;
        this.iron = iron;
        this.showers = showers;
        this.telephone = telephone;
        this.dryer = dryer;
        this.slipers = slipers;
    }

    public RoomFacilityDto(int roomfacilityId, String city_view, String free_wifi, String air_conditioning, String bathroom, String tv, String satalite_channel, String iron, String showers, String telephone, String dryer, String slipers) {
        this.roomfacilityId = roomfacilityId;
        this.city_view = city_view;
        this.free_wifi = free_wifi;
        this.air_conditioning = air_conditioning;
        this.bathroom = bathroom;
        this.tv = tv;
        this.satalite_channel = satalite_channel;
        this.iron = iron;
        this.showers = showers;
        this.telephone = telephone;
        this.dryer = dryer;
        this.slipers = slipers;
    }

    public int getRoomfacilityId() {
        return roomfacilityId;
    }

    public void setRoomfacilityId(int roomfacilityId) {
        this.roomfacilityId = roomfacilityId;
    }

    public String getCity_view() {
        return city_view;
    }

    public void setCity_view(String city_view) {
        this.city_view = city_view;
    }

    public String getFree_wifi() {
        return free_wifi;
    }

    public void setFree_wifi(String free_wifi) {
        this.free_wifi = free_wifi;
    }

    public String getAir_conditioning() {
        return air_conditioning;
    }

    public void setAir_conditioning(String air_conditioning) {
        this.air_conditioning = air_conditioning;
    }

    public String getBathroom() {
        return bathroom;
    }

    public void setBathroom(String bathroom) {
        this.bathroom = bathroom;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getSatalite_channel() {
        return satalite_channel;
    }

    public void setSatalite_channel(String satalite_channel) {
        this.satalite_channel = satalite_channel;
    }

    public String getIron() {
        return iron;
    }

    public void setIron(String iron) {
        this.iron = iron;
    }

    public String getShowers() {
        return showers;
    }

    public void setShowers(String showers) {
        this.showers = showers;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDryer() {
        return dryer;
    }

    public void setDryer(String dryer) {
        this.dryer = dryer;
    }

    public String getSlipers() {
        return slipers;
    }

    public void setSlipers(String slipers) {
        this.slipers = slipers;
    }

    @Override
    public String toString() {
        return "RoomFacilityDto{" +
                "roomfacilityId=" + roomfacilityId +
                ", city_view='" + city_view + '\'' +
                ", free_wifi='" + free_wifi + '\'' +
                ", air_conditioning='" + air_conditioning + '\'' +
                ", bathroom='" + bathroom + '\'' +
                ", tv='" + tv + '\'' +
                ", satalite_channel='" + satalite_channel + '\'' +
                ", iron='" + iron + '\'' +
                ", showers='" + showers + '\'' +
                ", telephone='" + telephone + '\'' +
                ", dryer='" + dryer + '\'' +
                ", slipers='" + slipers + '\'' +
                '}';
    }
}
