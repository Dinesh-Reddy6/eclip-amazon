package com.cmr.amazon.entity;


import java.io.Serializable;

public class food implements Serializable{

	
	//@Entity
	//@Table("category")
			private static final long serialVersionUID = 1L;

		//@Id
		//@Generated (strategy = GenerationType.Identity)
		//@Column(name="id" type="int")
		private String id;
		
		//@Column(name=catname type="varchar" ..)
		private String name;
		private String pass;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getname() {
			return name;
		}
		public void setname(String name) {
			this.name = name;
		}
		
		public String getpass() {
			return pass;
		}

		public void setpass(String pass) {
			this.pass = pass;
		}

}
