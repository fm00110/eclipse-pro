package test;

public class UpOrLe {

	public static void main(String[] args) {
		String s = "ddgsDDGS";
		System.out.println(UpOrLe.change(s));
	}
	
	public static String change(String s) {
		char[] c = new char[s.length()];
		for (int i = 0;i<s.length();i++) {
			c[i] = s.charAt(i);
		}
		System.out.println(c);
	
		for(int i = 0;i<c.length;i++) {
			if(c[i] >= 'a' && c[i] <= 'z') {
				c[i] = (char) (c[i] - 32);
			}
			else if(c[i] >= 'A' && c[i] <= 'Z') {
				c[i] = (char) (c[i] + 32);
			}
		}
		return String.valueOf(c);
	}
}
