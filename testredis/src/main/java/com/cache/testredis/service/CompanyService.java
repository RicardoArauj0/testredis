package com.cache.testredis.service;

import com.cache.testredis.model.Company;
import com.cache.testredis.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CompanyService {

    private final CompanyRepository companyRepository;

    @Cacheable(value = "companiesCache")
    public List<Company> getAllCompanies() {
        log.info("Querying in database");
        return companyRepository.findAll();
    }

    public void saveCompany(Company company) {
        companyRepository.save(company);
    }
}
