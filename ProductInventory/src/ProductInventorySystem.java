import java.util.Scanner;

import Entity.Product;
import Exception.ProductNotFoundException;
import Servie.ProductServiceImpl;

public class ProductInventorySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ProductServiceImpl service=new ProductServiceImpl();
		int choice=0;
		
		
		do {
			System.out.println("1.getAll\n2.Seach\n3.addnew\n5.exit");
			choice=sc.nextInt();
			switch(choice) {
			case 1:{
				for(Product pro : service.getAllProducts()) {
					System.out.println(pro);
				}
				break;
			}
			case 2:{
				System.out.println("type productid");
				int proId=sc.nextInt();
				try {
					service.searchproduct(proId);
				} catch (ProductNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 3:{
				System.out.println("Enter productid");
				int proId=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter prduct name:");
				String proName=sc.nextLine();
				
				System.out.println("Enter category:");
				String category=sc.nextLine();
				
				System.out.println("Enter price:");
				float price=sc.nextFloat();
				System.out.println("Enter stockcount:");
				int stcokCount=sc.nextInt();
				Product p=new Product(proId,proName,category,price,stcokCount);
				
				break;
				
			}
			
				
			}
		}
			
		
		while(choice!=5);
	}

}
