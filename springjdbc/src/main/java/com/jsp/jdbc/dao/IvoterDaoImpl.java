package com.jsp.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
//import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jsp.jdbc.entity.voters;

@Repository("voterDao")
public class IvoterDaoImpl implements IvoterDao{
	@Autowired
    private JdbcTemplate template;
	//---------------------------------By Using Explicit Implementation(User Defined Classes)--------------------------------------------------------------
	//@Autowired
	//private RowMapper<voters> rm;
	//----------------------------------By Using Implicit Implementation(BeanPropertyRowMapper Class)-------------------------------------------------------
	private RowMapper<voters> rm=new BeanPropertyRowMapper<voters>(voters.class);
	public void addVoter(voters v) {
		String query="insert into voters(voter_Id, voter_Name, voter_age, voter_address, voter_gender, voter_Mobile)values(?,?,?,?,?,?)";
		template.update(query,v.getVoter_Id(),
				               v.getVoter_Name(),
				               v.getVoter_age(),
				               v.getVoter_address(),
				               v.getVoter_gender(),
				               v.getVoter_Mobile());
		//System.out.println(v);
		System.out.println("%% Voter Added %%");
		
	}
	public void updateNameById(String name, int id) {
		String query="update voters set Voter_Name=? where Voter_Id=?";
		int status=template.update(query,name,id);
		if(status>0) 
		{
			System.out.println("Voter Name is Updated Successfully");
		}
		else
		{
			System.out.println("Invalid Voter Id");
		}
	}
	public void updateAgeByNameandId(int age, String name, int id) {
		String query="update voters set voter_age=? where Voter_Name=?,Voter_Id=?";
		int status=template.update(query,age,name,id);
		if(status>0) 
		{
			System.out.println("Voter Age is Updated Successfully");
		}
		else
		{
			System.out.println("Invalid Voter Name and Voter Id");
		}
	}
	public void updateGenderById(String gender, int id) {
		String query="update voters set voter_gender=? where Voter_Id=?";
		int status=template.update(query,gender,id);
		if(status>0) 
		{
			System.out.println("Voter Gender is Updated Successfully");
		}
		else
		{
			System.out.println("Invalid Voter Id");
		}
	}
	public void updateMobileByIdandName(String mobile, int id, String name) {
		String query="update voters set voter_Mobile=? where Voter_Id=?,Voter_Name=?";
		int status=template.update(query,mobile,id,name);
		if(status>0) 
		{
			System.out.println("Voter Mobile is Updated Successfully");
		}
		else
		{
			System.out.println("Invalid Voter Id and Voter Name");
		}
	}
	public void updateAddressByIdandMobile(String address, int id, String mobile) {
		String query="update voters set voter_address=? where Voter_Id=?,voter_Mobile=?";
		int status=template.update(query,address,id,mobile);
		if(status>0) 
		{
			System.out.println("Voter Address is Updated Successfully");
		}
		else
		{
			System.out.println("Invalid Voter Id and Voter Mobile");
		}
	}
	public void deleteById(int id) {
		String query="delete from voters where Voter_Id=?";
		int status=template.update(query,id);
		if(status>0)
		{
			System.out.println("Voter is Deleted Successfully");
		}
		else
		{
			System.out.println("Invalid Voter Id");
		}
	}
	public void deleteByMobileandId(String mobile, int id) {
		String query="delete from voters where voter_Mobile=?,Voter_Id=?";
		int status=template.update(query,mobile,id);
		if(status>0)
		{
			System.out.println("Voter is Deleted Successfully");
		}
		else
		{
			System.out.println("Invalid Voter Mobile and Voter Id");
		}
	}
	public void deleteByNameandAddress(String name, String address) {
		String query="delete from voters where Voter_Name=?,voter_address=?";
		int status=template.update(query,name,address);
		if(status>0)
		{
			System.out.println("Voter is Deleted Successfully");
		}
		else
		{
			System.out.println("Invalid Voter Name and Voter Address");
		}
	}
	public void selectDetailsById(int id) {
		String query="Select * from voters where Voter_Id=?";
		try
		{
		voters v=template.queryForObject(query,rm, id);
		System.out.println(v);
	}
		catch (Exception e) {
			System.out.println("Voter Not Found");
		}
    }
	public void displayAllVoters() {
		String query="Select * from voters";
		List<voters> list=template.query(query,rm);
		for (voters voters : list) {
			System.out.println(voters);
			System.out.println("--------------------------------------");
		}		
	}
	public void displayVotersByName(String name) {
		String query="select * from voters where voter_Name=?";
		List<voters> list=template.query(query,rm,name);
		//System.out.println(list.getClass().getName());
		if(!list.isEmpty() )
		{
		for (voters voters : list) {
			System.out.println(voters);
			System.out.println("--------------------------------------");
		}	
		}
		else
		{
			System.out.println("No Voter is Found By This Name");
			System.out.println("--------------------------------------");
		}
		
	  }
 }
