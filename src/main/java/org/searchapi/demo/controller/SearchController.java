package org.searchapi.demo.controller;

import java.util.List;

import org.searchapi.demo.entity.Suppliers;
import org.searchapi.demo.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
@RestController
public class SearchController {

	@Autowired
	private SupplierService supplierService;

	@GetMapping("/api/supplier/query")
   @ResponseBody
   public Page<Suppliers> getSuppliers
            (@RequestParam  String location, 
             @RequestParam String natureOfBusiness, 
             @RequestParam String manufacturingProcess,
             @RequestParam(defaultValue = "0") int page,
             @RequestParam(defaultValue = "10") int size
    ) {
        Pageable pageable = PageRequest.of(page,size);
       return supplierService.getSupplierList(pageable,
          location, natureOfBusiness, manufacturingProcess
       );
   }

  @RequestMapping("/save")
   @ResponseBody
   public String saveInfo() {
      return supplierService.saveInfo();
   }

  }
