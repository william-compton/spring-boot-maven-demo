package com.example.demo;

import java.util.UUID;
//coffee class
public class Coffee {
	private final String id;
	private String name;
	
	public Coffee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Coffee(String name) {
		this(UUID.randomUUID().toString(), name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
}
	
	

}
