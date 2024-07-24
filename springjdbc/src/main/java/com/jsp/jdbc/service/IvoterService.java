package com.jsp.jdbc.service;

public interface IvoterService {

	void register();

	void updateNameById();

	void updateAgeByNameandId();

	void updateGenderById();

	void updateMobileByIdandName();

	void updateAddressByIdandMobile();
	
	void deleteById();

	void deleteByMobileandId();

	void deleteByNameandAddress();

	void displayDetailsById();

	void displayAllVoters();

	void displayVotersByName();
	
}
