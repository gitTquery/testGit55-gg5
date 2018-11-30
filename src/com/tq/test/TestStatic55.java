package com.tq.test;

import org.junit.Test;

public class TestStatic55 {
	
	@Test
	public  void testtrhdt(){
		 String tgdsg="drtygGRE过后女人的";
		 System.out.println(tgdsg.length());
	}
	@Test
	public  void testdsrfhrhdt(){
		String  aa="client://go_credentialinfo_page?id=1102018102414301075200&share_user_id=";
		String bb="id=";
	String  ccc=aa.substring(aa.indexOf(bb)+bb.length(), aa.indexOf("&share_user_id="));
		System.out.println(ccc);
		
		
	}
	
}
