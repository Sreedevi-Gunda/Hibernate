package shopping.controller;

import java.util.ArrayList;
import java.util.List;

import shopping.dao.CustomerCrud;
import shopping.dao.ProductCrud;
import shopping.dao.ShopCrud;
import shopping.dto.Customer;
import shopping.dto.Product;
import shopping.dto.Shop;
import shopping.dto.Vendor;

public class Main {

	public static void main(String[] args) {
		ShopCrud sc = new ShopCrud();
		//public Shop(int id, String name, String address, List<Product> p) {
//		Vendor v=sc.saveShop(new Shop(1,"sdifooj","jewooifjowj",null));
//		System.out.println(v);
		ProductCrud crud=new ProductCrud();
		
		CustomerCrud crud2=new CustomerCrud();
//		Customer c = curd2.find(1);
		System.out.println(crud.find1(12));
		ArrayList l=new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		ArrayList l1 =new ArrayList();
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l.retainAll(l1);
		System.out.println(l);
//		curd.remove(c);
	}

}