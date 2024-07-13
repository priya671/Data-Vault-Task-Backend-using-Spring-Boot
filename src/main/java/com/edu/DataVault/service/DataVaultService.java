package com.edu.DataVault.service;

import com.edu.DataVault.dao.DataVault;
import com.edu.DataVault.err.GlobalException;


public interface DataVaultService {

	//To save the data
	DataVault saveCompanyData(DataVault datavault);

	//To update the data using company id
	DataVault updateDataVaultById(Integer companyid,DataVault datavault) throws GlobalException;


}
