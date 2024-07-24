package com.jsp.jdbc.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.jdbc.dao.IvoterDao;
import com.jsp.jdbc.entity.voters;

@Service("voterService")
public class IvoterServiceImpl implements IvoterService{

	Scanner sc=new Scanner(System.in);
	@Autowired
	private IvoterDao dao;
	public void register() {
		voters vtr=new voters();
		System.out.println("Enter the Voter Id--->>");
		vtr.setVoter_Id(sc.nextInt());
		System.out.println("Enter the Voter Name--->>");
		vtr.setVoter_Name(sc.next());
		System.out.println("Enter the Voter age--->>");
		vtr.setVoter_age(sc.nextInt());
		System.out.println("Enter the Voter Address--->>");
		vtr.setVoter_address(sc.next());
		System.out.println("Enter the Voter Gender--->>");
		vtr.setVoter_gender(sc.next());
		System.out.println("Enter the Voter Mobile--->>");
		vtr.setVoter_Mobile(sc.next());
		dao.addVoter(vtr);
		
	}
	public void updateNameById() {
		System.out.println("Enter the Voter Id--->>");
		int id=sc.nextInt();
		System.out.println("Enter the Voter Name--->>");
		sc.nextLine();
		String name=sc.nextLine();
		dao.updateNameById(name,id);
	}
    public void updateAgeByNameandId() {
    	System.out.println("Enter the Voter Age");
    	int age=sc.nextInt();
    	System.out.println("Enter the Voter Name--->>");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter the Voter Id--->>");
		int id=sc.nextInt();
		dao.updateAgeByNameandId(age,name,id);
	}
    public void updateGenderById() {
    	System.out.println("Enter the Voter Gender--->>");
    	String gender=sc.nextLine();
    	System.out.println("Enter the Voter Id--->>");
		int id=sc.nextInt();
		dao.updateGenderById(gender,id);
	}
	public void updateMobileByIdandName() {
		System.out.println("Enter the Voter Mobile--->>");
		String mobile=sc.nextLine();
		System.out.println("Enter the Voter Id");
		int id=sc.nextInt();
		System.out.println("Enter the Voter Name--->>");
		sc.nextLine();
		String name=sc.nextLine();
		dao.updateMobileByIdandName(mobile,id,name);
	}
	public void updateAddressByIdandMobile() {
		System.out.println("Enter the Voter Address");
		String address=sc.next();
		System.out.println("Enter the Voter Id");
		int id=sc.nextInt();
		System.out.println("Enter the Voter Mobile--->>");
		String mobile=sc.next();
		dao.updateAddressByIdandMobile(address,id,mobile);
	}
	public void deleteById() {
		System.out.println("Enter the Voter Id---->>");
		int id=sc.nextInt();
		dao.deleteById(id);
		
	}
	public void deleteByMobileandId() {
		System.out.println("Enter the Voter Mobile--->>");
		String mobile=sc.next();	
		System.out.println("Enter the Voter Id");
		int id=sc.nextInt();
		dao.deleteByMobileandId(mobile,id);
	}
	public void deleteByNameandAddress() {
		System.out.println("Enter the Voter Name--->>");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter the Voter Address");
		String address=sc.next();
		dao.deleteByNameandAddress(name,address);
	}
	public void displayDetailsById() {
		System.out.println("Enter The Voter Id");
		int id=sc.nextInt();
		dao.selectDetailsById(id);
	}
	public void displayAllVoters() {
		dao.displayAllVoters();
		
	}
	public void displayVotersByName() {
		System.out.println("Enter the Voter Name--->>");
		//sc.nextLine();
		String name=sc.nextLine();
		dao.displayVotersByName(name);	
	}
}
