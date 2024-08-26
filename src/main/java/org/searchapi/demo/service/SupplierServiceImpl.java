package org.searchapi.demo.service;

import java.util.List;

import org.searchapi.demo.entity.Suppliers;
import org.searchapi.demo.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
@Service
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	private SupplierRepository repo;

	@Override
	public Page<Suppliers> getSupplierList
                (
                      Pageable pageable,
                      String location, 
                      String natureOfBusiness,
                      String manufacturingProcess
               ) {
              
             return repo.findByLocationAndNatureOfBusinessAndManufacturingProcess(
                     pageable,
                     location,
                     natureOfBusiness,
                     manufacturingProcess
               );
    }

}
