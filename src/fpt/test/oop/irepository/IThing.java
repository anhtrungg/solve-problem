package fpt.test.oop.irepository;

import java.util.UUID;
import fpt.test.oop.models.Thing;

public interface IThing<T> {
	public void addItem(T item);
    public boolean checkItemName(String name);
    public String generateItemID();
    public void printAllItem();
    public T getItemBySerialNumber(UUID serialNumber);
}
