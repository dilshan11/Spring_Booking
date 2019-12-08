package com.second.repositery;

import com.second.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoomRepositery extends JpaRepository<RoomEntity,Integer> {

    @Query(value = "select * from rooms where hotel_id=?1",nativeQuery = true)
    public List<RoomEntity> getroomsrelated_hotel(Integer hotelid);
}
