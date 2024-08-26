package org.searchapi.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Suppliers {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	  private Long supplierId;
     private String companyName;
     private String website;
     private String location;
     private String natureOfBusiness;
     private String manufacturingProcess;

    public void setSupplierId(Long supplierId)
    {
        this.supplierId = supplierId;
    }

    public Long getSupplierId()
    {
        return supplierId;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public void setWebsite(String website)
    {
        this.website = website;
    }

    public String getWebsite()
    {
        return website;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getLocation()
    {
        return location;
    }

    public void setNatureOfBusiness(String natureOfBusiness)
    {
        this.natureOfBusiness = natureOfBusiness;
    }

    public String getNatureOfBusiness()
    {
        return natureOfBusiness;
    }

    public void setManufacturingProcess(String manufacturingProcess)
    {
        this.manufacturingProcess = manufacturingProcess;
    }

    public String getManufacturingProcess()
    {
        return manufacturingProcess;
    }

}
