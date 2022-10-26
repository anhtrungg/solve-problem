package fpt.test.oop.models;

import java.util.UUID;

public abstract class Thing {
	
	public UUID SerialNumber;
	
	public String Name;
	
	public String Type;
	
	public Thing() {}
	
	public Thing(UUID serialNumber, String name, String type) {
		SerialNumber = serialNumber;
		Name = name;
		Type = type;
	}

	public abstract String getDescription();

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public UUID getSerialNumber() {
		return SerialNumber;
	}

	public String getType() {
		return Type;
	}
}
