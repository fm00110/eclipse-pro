package test;

public class Multi {

	public static void main(String[] args) {
		String s1 = "1234567";
		System.out.println(s1.substring(0, 13));
		
	}
	
	public static void mul(String s1,String s2) {
		if(s1.charAt(0) == 0 || s2.charAt(0) == 0) {
			System.out.println("您输入的数字有误，请重新输入！");
		}
		
	}
}
