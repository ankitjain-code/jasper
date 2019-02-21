package com.jasper.ankit.jasper.home;

import java.util.ArrayList;
import java.util.List;

public class FactoryClass {

	public static List<BeanClass> fillData() {

		List<BeanClass> list = new ArrayList<>();
		BeanClass bean = new BeanClass();
		
		bean.setName("mango9999");
		bean.setPrice(1099);
		
		
		BeanClass bean2 = new BeanClass();
		bean2.setName("apple");
		bean2.setPrice(2000);
		
		list.add(bean);
		list.add(bean2);
		
		return list;

	}

}
