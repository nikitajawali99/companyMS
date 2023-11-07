package com.company.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.company.entity.Company;
import com.company.exception.ResourceNotFoundException;
import com.company.repository.CompanyRepository;
import com.company.service.CompanyService;

import jakarta.transaction.Transactional;

@Service
public class CompanyServiceImpl implements CompanyService {

	private final CompanyRepository companyRepository;

	public CompanyServiceImpl(CompanyRepository companyRepository) {
		super();
		this.companyRepository = companyRepository;
	}

	@Override
	public List<Company> getAllCompanies() {
		return companyRepository.findAll();
	}

	@Override
	@Transactional
	public Company createOrUpdateCompany(Company company) {
		if(company.getId()!=null) {
			company.setId(company.getId());
		}
		company.setDescription(company.getDescription());
		company.setName(company.getName());
		return companyRepository.save(company);
	}

	@Override
	public void getDeleteCompanyById(Long id) {
		
		if(id!=null) {
			companyRepository.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException("Company with given id is not found on server"));
		}
		
		companyRepository.deleteById(id);
	}

	@Override
	public Company getCompanyById(Long id) {
		return companyRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Company with given id is not found on server"));
	}

}
