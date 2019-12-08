package com.second.repositery;

import com.second.entity.HotelEntity;
import com.second.entity.OwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepositery extends JpaRepository<HotelEntity,Integer> {

    @Query(
            value = "select * from hotel where owner_id=?1",
            nativeQuery = true)
     public List<HotelEntity> findByownerId(Integer ownerid);


}
