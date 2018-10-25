package com.tq.test;

import org.junit.Test;

public class TestStatic55 {
	
	@Test
	public  void testtrhdt(){
		
		String  url="a5u51tzqdz://a5u51/gogiftchangepage?gift_change_url=http://testweb.5u51.cn/1030762/gift_change/1102018102414301075200.html?action=2&shareUserId=10400059 ";
				String  str="gift_change_url=";
				String ggg=url.substring(url.indexOf(str)+str.length(), url.length());
				System.out.println(ggg);
	}
	
}
