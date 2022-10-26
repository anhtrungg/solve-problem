package fpt.test.oop.models;

import java.util.UUID;

public class Furniture extends Thing {
	
	public Furniture() {this.Type = getType();}
	
	public Furniture(UUID serialNumber, String name, String type) {
		super(serialNumber, name, type);
		this.Type = getType();
	}

	public String getType() {
		return "Furniture";
	}
	
	@Override
	public String getDescription() {
		
		return "Description: |SerialNumber: " + SerialNumber + " |Name: " + Name + " |Type: " + Type;
	}
}
