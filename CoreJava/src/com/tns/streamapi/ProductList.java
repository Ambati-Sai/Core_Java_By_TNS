package com.tns.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductList {
	public static void main(String[] args) {
		List<Product> productlist = new ArrayList<Product>();
		productlist.add(new Product(1,"hp",25000f));
		productlist.add(new Product(2,"dell",35000f));
		productlist.add(new Product(3,"lenova",20000f));
		List<Float> p1 = productlist.stream().filter(p->p.price>10000).map(p->p.price).collect(Collectors.toList());
		System.out.println(p1);
	}

}
