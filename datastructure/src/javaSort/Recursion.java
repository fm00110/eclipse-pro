package javaSort;

public class Recursion {
	
	public static void main(String[] args) {
		//System.out.println(test2(3));
		//test3();
		test4();
		//System.out.println(test5(20));
		

	}

	public static void test1(int n){
		System.out.print(n+" ");
		if(n == 0){
			return;
		}
		test1(n-1);
	}
	
	public static int test2(int n){
		int total = 0;
		if(n == 1){
			total = 1;
		}
		else{
			total = test2(n-1)+n;
		}
		return total;
		
	}
	public static void test3(){
		for(int i = 1;i<10;i++){
			for(int j = 1;j<=i;j++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	public static void test4(){
		for(int i = 1;i<10;i++){
			for(int j = 1;j<=i;j++){
				System.out.print(i+"*"+j+"="+(i*j)+" ");
			}
			System.out.println();
		}
	}
	public static int test5(int n){
		if(n == 1){
			return 0;
		}else if(n == 2){
			return 1;
		}else{
			return test5(n-1)+test5(n-2);
		}
	}
}
