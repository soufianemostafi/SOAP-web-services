package Client;

import java.rmi.RemoteException;

import webservices.Product;
import webservices.ProductsManagerProxy;
public class Client {

	public static void main(String[] args) throws RemoteException  {

		ProductsManagerProxy proxy = new ProductsManagerProxy();

		Product product1= new Product((long) 10,"Cheese",1.0);
		Product product2= new Product((long) 20,"Milk",3.5);
		Product product3= new Product((long) 30,"Chocolate",10.0);
		
		proxy.addProduct(product1);
		proxy.addProduct(product2);
		proxy.addProduct(product3);
		
		System.out.println("Product's list:");

		for (int i=0; i<proxy.getProducts().length; i++) {
			System.out.println("***********************");
			System.out.println("Product's id:"+proxy.getProducts()[i].getId());
			System.out.println("Product's type:"+proxy.getProducts()[i].getLabel());
			System.out.println("Product's price:"+proxy.getProducts()[i].getPrice());
		}
		System.out.println("********************************************************");
		 
		proxy.deleteProduct(30);
		System.out.println("Product deleted");
		
		System.out.println("Product's list:");
		for (int i=0; i<proxy.getProducts().length; i++) {
			System.out.println("***********************");
			System.out.println("Product's id:"+proxy.getProducts()[i].getId());
			System.out.println("Product's type:"+proxy.getProducts()[i].getLabel());
			System.out.println("Product's price:"+proxy.getProducts()[i].getPrice());
		}
		System.out.println("********************************************************");
	}

}