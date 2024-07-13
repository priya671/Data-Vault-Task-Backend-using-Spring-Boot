package com.edu.DataVault.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.DataVault.dao.DataVault;
import com.edu.DataVault.err.GlobalException;
import com.edu.DataVault.service.DataVaultService;

import jakarta.validation.Valid;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DataVaultController {

	@Autowired
	private DataVaultService datavaultService;
	
	@PostMapping("/saveCompanyData")
	public ResponseEntity<DataVault> saveCompanyData(@Valid @RequestBody DataVault datavault) throws GlobalException{
		
		DataVault dav = datavaultService.saveCompanyData(datavault);
		return new ResponseEntity<DataVault>(dav, HttpStatus.CREATED);
		
	}
	
	
	@PutMapping("/updateDataVaultById/{companyid}")
	public DataVault updateDataVaultById(@PathVariable("companyid") Integer companyid, @Valid @RequestBody DataVault datavault) throws GlobalException {
		return datavaultService.updateDataVaultById(companyid, datavault);
		
	}
	
	
	
}
