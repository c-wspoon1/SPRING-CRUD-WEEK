package com.weatherspoon.CRUDWeek.repos;

import com.weatherspoon.CRUDWeek.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{

    }

