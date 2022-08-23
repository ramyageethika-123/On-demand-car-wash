package com.example.demo;

import java.time.LocalDateTime;
import javax.persistence.*;
@Entity
	public class WashDetails {


	    @SequenceGenerator(name = "sequence2", sequenceName = "sequence2", allocationSize = 1)
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence2")
	    @Id
	    private Long Id;



	    private String userName;
	    private String packageName;
	    private LocalDateTime Date;
	    private int charges;


	    public WashDetails(String userName, LocalDateTime date, int charges , String packageName) {
	        this.userName = userName;
	        Date = date;
	        this.charges = charges;
	        this.packageName = packageName;
	    }

	    public String getUser_package() {
	        return packageName;
	    }

	    public void setUser_package(String packageName) {
	        this.packageName = packageName;
	    }

	    public String getUser() {
	        return userName;
	    }

	    public void setUser(String user) {
	        this.userName = user;
	    }

	    public LocalDateTime getDate() {
	        return Date;
	    }

	    public void setDate(LocalDateTime date) {
	        Date = date;
	    }

	    public int getCharges() {
	        return charges;
	    }

	    public void setCharges(int charges) {
	        this.charges = charges;
	    }


	}


