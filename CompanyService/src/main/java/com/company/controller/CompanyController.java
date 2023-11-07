package com.company.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.entity.Company;
import com.company.service.CompanyService;



@RestController
@RequestMapping("/companies")
public class CompanyController {

	private final CompanyService companyService;

	public CompanyController(CompanyService companyService) {
		super();
		this.companyService = companyService;
	}

	@GetMapping
	public List<Company> getAllCompanies() {
		return companyService.getAllCompanies();
	}

	@PostMapping("/createCompany")
	public ResponseEntity<Company> createCompany(@RequestBody Company com) {

		return ResponseEntity.status(HttpStatus.CREATED).body(companyService.createOrUpdateCompany(com));
	}
	
	@DeleteMapping("/deleteCompanyById/{id}")
	public String deleteCompanyById(@PathVariable("id") Long id) {

		companyService.getDeleteCompanyById(id);
		return "Company Deleted successfully";
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Company> getCompanyById(@PathVariable("id") Long id) {
		
		return ResponseEntity.ok(companyService.getCompanyById(id));
	}
	
}
