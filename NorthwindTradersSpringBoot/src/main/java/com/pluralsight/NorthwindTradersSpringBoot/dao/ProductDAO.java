package com.pluralsight.NorthwindTradersSpringBoot.dao;

import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import java.util.List;

public interface ProductDAO {
    void add(Product product);
    List<Product> getAll();
}
