package com.cache.testredis.controller;

import com.cache.testredis.model.Company;
import com.cache.testredis.repository.CompanyRepository;
import com.cache.testredis.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("companies")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @GetMapping
    public ResponseEntity<List<Company>> getCompanies() {
        return ResponseEntity.ok(companyService.getAllCompanies());
    }

    @PostMapping
    public ResponseEntity<String> saveCompany(@RequestBody Company company) {
        companyService.saveCompany(company);
        return new ResponseEntity<>("CREATED",HttpStatus.CREATED);
    }
}
