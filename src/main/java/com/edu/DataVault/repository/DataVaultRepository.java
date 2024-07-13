package com.edu.DataVault.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.DataVault.dao.DataVault;

@Repository
public interface DataVaultRepository extends JpaRepository<DataVault, Integer>{

}
