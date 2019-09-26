package com.second.repositery;

import com.second.entity.OwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OwnerRepositery extends JpaRepository<OwnerEntity,Integer> {

    public List<OwnerEntity> findByEmail(String email);

}
