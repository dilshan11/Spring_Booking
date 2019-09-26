package com.second.repositery;

import com.second.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepositery extends JpaRepository<CustomerEntity,Integer> {

    public List<CustomerEntity> findByEmail(String email);

}
