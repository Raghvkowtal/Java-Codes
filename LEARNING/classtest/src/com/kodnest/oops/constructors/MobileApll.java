package com.kodnest.oops.constructors;

public class MobileApll {

	public static void main(String[] args) {
		Mobile mobile = new Mobile("Apple","White",150000);
		System.out.println(mobile.color+" "+mobile.brand+" "+mobile.cost);
		mobile.allowToCall();
		mobile.allowToPlay();
		
		Mobile mobile2 = new Mobile("Samsung","Black",130000);
		System.out.println(mobile2.brand+" "+mobile2.cost+" "+mobile2.color);
		
		Mobile mobile3 = new Mobile("MI", null, 0);
		System.out.println(mobile3.brand+" "+mobile3.cost+" "+mobile3.color);
		
		Mobile mobile4 = new Mobile(null, null, 50000);
		System.out.println(mobile4.brand+" "+mobile4.cost+" "+mobile4.color);
	}

}
