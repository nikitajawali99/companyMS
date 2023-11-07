package com.company.service;

import java.util.List;

import com.company.entity.Company;

public interface CompanyService {
	
	List<Company> getAllCompanies();
	
	Company createOrUpdateCompany(Company company); 
	
	void getDeleteCompanyById(Long id);

	Company getCompanyById(Long id);

}
