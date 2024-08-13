package com.example.md4final.repository;

import com.example.md4final.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IOrderRepository extends JpaRepository<Orders, Long> {

}
