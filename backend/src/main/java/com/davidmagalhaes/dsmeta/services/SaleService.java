package com.davidmagalhaes.dsmeta.services;


import com.davidmagalhaes.dsmeta.entities.Sale;
import com.davidmagalhaes.dsmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public List<Sale> findSales(){
        return repository.findAll();
    }
}
