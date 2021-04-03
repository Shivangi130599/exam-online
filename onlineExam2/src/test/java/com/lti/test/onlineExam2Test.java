package com.lti.test;


import java.time.LocalDate;

import org.junit.Test;

import com.lti.Dao.Dao;
import com.lti.entity.Address;
import com.lti.entity.User;

public class onlineExam2Test {
	
	@Test
	public void addUserAddressTogether() {

			
			Dao dao = new Dao();
			//============================User 1===========================
			User u = new User();
			u.setFirstName("Aakash");
			u.setMiddleName("Chandrabhushan");
			u.setLastName("Tiwari");
			u.setDateOfBirth(LocalDate.of(1999, 1, 15));
			u.setEmail("aakashtiwari15m@gmail.com");
			u.setGender("Male");
			u.setPassword("admin");
			u.setPhoneNo(829133199);
			u.setQualification("BE");
			u.setRights("admin");
			
			
			Address adr = new Address();
			
			adr.setLocality("Juhu");
			adr.setStreet("J.R. Mhatre Marg");
			adr.setLandmark("Kamat Medical");
			adr.setCity("Mumbai");
			adr.setPincode(400049);
			adr.setState("Maharashtra");
			adr.setCountry("Bharat");
			
			User u1 = new User();
			u1.setFirstName("Nishita");
			u1.setMiddleName("Mukesh");
			u1.setLastName("Sodhia");
			u1.setDateOfBirth(LocalDate.of(1997, 5, 03));
			u1.setEmail("sodhiablue@gmail.com");
			u1.setGender("Female");
			u1.setPassword("user");
			u1.setPhoneNo(982078274);
			u1.setQualification("BE");
			u1.setRights("user");
			
			
			Address adr1 = new Address();
			
			adr1.setLocality("Nerul");
			adr1.setStreet("Radial road lane 2");
			adr1.setLandmark("Demat");
			adr1.setCity("Navi MUmbai");
			adr1.setPincode(400706);
			adr1.setState("Maharashtra");
			adr1.setCountry("Bharat");
			
			
			u.setAddress(adr);
			u1.setAddress(adr1);
			
			dao.save(u);
			dao.save(u1);
	}

}
