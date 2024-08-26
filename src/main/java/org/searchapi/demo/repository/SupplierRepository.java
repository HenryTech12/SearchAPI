package org.searchapi.demo.repository;

import java.util.*;

import org.searchapi.demo.entity.Suppliers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
@Repository
public interface SupplierRepository extends JpaRepository<Suppliers, Long> {

	Page<Suppliers> findByLocationAndNatureOfBusinessAndManufacturingProcess(Pageable pageable,String location, String natureOfBusiness, String manufacturingProcess);

}
