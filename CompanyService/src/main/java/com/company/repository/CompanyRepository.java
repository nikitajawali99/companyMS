package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long>{

}
