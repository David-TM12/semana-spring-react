package com.davidmagalhaes.dsmeta.repositories;

import com.davidmagalhaes.dsmeta.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
