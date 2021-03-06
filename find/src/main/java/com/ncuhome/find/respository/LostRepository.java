package com.ncuhome.find.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface LostRepository extends JpaRepository<Lost, Integer>,JpaSpecificationExecutor<Lost> {
    List<Lost> findByCardNumber(String cardNumber);
    Lost findByCardNumberAndStatus(String cardNumber,Integer status);
    List<Lost> findByDateBetween(Long dateStart,Long dateEnd);
    List<Lost> findByNameAndStatus(String name,Integer status);
    List<Lost> findByDateBeforeAndStatus(Long date,Integer status);
}
