package com.ashokit.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.jpa.entities.CustomerEntity;

public interface CustomerEntityRepository extends JpaRepository<CustomerEntity, Integer> {

}
