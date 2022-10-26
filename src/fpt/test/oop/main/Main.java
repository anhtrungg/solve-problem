package fpt.test.oop.main;

import java.util.Scanner;

import fpt.test.oop.models.Video;

public class Main {

	public static void getMenu()
	{
		System.out.println("*** Lookup Program for Rudy's Rental System (RRS) ***");
		System.out.println("1. Input a new product to the RRS.");
        System.out.println("2. Show all products at RRS");
        System.out.println("3. Find product by serial number at RRS");
        System.out.println("4. Exit");
        System.out.print("Seclect your choice: ");
	}
	
	public static void main(String[] args) {
		
//		Scanner in = new Scanner(System.in);
		
		//do {
			getMenu();
			
//            int choice = Integer.parseInt(in.nextLine());
            
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter name: ");
//                    String name = in.nextLine();
//                    System.out.print("Enter price: ");
//                    double price = Double.parseDouble(in.nextLine());
//                    p.addProduct(new Product(p.generateProductID(), name, price));
//                    break;
//                case 2:
//                    System.out.print("Enter product id: ");
//                    String id = in.nextLine();
//                    if (!p.checkProductId(id)) {
//                        System.out.print("Enter new price: ");
//                        double newPrice = Double.parseDouble(in.nextLine());
//                        p.updatePrice(id, newPrice);
//                    } else {
//                        System.out.println("Not found id!!!");
//                    }
//                    break;
//                case 3:
//                    p.print();
//                    break;
//                case 4:
//                    o.addOrder((Store) p);
//                    break;
//                case 5:
//                    System.out.print("Enter customer Id: ");
//                    String orderId = in.nextLine();
//                    if (!o.checkOrderId(orderId)) {
//                        o.printByOrderId((Store) p, orderId);
//                    } else {
//                        System.out.println("Not found order id!!!");
//                    }
//                    break;
//                case 6:
//                    p.sortByPrice();
//                    p.print();
//                    break;
//                case 7:
//                    System.out.print("Enter customer Id: ");
//                    String customerId = in.nextLine();
//                    if (!o.checkCustomerId(customerId)) {
//                        o.printByCustomerId((Store) p, customerId);
//                    } else {
//                        System.out.println("Not found customer id!!!");
//                    }
//                    break;
//                case 8:
//                    o.print();
//                    break;
//                case 9:
//                    return;
//            }
   //     } while (true);
	}

}
