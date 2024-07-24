package com.jsp.jdbc;

import java.util.Scanner;

import javax.swing.SwingConstants;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.jdbc.configuration.VoterConfig;
import com.jsp.jdbc.service.IvoterService;

public class votermanagement 
{
    public static void main( String[] args )
    {
    Scanner sc=new Scanner(System.in);
       ApplicationContext context=new AnnotationConfigApplicationContext(VoterConfig.class);
       IvoterService service=context.getBean("voterService",IvoterService.class);
       while(true)
       {
    	   System.out.println("Press 1: To Registration ");
    	   System.out.println("Press 2: To update");
    	   System.out.println("Press 3: To delete");
    	   System.out.println("Press 4: To select");
    	   System.out.println("Press 5: To displayAllVoters");
    	   switch (sc.nextInt()) {
			    case 1:service.register();
				break;
			    case 2:
			        	{
			        	   System.out.println("Press 1 to:Update Name By Id");
			     		   System.out.println("Press 2 to:Update Age By Name and Id");
			     		   System.out.println("Press 3 to:Update Gender By Id");
			     		   System.out.println("Press 4 to:Update Mobile By Id and Name");
			     		   System.out.println("Press 5 to:Update Address By Id and Mobile");
			     		   switch (sc.nextInt()) {
						       case 1:service.updateNameById();
							   break;
						       case 2:service.updateAgeByNameandId();
							   break;
						       case 3:service.updateGenderById();
							   break;
						       case 4:service.updateMobileByIdandName();
							   break;
						       case 5:service.updateAddressByIdandMobile();
							   break;
						       default:System.out.println("<<<<<<<< INVALID OPTION  >>>>>>>");
							   break;
						       }
			        	}
			    break;
			    case 3:
			          {
			            System.out.println("Press 1 to:Delete by Id");
			            System.out.println("Press 2 to:Delete by Mobile and Id");
			            System.out.println("Press 3 to:Delete by Name and Address");
			            switch (sc.nextInt()) {
						      case 1:service.deleteById();
							  break;
						      case 2:service.deleteByMobileandId();
						      break;
						      case 3:service.deleteByNameandAddress();
						      default:System.out.println("<<<<<<<< INVALID OPTION  >>>>>>>");
							  break;
						      }
			          }
			    break;  
			    case 4:service.displayDetailsById();
			    break;
			    case 5:
			    {
			    	System.out.println("Press 1 to:Display Voters By Name");
//			    	System.out.println("Press 2 to:Display Voters By Age");
//			    	System.out.println("Press 3 to:Display Voters By Address");
//			    	System.out.println("Press 4 to:Display Voters By Mobile");
			    	switch(sc.nextInt())
			    	{
			    	case 1:service.displayVotersByName();
//			    	case 2:service.displayVotersByAge();
//			    	case 3:service.displayVotersByAddress();
//			    	case 4:service.displayVotersByMobile();
			    	}
			    }
			    break;
		   }
    	   System.out.println("Do you want to contiue , Press 'yes' (OR) 'no'");
    	   String value=sc.next();
    	   if(value.equalsIgnoreCase("yes"))
    	   {
    		   continue;
    	   }
    	   else if(value.equalsIgnoreCase("no"))
    	   {
    		   System.out.println("---------Thank You Visit Again---------");
    		   break;
    	   }
    	   else
    	   {
    		   System.out.println("<<<<<<<<<<<<GET LOST>>>>>>>>>>>>>>>>>");
    		   break;
    	   }
       }
    }
}
