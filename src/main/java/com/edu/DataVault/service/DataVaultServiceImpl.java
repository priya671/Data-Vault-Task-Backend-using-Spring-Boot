package com.edu.DataVault.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.DataVault.dao.DataVault;
import com.edu.DataVault.err.GlobalException;
import com.edu.DataVault.repository.DataVaultRepository;

import jakarta.validation.Valid;

@Service
public class DataVaultServiceImpl implements DataVaultService{
	
	@Autowired
	private DataVaultRepository datavaultrepository;

	@Override
	public DataVault saveCompanyData(@Valid DataVault datavault) {
		// TODO Auto-generated method stub
		return datavaultrepository.save(datavault);
	}

	@Override
	public DataVault updateDataVaultById(Integer companyid,DataVault datavault) throws GlobalException {
		DataVault dv = null;
		Optional<DataVault> dv1 = datavaultrepository.findById(companyid);
		if(!dv1.isPresent()) {
			throw new GlobalException("Company Id Does not exist");
		}
		else {
			dv = datavaultrepository.findById(companyid).get();
			dv.setCompanyname(datavault.getCompanyname());
			dv.setCompanyaddress(datavault.getCompanyaddress());
			dv.setCompanyemail(datavault.getCompanyemail());
			dv.setCompanyphonenumber(datavault.getCompanyphonenumber());
		}
		
		return datavaultrepository.save(dv);
	}


}
