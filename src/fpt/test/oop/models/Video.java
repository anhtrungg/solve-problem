package fpt.test.oop.models;

import java.util.UUID;

public class Video extends Thing{
	
	public Video() {this.Type = getType();}
	
	public Video(UUID serialNumber, String name, String type) {
		super(serialNumber, name, type);
		this.Type = getType();
	}

	public String getType() {
		return "Video";
	}
	
	@Override
	public String getDescription() {
		
		return "Description: |SerialNumber: " + SerialNumber + " |Name: " + Name + " |Type: " + Type;
	}
	
}
