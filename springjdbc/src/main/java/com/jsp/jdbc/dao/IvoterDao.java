package com.jsp.jdbc.dao;

import com.jsp.jdbc.entity.voters;

public interface IvoterDao {

void addVoter(voters v);

void updateNameById(String name, int id);

void updateAgeByNameandId(int age, String name, int id);

void updateGenderById(String gender, int id);

void updateMobileByIdandName(String mobile, int id, String name);

void updateAddressByIdandMobile(String address, int id, String mobile);

void deleteById(int id);

void deleteByMobileandId(String mobile, int id);

void deleteByNameandAddress(String name, String address);

void selectDetailsById(int id);

void displayAllVoters();

void displayVotersByName(String name);

}
