package javaSort;

public class Hano {

	public static void doTower(int n, char from, char inter, char to){
		if(n == 1){
			System.out.println("����1����"+from+"������"+to+"����");
		}else{
			doTower(n-1, from, to, inter);
			System.out.println("����"+n+",��"+from+"������"+to+"����");
			doTower(n-1, inter, from, to);
		}
	}
	public static void main(String[] args) {
		//doTower(3, 'A', 'B', 'C');
		doSecond(3, 'A', 'B', 'C');
	}
	
	
	public static void doSecond(int topN, char from, char middle, char to){
		if(topN == 1){
			System.out.println("����1����"+from+"�����ƶ���"+to+"����");
		}else{
			doSecond(topN-1,from,to,middle);
			System.out.println("����"+topN+"��"+from+"�������ƶ���"+to+"����");
			doSecond(topN-1,middle, from, to);
		}
		
	}

}
