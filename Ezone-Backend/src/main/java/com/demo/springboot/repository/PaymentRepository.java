package com.demo.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.springboot.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
		public List<Payment> findByOrderId(long orderId);
}