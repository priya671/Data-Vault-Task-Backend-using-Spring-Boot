package com.edu.DataVault.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
public class DataVault {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer companyid;
	
	@NotNull(message = "Please enter Company Name") @Column(nullable = false)
	private String companyname;
	
	@NotNull(message = "Please enter Company Address") @Column(nullable = false)
	private String companyaddress;
	
	@NotNull(message = "Please enter Company Phone Number")
	@Column(length = 10, nullable = false)
	private String companyphonenumber;
	
	@NotNull(message = "Please enter Company Email")
	@Column(nullable = false, unique = true)
//	@Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$")
	private String companyemail;

	public DataVault() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DataVault(String companyname,String companyaddress,String companyphonenumber,
			String companyemail) {
		super();
		this.companyname = companyname;
		this.companyaddress = companyaddress;
		this.companyphonenumber = companyphonenumber;
		this.companyemail = companyemail;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getCompanyaddress() {
		return companyaddress;
	}

	public void setCompanyaddress(String companyaddress) {
		this.companyaddress = companyaddress;
	}

	public String getCompanyphonenumber() {
		return companyphonenumber;
	}

	public void setCompanyphonenumber(String companyphonenumber) {
		this.companyphonenumber = companyphonenumber;
	}

	public String getCompanyemail() {
		return companyemail;
	}

	public void setCompanyemail(String companyemail) {
		this.companyemail = companyemail;
	}

	@Override
	public String toString() {
		return "DataVault [companyid=" + companyid + ", companyname=" + companyname + ", companyaddress="
				+ companyaddress + ", companyphonenumber=" + companyphonenumber + ", companyemail=" + companyemail
				+ "]";
	}

	
	
	

}
