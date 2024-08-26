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

    @Override
   public String saveInfo() {
        Suppliers s = new Suppliers();
        s.setCompanyName("Lorova");
        s.setNatureOfBusiness("Small Scale");
        s.setLocation("Nigeria");
        s.setWebsite("bretech.com");
        s.setManufacturingProcess("3d printing");
 

        Suppliers s1 = new Suppliers();
        s1.setCompanyName("DreTech");
        s1.setNatureOfBusiness("Small Scale");
        s1.setLocation("Nigeria");
        s1.setWebsite("bre.com");
        s1.setManufacturingProcess("3d printing");


         Suppliers s2 = new Suppliers();
        s2.setCompanyName("Vorala");
        s2.setNatureOfBusiness("Large Scale");
        s2.setLocation("United States");
        s2.setWebsite("bretech.com");
        s2.setManufacturingProcess("casting");

        repo.save(s);
        repo.save(s1);
        repo.save(s2);

        return "SUCCESS";
         
    }
}
