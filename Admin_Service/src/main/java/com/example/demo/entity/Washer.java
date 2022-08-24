package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Washer {
		
		@Id
		
		private int washerid;
		private String name;
		private String email;

		
		
		public Washer (int washerid, String name, String email) {
			this.washerid=washerid;
			this.name =name;
			this.email=email;
		}



		public int getId() {
			return washerid;
		}



		public void setId(int washerid) {
			this.washerid = washerid;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getEmail() {
			return email;
		}



		public void setEmail(String email) {
			this.email = email;
		}
		
}



