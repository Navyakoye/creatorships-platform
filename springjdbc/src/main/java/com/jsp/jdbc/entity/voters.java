package com.jsp.jdbc.entity;

public class voters {

private int voter_Id;
private String voter_Name;
private int voter_age;
private String voter_address;
private String voter_gender;
private String voter_Mobile;
public voters() {
	
}
public void setVoter_Id(int voter_Id) {
	this.voter_Id = voter_Id;
}
public void setVoter_Name(String voter_Name) {
	this.voter_Name = voter_Name;
}
public void setVoter_age(int voter_age) {
	this.voter_age = voter_age;
}
public void setVoter_address(String voter_address) {
	this.voter_address = voter_address;
}
public void setVoter_gender(String voter_gender) {
	this.voter_gender = voter_gender;
}
public void setVoter_Mobile(String voter_Mobile) {
	this.voter_Mobile = voter_Mobile;
}
public int getVoter_Id() {
	return voter_Id;
}
public String getVoter_Name() {
	return voter_Name;
}
public int getVoter_age() {
	return voter_age;
}
public String getVoter_address() {
	return voter_address;
}
public String getVoter_gender() {
	return voter_gender;
}
public String getVoter_Mobile() {
	return voter_Mobile;
}
@Override
public String toString() {
	return "voters [voter_Id=" + voter_Id + ", voter_Name=" + voter_Name + ", voter_age=" + voter_age
			+ ", voter_address=" + voter_address + ", voter_gender=" + voter_gender + ", voter_Mobile=" + voter_Mobile
			+ "]";
}
}
