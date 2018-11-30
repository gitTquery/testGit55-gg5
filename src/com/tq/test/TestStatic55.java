package com.tq.test;

import org.junit.Test;

public class TestStatic55 {
	
	@Test
	public  void testtrhdt(){
		System.out.println("===ÖÇÕÏtq110=======>WenSenTe563333");
		String  strgg="http://testweb.5u51.cn/1030762/gift_change/1102018102414301075200.html?action=2&shareUserId=10400059&sid=4cbe8d4b-bcaf-4953-b6d6-67ac09a68429 ";
		String  aa="shareUserId=";
		System.out.println(strgg.substring(strgg.indexOf(aa)+aa.length(),strgg.indexOf("&sid=") ));;
		
		String  url="a5u51tzqdz://a5u51/gogiftchangepage?gift_change_url=http://testweb.5u51.cn/1030762/gift_change/1102018102414301075200.html?action=2&shareUserId=10400059 ";
				String  str="gift_change_url=";
				String ggg=url.substring(url.indexOf(str)+str.length(), url.length());
				System.out.println(ggg);
	}
	@Test
	public  void testdsrfhrhdt(){
		String  aa="client://go_credentialinfo_page?id=1102018102414301075200&share_user_id=";
		String bb="id=";
	String  ccc=aa.substring(aa.indexOf(bb)+bb.length(), aa.indexOf("&share_user_id="));
		System.out.println(ccc);
		
		
	}
	
}
