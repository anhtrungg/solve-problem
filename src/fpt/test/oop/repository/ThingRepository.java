package fpt.test.oop.repository;

import java.util.UUID;

import fpt.test.oop.irepository.IThing;
import fpt.test.oop.models.Thing;


public class ThingRepository<T> implements IThing<T>{

	@Override
	public void addItem(T item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkItemName(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String generateItemID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printAllItem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getItemBySerialNumber(UUID serialNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	

}
