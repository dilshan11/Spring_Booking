package com.second.entity;

import javax.persistence.*;

@Table(name = "facility")
@Entity
public class FacilityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "facilityId")
    int facilityId;

    @Column(name = "outdoor_pool")
    String outdoor_pool;
    @Column(name = "dryer")
    String dryer;
    @Column(name = "indoor_pool")
    String indoor_pool;
    @Column(name = "hot_tub")
    String hot_tub;
    @Column(name = "free_parking")
    String free_parking;
    @Column(name = "gym")
    String gym;
    @Column(name = "heating")
    String heating;
    @Column(name = "closet")
    String closet;
    @Column(name = "fireplace")
    String fireplace;

    @Column(name = "entrance")
    String entrance;
    @Column(name = "elevator")
    String elevator;
    @Column(name = "wheelchair")
    String wheelchair;
    @Column(name = "doorman")
    String doorman;

    @Column(name = "breakfast")
    String breakfast;
    @Column(name = "tea")
    String tea;
    @Column(name = "coffee")
    String coffee;
    @Column(name = "teamaker")
    String teamaker;
    @Column(name = "kitchen")
    String kitchen;

    public FacilityEntity() {
    }

    public FacilityEntity(String outdoor_pool, String dryer, String indoor_pool, String hot_tub, String free_parking, String gym, String heating, String closet, String fireplace, String entrance, String elevator, String wheelchair, String doorman, String breakfast, String tea, String coffee, String teamaker, String kitchen) {
        this.outdoor_pool = outdoor_pool;
        this.dryer = dryer;
        this.indoor_pool = indoor_pool;
        this.hot_tub = hot_tub;
        this.free_parking = free_parking;
        this.gym = gym;
        this.heating = heating;
        this.closet = closet;
        this.fireplace = fireplace;
        this.entrance = entrance;
        this.elevator = elevator;
        this.wheelchair = wheelchair;
        this.doorman = doorman;
        this.breakfast = breakfast;
        this.tea = tea;
        this.coffee = coffee;
        this.teamaker = teamaker;
        this.kitchen = kitchen;
    }

    public int getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(int facilityId) {
        this.facilityId = facilityId;
    }

    public String getOutdoor_pool() {
        return outdoor_pool;
    }

    public void setOutdoor_pool(String outdoor_pool) {
        this.outdoor_pool = outdoor_pool;
    }

    public String getDryer() {
        return dryer;
    }

    public void setDryer(String dryer) {
        this.dryer = dryer;
    }

    public String getIndoor_pool() {
        return indoor_pool;
    }

    public void setIndoor_pool(String indoor_pool) {
        this.indoor_pool = indoor_pool;
    }

    public String getHot_tub() {
        return hot_tub;
    }

    public void setHot_tub(String hot_tub) {
        this.hot_tub = hot_tub;
    }

    public String getFree_parking() {
        return free_parking;
    }

    public void setFree_parking(String free_parking) {
        this.free_parking = free_parking;
    }

    public String getGym() {
        return gym;
    }

    public void setGym(String gym) {
        this.gym = gym;
    }

    public String getHeating() {
        return heating;
    }

    public void setHeating(String heating) {
        this.heating = heating;
    }

    public String getCloset() {
        return closet;
    }

    public void setCloset(String closet) {
        this.closet = closet;
    }

    public String getFireplace() {
        return fireplace;
    }

    public void setFireplace(String fireplace) {
        this.fireplace = fireplace;
    }

    public String getEntrance() {
        return entrance;
    }

    public void setEntrance(String entrance) {
        this.entrance = entrance;
    }

    public String getElevator() {
        return elevator;
    }

    public void setElevator(String elevator) {
        this.elevator = elevator;
    }

    public String getWheelchair() {
        return wheelchair;
    }

    public void setWheelchair(String wheelchair) {
        this.wheelchair = wheelchair;
    }

    public String getDoorman() {
        return doorman;
    }

    public void setDoorman(String doorman) {
        this.doorman = doorman;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getTea() {
        return tea;
    }

    public void setTea(String tea) {
        this.tea = tea;
    }

    public String getCoffee() {
        return coffee;
    }

    public void setCoffee(String coffee) {
        this.coffee = coffee;
    }

    public String getTeamaker() {
        return teamaker;
    }

    public void setTeamaker(String teamaker) {
        this.teamaker = teamaker;
    }

    public String getKitchen() {
        return kitchen;
    }

    public void setKitchen(String kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public String toString() {
        return "FacilityEntity{" +
                "facilityId=" + facilityId +
                ", outdoor_pool='" + outdoor_pool + '\'' +
                ", dryer='" + dryer + '\'' +
                ", indoor_pool='" + indoor_pool + '\'' +
                ", hot_tub='" + hot_tub + '\'' +
                ", free_parking='" + free_parking + '\'' +
                ", gym='" + gym + '\'' +
                ", heating='" + heating + '\'' +
                ", closet='" + closet + '\'' +
                ", fireplace='" + fireplace + '\'' +
                ", entrance='" + entrance + '\'' +
                ", elevator='" + elevator + '\'' +
                ", wheelchair='" + wheelchair + '\'' +
                ", doorman='" + doorman + '\'' +
                ", breakfast='" + breakfast + '\'' +
                ", tea='" + tea + '\'' +
                ", coffee='" + coffee + '\'' +
                ", teamaker='" + teamaker + '\'' +
                ", kitchen='" + kitchen + '\'' +
                '}';
    }
}
