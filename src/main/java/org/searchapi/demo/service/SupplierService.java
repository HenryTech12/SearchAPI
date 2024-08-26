package org.searchapi.demo.service;

import java.util.List;

import org.searchapi.demo.entity.Suppliers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
public interface SupplierService {

	  Page<Suppliers> getSupplierList(
        Pageable pageable,
        String location,
        String natureOfBusiness,
        String manufacturingProcess 
      );
}
