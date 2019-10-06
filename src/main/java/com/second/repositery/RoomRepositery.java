package com.second.repositery;

import com.second.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepositery extends JpaRepository<RoomEntity,Integer> {
}
