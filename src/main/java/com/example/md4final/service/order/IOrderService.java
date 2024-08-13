package com.example.md4final.service.order;

import com.example.md4final.model.Orders;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IOrderService {
    Page<Orders> findAll(Pageable pageable);

    Optional<Orders> findById(Long id);
}
