package fpt.test.oop.models;

import java.util.UUID;

public class BookOnTape extends Thing {
	
	public BookOnTape() {this.Type = getType();}
	
	public BookOnTape(UUID serialNumber, String name, String type) {
		super(serialNumber, name, type);
		this.Type = getType();
	}

	public String getType() {
		return "Book On Tape";
	}
	
	@Override
	public String getDescription() {
		
		return "Description: |SerialNumber: " + SerialNumber + " |Name: " + Name + " |Type: " + Type;
	}
}
