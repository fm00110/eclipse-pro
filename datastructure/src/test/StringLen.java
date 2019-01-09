package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class StringLen {

	public static void main(String[] args) {
		String s1 = "sfddsghwugskdjgwuy";
		String s2 = "gddgjuskdjdwwgs";
	
		System.out.println(StringLen.getLen(s1, s2));
		System.out.println(StringLen.getLen2(s1, s2));
	}
	
	public static String getLen(String s1,String s2) {
		String string = new String("");
		boolean b = false;
		if(s2.length() > s1.length()) {
			string = s1;
			s1 = s2;
			s2 = string;
			
		}
		for(int i = s2.length()-1;i>0;i--) {
			for(int j = 0;j<s2.length()-i;j++) {
				if(s1.contains(s2.substring(j, i+j))) {
					string = s2.substring(j,i+j);
					b = true;
					break;
				}
			}
			if(b) {
				break;
			}
		}
		
		return string;
	}
	
	public static ArrayList<String> getLen2(String s1,String s2) {
		String string = new String("");
		ArrayList<String> al = new ArrayList<>();
		if(s2.length() > s1.length()) {
			string = s1;
			s1 = s2;
			s2 = string;
			
		}
		for(int i = s2.length()-1;i>0;i--) {
			for(int j = 0;j<i;j++) {
				if(s1.contains(s2.substring(j, i))) {
					string = s2.substring(j,i);
					al.add(string);
				}
			}
		
		}
		
		return al;
	}
}
